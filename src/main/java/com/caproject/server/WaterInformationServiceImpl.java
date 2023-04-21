package com.caproject.server;
import com.caproject.protos.WaterInformationRequest;
import com.caproject.protos.WaterInformationResponse;
import com.caproject.protos.WaterPhRequest;
import com.caproject.protos.WaterPhResponse;
import com.caproject.protos.WaterInformationServiceGrpc.WaterInformationServiceImplBase;

import io.grpc.stub.StreamObserver;

public class WaterInformationServiceImpl extends WaterInformationServiceImplBase {
	
	//This method is a Simple RPC method.
	@Override
	public void getWaterInformation(WaterInformationRequest request,
			StreamObserver<WaterInformationResponse> responseObserver) {
		int locationId = request.getLocationId();
		int depth = request.getDepth();
		
		double constColi = 0.3;
		double coliLevel= 0;
		double drinkablity = 0;
		coliLevel = constColi * depth * locationId;
		drinkablity = coliLevel / locationId;
		
	
		WaterInformationResponse waterInformationResponse = WaterInformationResponse.newBuilder()
				.setColiLevel(coliLevel)
				.setDrinkability(drinkablity).build();
	
			
		responseObserver.onNext(waterInformationResponse);
		responseObserver.onCompleted();
	}
	
	
	//This method is a Client-Side stream RPC method.
	@Override
	public StreamObserver<WaterPhRequest> getWaterPhValue(StreamObserver<WaterPhResponse> responseObserver) {
		// TODO Auto-generated method stub
		return new StreamObserver<WaterPhRequest>() {
			WaterPhResponse waterPhResponse;
	        @Override
	        public void onNext(WaterPhRequest request) {
	    		int locationId = request.getLocationId();
	    		int waterType = request.getWaterType();
	    		double phValue = 0;
	    		double drinkablity = 0;
	    		
	    		if(waterType == 2) {
	    			phValue = locationId * waterType;
	    			drinkablity = phValue * locationId;
	    		}
	    		else {
	    			drinkablity = 0;
	    			phValue = locationId * waterType * 2;
	    		}
	    			
	    			
	    		waterPhResponse = WaterPhResponse.newBuilder()
	        			.setDrinkability(drinkablity)
	        			.setPhValue(phValue).build();
	   
	    		
	        }

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(waterPhResponse);
				responseObserver.onCompleted();
			}
	    };
	}

}
