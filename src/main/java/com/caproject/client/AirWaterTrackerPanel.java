package com.caproject.client;

public class AirWaterTrackerPanel {
	
	public static void main(String[] args) {
		
		//Client panel connect to server
		AirWaterTrackerClient.connectWithoutDiscoverToServer();
	    
		LoginFrame loginFrame = new LoginFrame();;
	    AppFrame appFrame  = new AppFrame();
	    
		loginFrame.setEventListener(
	    new IloginButonEventListener() {
			@Override
			public void isLoginSuccess(boolean isSuccess) {
				if(isSuccess) {
					loginFrame.dispose();
					// Application Frame Start
					
					appFrame.pack();
					appFrame.setSize(1000, 800);
					appFrame.setLocationRelativeTo(null);
					appFrame.setVisible(true);
					
				}
				else {
					System.out.println("invalid user");
				}
				
			}
		});
	    loginFrame.pack();
	    loginFrame.setLocationRelativeTo(null);
	    loginFrame.showDialog();
	    
	}


}
