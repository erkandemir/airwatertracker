package com.caproject.server;
import java.util.ArrayList;

import com.caproject.protos.WaterInformationRequest;
import com.caproject.protos.WaterInformationResponse;
import com.caproject.protos.WaterPhRequest;
import com.caproject.protos.WaterPhResponse;
import com.caproject.protos.WaterInformationServiceGrpc.WaterInformationServiceImplBase;
import com.caproject.protos.WaterPhInfo;

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
		coliLevel = (constColi  * locationId) / depth;
		drinkablity = 1 / coliLevel ;
		
	
		WaterInformationResponse waterInformationResponse = WaterInformationResponse.newBuilder()
				.setColiLevel(coliLevel)
				.setDrinkability(drinkablity).build();
	
			
		responseObserver.onNext(waterInformationResponse);
		responseObserver.onCompleted();
	}
	
	
	//This method is a Client-Side stream RPC method.
	@Override
	public StreamObserver<WaterPhRequest> getWaterPhValue(StreamObserver<WaterPhResponse> responseObserver) {
		
		ArrayList<WaterPhInfo> phInfoList = new ArrayList<>();
	      
		return new StreamObserver<WaterPhRequest>() {
	        @Override
	        public void onNext(WaterPhRequest request) {
	    		int locationId = request.getLocationId();
	    		int waterType = request.getWaterType();
	    		double phValue = 0;
	    		double drinkablity = 0;
	    		String locationName = "Lake"; 
	    		
	    		if(waterType == 1) {
	    			phValue = locationId * waterType;
	    			drinkablity = phValue * locationId;
	    		}
	    		else {
	    			drinkablity = 0;
	    			phValue = locationId * waterType * 2;
	    			locationName = "Sea";
	    		}
	    		
	    		WaterPhInfo phInfo = WaterPhInfo.newBuilder()
	    				.setWaterSupply("Lake" + locationId)
	    				.setPhValue(phValue)
	    				.setDrinkability(drinkablity).build();
	    		
	    		phInfoList.add(phInfo);			
	    			    		
	        }

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				WaterPhResponse waterPhResponse = WaterPhResponse.newBuilder().addAllItems(phInfoList).build();
				responseObserver.onNext(waterPhResponse);
				responseObserver.onCompleted();
			}
	    };
	}

}
