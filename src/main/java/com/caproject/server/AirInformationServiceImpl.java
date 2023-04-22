package com.caproject.server;

import com.caproject.protos.ActivateFilterRequest;
import com.caproject.protos.ActivateFilterResponse;
import com.caproject.protos.AirInfoRequest;
import com.caproject.protos.AirInfoResponse;
import com.caproject.protos.AirInfoResponse.Builder;
import com.caproject.protos.AirInformationServiceGrpc.AirInformationServiceImplBase;

import io.grpc.stub.StreamObserver;

public class AirInformationServiceImpl extends AirInformationServiceImplBase {
	
	
	//The method is characterized as a Bidirectional stream method
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
				responseObserver.onError(t);
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
	    };
	}
		
	//The method is characterized as a Server-Side stream method
	@Override
	public void activateFilter(ActivateFilterRequest request, StreamObserver<ActivateFilterResponse> responseObserver){
    	int locationId = request.getLocationId();
    	
    	if(locationId == 1) {
        	ActivateFilterResponse filterResponse1 = ActivateFilterResponse.newBuilder()
        			.setFilterId(1)
        			.setFilterStatus(true).build();
        	ActivateFilterResponse filterResponse2 = ActivateFilterResponse.newBuilder()
        			.setFilterId(2)
        			.setFilterStatus(false).build();
        	ActivateFilterResponse filterResponse3 = ActivateFilterResponse.newBuilder()
        			.setFilterId(3)
        			.setFilterStatus(true).build();
        	responseObserver.onNext(filterResponse1);
        	responseObserver.onNext(filterResponse2);
        	responseObserver.onNext(filterResponse3);
    	}
    	else if(locationId == 2)
    	{

        	ActivateFilterResponse filterResponse4 = ActivateFilterResponse.newBuilder()
        			.setFilterId(4)
        			.setFilterStatus(true).build();
        	ActivateFilterResponse filterResponse5 = ActivateFilterResponse.newBuilder()
        			.setFilterId(5)
        			.setFilterStatus(false).build();
        	ActivateFilterResponse filterResponse6 = ActivateFilterResponse.newBuilder()
        			.setFilterId(6)
        			.setFilterStatus(false).build();
        	responseObserver.onNext(filterResponse4);
        	responseObserver.onNext(filterResponse5);
        	responseObserver.onNext(filterResponse6);
	        	
    	}
    	else if(locationId == 3)
    	{

        	ActivateFilterResponse filterResponse7 = ActivateFilterResponse.newBuilder()
        			.setFilterId(7)
        			.setFilterStatus(false).build();
        	ActivateFilterResponse filterResponse8 = ActivateFilterResponse.newBuilder()
        			.setFilterId(8)
        			.setFilterStatus(true).build();
        	ActivateFilterResponse filterResponse9 = ActivateFilterResponse.newBuilder()
        			.setFilterId(9)
        			.setFilterStatus(true).build();
        	responseObserver.onNext(filterResponse7);
        	responseObserver.onNext(filterResponse8);
        	responseObserver.onNext(filterResponse9);
        	
	        	
    	}
    	responseObserver.onCompleted();
	    
    }

}
