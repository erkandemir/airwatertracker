package com.caproject.client;

import java.util.concurrent.TimeUnit;
import com.caproject.protos.LoginServiceGrpc.LoginServiceBlockingStub;
import com.caproject.protos.LogoutRequest;
import com.caproject.protos.LogoutResponse;
import com.caproject.protos.UserInfoRequest;
import com.caproject.protos.UserInfoResponse;
import com.caproject.protos.LoginRequest;
import com.caproject.protos.LoginResponse;
import com.caproject.protos.LoginServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;



public class AirWaterTrackerClient {
	static String host = "localhost";
	static int port = 50051;
	static ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
	public static LoginServiceBlockingStub blockingstub = LoginServiceGrpc.newBlockingStub(channel);
	public static void main(String[] args) {
		//HelloWorldClient client = new HelloWorldClient();
		
		try {
			if(Login("erkan", "123").equals("success"))
			{
				System.out.println("Login Success");
				ShowAuthenticatedUserInfo();
			}
			else {
				System.out.println("Login Failed");
			}

		} catch (StatusRuntimeException e) {
			System.out.println(e.getStatus());
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

	
	public static String Login(String username, String password)
	{
		LoginRequest loginRequest = LoginRequest.newBuilder()
				.setUsername(username)
				.setPassword(password).build();
		LoginResponse loginResponse = blockingstub.login(loginRequest);
		return loginResponse.getTicketId();
		
	}
	
	public static void Logout(String username)
	{
		LogoutRequest logoutRequest = LogoutRequest.newBuilder()
				.setUsername("erkan").build();
		LogoutResponse logoutResponse = blockingstub.logout(logoutRequest);
		System.out.println("Message received from Server : " + logoutResponse.getMessage());
		
	}
	
	public static void ShowAuthenticatedUserInfo()
	{
		UserInfoRequest userInfoRequest = UserInfoRequest.newBuilder()
				.setUsername("erkandemir").build();	
		UserInfoResponse userInforResponse = blockingstub.getUserInformation(userInfoRequest);
		
		System.out.println("Message received from Server: " + userInforResponse.getName());
		System.out.println("Message received from Server: " + userInforResponse.getSurname());
	}

}
