package com.caproject.server;

import com.caproject.protos.ActivateFilterRequest;
import com.caproject.protos.ActivateFilterResponse;
import com.caproject.protos.AirInfoRequest;
import com.caproject.protos.AirInfoResponse;
import com.caproject.protos.AirInformationServiceGrpc.AirInformationServiceImplBase;

import io.grpc.stub.StreamObserver;

public class AirInformationServiceImpl extends AirInformationServiceImplBase {
	
	@Override
	public void getCarbonMonoxideLevel(AirInfoRequest request, StreamObserver<AirInfoResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.getCarbonMonoxideLevel(request, responseObserver);
	}
	

	@Override
	public void activateFilter(ActivateFilterRequest request, StreamObserver<ActivateFilterResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.activateFilter(request, responseObserver);
	}
	

}
