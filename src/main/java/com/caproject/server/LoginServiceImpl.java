package com.caproject.server;
import com.caproject.service.loginservice.LoginRequest;
import com.caproject.service.loginservice.LoginResponse;
import com.caproject.service.loginservice.LogoutRequest;
import com.caproject.service.loginservice.LogoutResponse;
import com.caproject.service.loginservice.UserInfoRequest;
import com.caproject.service.loginservice.UserInfoResponse;
import com.caproject.service.loginservice.LoginServiceGrpc.LoginServiceImplBase;

import io.grpc.stub.StreamObserver;
public class LoginServiceImpl extends LoginServiceImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.login(request, responseObserver);
	}
	
	@Override
	public void logout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}
	
	@Override
	public void getUserInformation(UserInfoRequest request, StreamObserver<UserInfoResponse> responseObserver) {
		// TODO Auto-generated method stub

		System.out.println("Client user name -- " + request.getUsername());
		
		UserInfoResponse userInfoResponse = UserInfoResponse.newBuilder()
				.setUsername(request.getUsername())
				.setName("Erkan")
				.setSurname("Demir").build();
		
		System.out.println("Server is sending the response -- " + userInfoResponse.getName());
		responseObserver.onNext(userInfoResponse);
		responseObserver.onCompleted();
	}
	

}
