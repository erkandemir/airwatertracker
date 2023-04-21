package com.caproject.server;

import com.caproject.protos.RadiationLevelRequest;
import com.caproject.protos.RadiationLevelResponse;
import com.caproject.protos.RadiationInformationServiceGrpc.RadiationInformationServiceImplBase;

import io.grpc.stub.StreamObserver;

public class RadiationInformationServiceImpl extends RadiationInformationServiceImplBase {
	
	//This method is a Server-Side stream RPC method.
	@Override
	public void getRadiationLevel(RadiationLevelRequest request, StreamObserver<RadiationLevelResponse> responseObserver) {

		int locationId = request.getLocationId();
		RadiationLevelResponse sensor1Response = RadiationLevelResponse.newBuilder()
				.setSensorId(locationId * 2)
    			.setRadiationLevel(locationId * 0.04)
    			.setRadioactiveType("alpha")
    			.build();
		RadiationLevelResponse sensor2Response = RadiationLevelResponse.newBuilder()
				.setSensorId(locationId * 2)
    			.setRadiationLevel(locationId * 0.04)
    			.setRadioactiveType("beta")
    			.build();
		RadiationLevelResponse sensor3Response = RadiationLevelResponse.newBuilder()
				.setSensorId(locationId * 2)
    			.setRadiationLevel(locationId * 0.04)
    			.setRadioactiveType("neutrons")
    			.build();
		RadiationLevelResponse sensor4Response = RadiationLevelResponse.newBuilder()
				.setSensorId(locationId * 2)
    			.setRadiationLevel(locationId * 0.04)
    			.setRadioactiveType("gamma")
    			.build();
    	responseObserver.onNext(sensor1Response);
    	responseObserver.onNext(sensor2Response);
    	responseObserver.onNext(sensor3Response);
    	responseObserver.onNext(sensor4Response);
    	
    	responseObserver.onCompleted();
	}

}
