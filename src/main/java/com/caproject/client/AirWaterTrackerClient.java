package com.caproject.client;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import com.caproject.protos.LoginServiceGrpc.LoginServiceBlockingStub;
import com.caproject.protos.LogoutRequest;
import com.caproject.protos.LogoutResponse;
import com.caproject.protos.RadiationInformationServiceGrpc;
import com.caproject.protos.RadiationInformationServiceGrpc.RadiationInformationServiceStub;
import com.caproject.protos.UserInfoRequest;
import com.caproject.protos.UserInfoResponse;
import com.caproject.protos.WaterInformationRequest;
import com.caproject.protos.WaterInformationResponse;
import com.caproject.protos.WaterInformationServiceGrpc;
import com.caproject.protos.WaterInformationServiceGrpc.WaterInformationServiceBlockingStub;
import com.caproject.protos.WaterInformationServiceGrpc.WaterInformationServiceStub;
import com.caproject.protos.AirInfoRequest;
import com.caproject.protos.AirInfoResponse;
import com.caproject.protos.ActivateFilterRequest;
import com.caproject.protos.ActivateFilterResponse;
import com.caproject.protos.AirInformationServiceGrpc;
import com.caproject.protos.AirInformationServiceGrpc.AirInformationServiceStub;
import com.caproject.protos.LoginRequest;
import com.caproject.protos.LoginResponse;
import com.caproject.protos.LoginServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;



public class AirWaterTrackerClient {
	
	public static IRpcCompleteEventListener completeEventListener; 
	public static LoginServiceBlockingStub loginServiceBlockingstub;
	public static AirInformationServiceStub airInfoServiceStub;
	public static WaterInformationServiceStub waterInfoServiceStub;
	public static WaterInformationServiceBlockingStub waterInfoServiceBlockingStub;
	public static RadiationInformationServiceStub radiationInfoServiceStub;
	private static String host;
	private static int port;
	
	//Main 
	public static void main(String[] args) throws InterruptedException {

		String airWaterTracker_service_type = "_airwater._tcp.local.";
		
		//discoverServer(airWaterTracker_service_type);
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
		
		loginServiceBlockingstub = LoginServiceGrpc.newBlockingStub(channel);
		airInfoServiceStub = AirInformationServiceGrpc.newStub(channel);
		if(airInfoServiceStub == null)
			System.out.println("stub is null");
		
		try {
			if(Login("erkan", "123").equals("success"))
			{
				System.out.println("Login Success");
				ShowAuthenticatedUserInfo();
				//GetCarbonMonoxideLevel(new int[] {1, 2,3 });
				
			
				
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
	
	
	//Discover and connect server
	public static void connectToServer()
	{
		discoverServer("_airwater._tcp.local.");
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();
		
		loginServiceBlockingstub = LoginServiceGrpc.newBlockingStub(channel);
		airInfoServiceStub = AirInformationServiceGrpc.newStub(channel);
		waterInfoServiceStub = WaterInformationServiceGrpc.newStub(channel);
		waterInfoServiceBlockingStub = WaterInformationServiceGrpc.newBlockingStub(channel);
		radiationInfoServiceStub = RadiationInformationServiceGrpc.newStub(channel);
	}
	
	public static void connectWithoutDiscoverToServer()
	{
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
		
		loginServiceBlockingstub = LoginServiceGrpc.newBlockingStub(channel);
		airInfoServiceStub = AirInformationServiceGrpc.newStub(channel);
		waterInfoServiceStub = WaterInformationServiceGrpc.newStub(channel);
		waterInfoServiceBlockingStub = WaterInformationServiceGrpc.newBlockingStub(channel);
		radiationInfoServiceStub = RadiationInformationServiceGrpc.newStub(channel);
	}
	

	private static void discoverServer(String service_type) {
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(service_type);			
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("AirWaterTracker Service resolved: " + event.getInfo());

					ServiceInfo airWaterTrackerServerInfo = event.getInfo();

					port = airWaterTrackerServerInfo.getPort();
					host = airWaterTrackerServerInfo.getHostAddresses()[0];
					System.out.println(airWaterTrackerServerInfo.getHostAddresses()[0]);
					System.out.println(airWaterTrackerServerInfo.getPort());
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + airWaterTrackerServerInfo.getNiceTextString());
					System.out.println("\t host: " + airWaterTrackerServerInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("AirWaterTracker Service removed: " + event.getInfo());

					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("AirWaterTracker Service added: " + event.getInfo());

					
				}

			});
			
			// Wait a bit
			Thread.sleep(5000);
			
			jmdns.close();

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	//Login Client Methods 
	public static String Login(String username, String password)
	{
		LoginRequest loginRequest = LoginRequest.newBuilder()
				.setUsername(username)
				.setPassword(password).build();
		LoginResponse loginResponse = loginServiceBlockingstub.login(loginRequest);
		return loginResponse.getTicketId();
		
	}
	
	public static void Logout(String username)
	{
		LogoutRequest logoutRequest = LogoutRequest.newBuilder()
				.setUsername(username).build();
		LogoutResponse logoutResponse = loginServiceBlockingstub.logout(logoutRequest);
		System.out.println("Message received from Server : " + logoutResponse.getMessage());
		
	}
	
	public static void ShowAuthenticatedUserInfo()
	{
		UserInfoRequest userInfoRequest = UserInfoRequest.newBuilder()
				.setUsername("erkandemir").build();	
		UserInfoResponse userInforResponse = loginServiceBlockingstub.getUserInformation(userInfoRequest);
		
		System.out.println("Message received from Server: " + userInforResponse.getName());
		System.out.println("Message received from Server: " + userInforResponse.getSurname());
	}
	
	
	//AirInformationService Client Methods 
	public static void GetCarbonMonoxideLevel(ArrayList<Integer> locationIds, IRpcCompleteEventListener listener) throws InterruptedException
	{
				
		StreamObserver<AirInfoResponse> responseStreamObserver = new StreamObserver<AirInfoResponse>() {
			String infoResponse = "";	
			@Override
			public void onNext(AirInfoResponse value) {
				infoResponse += "Zone Name: " + value.getZoneName() + "\n";
				infoResponse += "Carbonmonoxide Level: " + value.getCarbonMonoxideLevel()+ "\n";
				infoResponse += "Air Quality: " + value.getAirQualityStatus()+ "\n";
				infoResponse += "----------\n";
			}
			
			@Override
			public void onError(Throwable t) {
				listener.isError();
				
			}
			
			@Override
			public void onCompleted() {
				listener.isRpcComplate(infoResponse);;
			}
		};
		
		StreamObserver<AirInfoRequest> requestStreamObserver = airInfoServiceStub.getCarbonMonoxideLevel(responseStreamObserver);
		
	    try {
	        for (int locationId : locationIds) {
	            AirInfoRequest airInfoRequest = AirInfoRequest.newBuilder()
	    				.setLocationId(locationId).build();	
	            requestStreamObserver.onNext(airInfoRequest);
	            Thread.sleep(1000);
	        }
	    } catch (RuntimeException e) {
	    	responseStreamObserver.onError(e);
	        throw e;
	    }
	    requestStreamObserver.onCompleted();
		
		
	}
	
	public static void ActivateFilter(int locationId, IRpcCompleteEventListener listener)
	{
		System.out.println("Activate Filter Start");
		StreamObserver<ActivateFilterResponse> responseStreamObserver = new StreamObserver<ActivateFilterResponse>() {
			String infoResponse = "";	
			@Override
			public void onNext(ActivateFilterResponse value) {
				System.out.println(value.getFilterId() );
				infoResponse += "Filter Id: " + value.getFilterId() + "\n";
				infoResponse += "Filter Status: " + (value.getFilterStatus() ? "Working" : "Stopped") + "\n";
				infoResponse += "----------\n";
			}
			
			@Override
			public void onError(Throwable t) {
				System.out.println(t.getMessage());
				listener.isError();	
			}
			
			@Override
			public void onCompleted() {
				System.out.println("complete");
				listener.isRpcComplate(infoResponse);
			}
		};
		
		ActivateFilterRequest activateFilterRequest = ActivateFilterRequest.newBuilder()
				.setLocationId(locationId).build();
		
		airInfoServiceStub.activateFilter(activateFilterRequest, responseStreamObserver); 
	}
	
	
	//Water Information Client Methods
	public static String GetWaterInformation(int locationId, int depth)
	{
		WaterInformationRequest waterInfoRequest = WaterInformationRequest.newBuilder()
				.setLocationId(locationId)
				.setDepth(depth).build();
		WaterInformationResponse waterInfoResponse = waterInfoServiceBlockingStub.getWaterInformation(waterInfoRequest);
		
		String responseMessage = "";
		responseMessage += "Coli Level: " + waterInfoResponse.getColiLevel() + "\n";
		responseMessage += "Drinkability: " + waterInfoResponse.getDrinkability();
		return responseMessage;
		
	}

}
