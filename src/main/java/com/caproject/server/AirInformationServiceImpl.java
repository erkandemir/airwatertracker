package com.caproject.server;

import com.caproject.protos.ActivateFilterRequest;
import com.caproject.protos.ActivateFilterResponse;
import com.caproject.protos.AirInfoRequest;
import com.caproject.protos.AirInfoResponse;
import com.caproject.protos.AirInfoResponse.Builder;
import com.caproject.protos.AirInformationServiceGrpc.AirInformationServiceImplBase;

import io.grpc.stub.StreamObserver;

public class AirInformationServiceImpl extends AirInformationServiceImplBase {
	@Override
	public StreamObserver<AirInfoRequest> getCarbonMonoxideLevel(StreamObserver<AirInfoResponse> responseObserver) {	
	    return new StreamObserver<AirInfoRequest>() {
	        @Override
	        public void onNext(AirInfoRequest request) {
	        	Builder airInfoResponse = AirInfoResponse.newBuilder();
	    		int locationId = request.getLocationId();
	    		String zoneName = "";
	    		double carbonMonoxideLevel = 0;
	    		String airQualityStatus = "";
	    		
	    		switch (locationId) {
	    		case 1:
	    			zoneName = "Dublin";
	    			carbonMonoxideLevel = 0.7;
	    			airQualityStatus = "Low";
	    			break;
	    		case 2:
	    			zoneName = "Cork";
	    			carbonMonoxideLevel = 0.5;
	    			airQualityStatus = "Medium";
	    			break;
	    		case 3:
	    			zoneName = "Wiclow";
	    			carbonMonoxideLevel = 0.1;
	    			airQualityStatus = "High";
	    			break;
	    		default:
	    			break;
	    			
	    		}
	    		airInfoResponse.setZoneName(zoneName);
	    		airInfoResponse.setCarbonMonoxideLevel(carbonMonoxideLevel);
	    		airInfoResponse.setAirQualityStatus(airQualityStatus);
	    		responseObserver.onNext(airInfoResponse.build());
	        }

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
	    };
	}
		

	
	

	@Override
	public void activateFilter(ActivateFilterRequest request, StreamObserver<ActivateFilterResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.activateFilter(request, responseObserver);
	}
	
	

}
