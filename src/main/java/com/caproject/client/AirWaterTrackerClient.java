package com.caproject.client;

import java.util.concurrent.TimeUnit;

import com.caproject.protos.LoginRequest;
import com.caproject.protos.LoginResponse;
import com.caproject.protos.LoginServiceGrpc;
import com.caproject.protos.LoginServiceGrpc.LoginServiceBlockingStub;
import com.caproject.protos.UserInfoRequest;
import com.caproject.protos.UserInfoResponse;

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
			Login("erkan", "123");
			System.out.println("--Receiving AirWaterTracker Response from Server--");
			UserInfoRequest userInfoRequest = UserInfoRequest.newBuilder()
					.setUsername("erkandemir").build();
			
			System.out.println("Message sent by the client: " + userInfoRequest.getUsername());
			
			UserInfoResponse userInforResponse = blockingstub.getUserInformation(userInfoRequest);
			
			System.out.println("Message received from Server: " + userInforResponse.getName());
			System.out.println("Message received from Server: " + userInforResponse.getSurname());
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
	
	public static boolean Login(String username, String password)
	{
		LoginRequest loginRequest = LoginRequest.newBuilder()
				.setUsername("erkan")
				.setPassword("123").build();
		LoginResponse loginResponse = blockingstub.login(loginRequest);
		System.out.println("Message received from Server - TicketId : " + loginResponse.getTicketId());
		return true;
		
	}

}
