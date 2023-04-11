package com.caproject.client;

import java.util.concurrent.TimeUnit;

import com.caproject.service.loginservice.LoginServiceGrpc;
import com.caproject.service.loginservice.LoginServiceGrpc.LoginServiceBlockingStub;
import com.caproject.service.loginservice.UserInfoRequest;
import com.caproject.service.loginservice.UserInfoResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class AirWaterTrackerClient {
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50051;
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		LoginServiceBlockingStub blockingstub = LoginServiceGrpc.newBlockingStub(channel);
		//HelloWorldClient client = new HelloWorldClient();
		
		try {
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

}
