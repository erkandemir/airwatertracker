package com.caproject.server;
import com.caproject.protos.LoginRequest;
import com.caproject.protos.LoginResponse;
import com.caproject.protos.LoginResponse.Builder;
import com.caproject.protos.LogoutRequest;
import com.caproject.protos.LogoutResponse;
import com.caproject.protos.UserInfoRequest;
import com.caproject.protos.UserInfoResponse;
import com.caproject.protos.LoginServiceGrpc.LoginServiceImplBase;

import io.grpc.stub.StreamObserver;
public class LoginServiceImpl extends LoginServiceImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		Builder loginResponse = LoginResponse.newBuilder();
		if(request.getUsername() == "erkan" && request.getPassword() == "123") {
			loginResponse.setTicketId("success");
			loginResponse.setUsername(loginResponse.getUsername());
			System.out.println("Server is sending the response login success" );
		}
		else {
			loginResponse.setTicketId("failed");
		}
			
		responseObserver.onNext(loginResponse.build());
		responseObserver.onCompleted();
		
	}
	
	@Override
	public void logout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
		LogoutResponse logoutResponse = LogoutResponse.newBuilder().setMessage("Logout Success").build();
		responseObserver.onNext(logoutResponse);
		responseObserver.onCompleted();
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
