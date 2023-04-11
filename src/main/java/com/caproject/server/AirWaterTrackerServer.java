package com.caproject.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AirWaterTrackerServer {
	public static void main(String[] args) {
		LoginServiceImpl loginService = new LoginServiceImpl();
		int port = 50051;
		try {
			Server server = ServerBuilder.forPort(port).addService(loginService).build().start();
			System.out.println("Server Started, listening on : " + port + " port ");
			server.awaitTermination();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
