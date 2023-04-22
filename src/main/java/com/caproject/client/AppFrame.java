package com.caproject.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AppFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public AppFrame() { 
		// Set main panel ------------------
        setTitle("Air Water Tracker Panel");
        setSize(850, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        

        //Air Information Service Row ----------------------------------
        JPanel rowAirInformation = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rowAirInformation.add(new JLabel("Air Information Service"));
        JPanel airInformationPanel = new JPanel();
        airInformationPanel.setLayout(new BoxLayout(airInformationPanel, BoxLayout.X_AXIS));
        
        JPanel airInformationLeftPanel = new JPanel();
        JPanel airInformationRightPanel = new JPanel();
        
        airInformationPanel.add(airInformationLeftPanel);
        airInformationPanel.add(airInformationRightPanel);
        airInformationLeftPanel.setLayout(new BoxLayout(airInformationLeftPanel, BoxLayout.Y_AXIS));

        // Location Panel
        JPanel panelLocation = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelLocation.setLayout(new BoxLayout(panelLocation, BoxLayout.X_AXIS));
     
        JRadioButton location1 = new JRadioButton("Dublin");
        JRadioButton location2 = new JRadioButton("Wiclow");
        JRadioButton location3 = new JRadioButton("Cork");
        
        panelLocation.add(new JLabel("Locations: "));
        panelLocation.add(location1);
        panelLocation.add(location2);
        panelLocation.add(location3);
        
        airInformationLeftPanel.add(panelLocation);
        
        //Function Panel
        JPanel airInformationFunctionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnGetCarbonMonoxideLvl = new JButton("Show Carbon Monoxide Level");
        JButton btnActivateFilter = new JButton("Activete Filter");
        airInformationFunctionPanel.add(btnGetCarbonMonoxideLvl);
        airInformationFunctionPanel.add(btnActivateFilter);
        airInformationLeftPanel.add(airInformationFunctionPanel);
        
        // TextAreaPanel
        JPanel airInformationMessagePanel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea(12,35);
        textArea.setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane(textArea);
        airInformationMessagePanel.add(scrollPane, BorderLayout.CENTER);
        airInformationRightPanel.add(airInformationMessagePanel);
        
        //Add main Row
        rowAirInformation.add(airInformationPanel);
        
        //Button Functions
        btnGetCarbonMonoxideLvl.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){
                ArrayList<Integer> locationList = new ArrayList<Integer>();
        		
    			if(location1.isSelected()) {
    				locationList.add(1);
    			}
    			if(location2.isSelected()) {
    				locationList.add(2);
    			}
    			if(location3.isSelected()) { 
    				locationList.add(3);
    			}		
    	         
    			IRpcCompleteEventListener listener = new IRpcCompleteEventListener() {
					
					@Override
					public void isRpcComplate(String message) {
						textArea.setText(message);
						
					}
					
					@Override
					public void isError() {
						System.out.println("An error occured");
						// TODO Auto-generated method stub
						
					}
				};
    			 
    			try {
					AirWaterTrackerClient.GetCarbonMonoxideLevel(locationList, listener);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	     
    		}
    	});  
        
        
        btnActivateFilter.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){
        		int locationId = 0;
         		
    			if(location1.isSelected()) {
    				locationId = 1;
    			}
    			if(location2.isSelected()) {
    				locationId = 2;
    			}
    			if(location3.isSelected()) { 
    				locationId = 3;
    			}		
    	         
    			IRpcCompleteEventListener listener = new IRpcCompleteEventListener() {
					
					@Override
					public void isRpcComplate(String message) {
						textArea.setText(message);
						
					}
					
					@Override
					public void isError() {
						System.out.println("An error occured");
						// TODO Auto-generated method stub
						
					}
				};
    			 
    			AirWaterTrackerClient.ActivateFilter(locationId, listener);
    	     
    		}
    	}); 
        
        
        
        // Water Information Service Row -----------------------------
        
        JPanel rowWaterInformation = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rowWaterInformation.add(new JLabel("Water Information Service"));
        
        JPanel waterInformationPanel = new JPanel();
        waterInformationPanel.setLayout(new BoxLayout(waterInformationPanel, BoxLayout.X_AXIS));
        
        JPanel waterInformationLeftPanel = new JPanel();
        JPanel waterInformationRightPanel = new JPanel();
        
        waterInformationPanel.add(waterInformationLeftPanel);
        waterInformationPanel.add(waterInformationRightPanel);
        waterInformationLeftPanel.setLayout(new BoxLayout(waterInformationLeftPanel, BoxLayout.Y_AXIS));

        // Location Panel
        JPanel waterPanelLocation = new JPanel(new FlowLayout(FlowLayout.CENTER));
        waterPanelLocation.setLayout(new BoxLayout(waterPanelLocation, BoxLayout.X_AXIS));
     
        JRadioButton loc1 = new JRadioButton("South");
        JRadioButton loc2 = new JRadioButton("North");
        JRadioButton loc3 = new JRadioButton("West");
        JRadioButton loc4 = new JRadioButton("East");
        
        waterPanelLocation.add(new JLabel("Locations: "));
        waterPanelLocation.add(loc1);
        waterPanelLocation.add(loc2);
        waterPanelLocation.add(loc3);
        waterPanelLocation.add(loc4);
        
        waterInformationLeftPanel.add(waterPanelLocation);
        
        //Depth Panel
        JPanel waterPanelDepth = new JPanel(new FlowLayout());
        
        JTextField depthTextInput = new JTextField(15);
        
        
        waterPanelDepth.add(new JLabel("Depth Value: "));
        waterPanelDepth.add(depthTextInput);
        waterInformationLeftPanel.add(waterPanelDepth);
        
        JPanel waterPanelWaterTypePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JRadioButton type1 = new JRadioButton("Fresh Water");
        JRadioButton type2 = new JRadioButton("Salt Water");
        
        waterInformationLeftPanel.add(waterPanelWaterTypePanel);
        waterPanelWaterTypePanel.add(new JLabel("Water Type: "));
        waterPanelWaterTypePanel.add(type1);
        waterPanelWaterTypePanel.add(type2);
        
        //Function Panel
        JPanel 	waterInformationFunctionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnGetWaterInformation = new JButton("Show Water Information");
        JButton btnGetWaterPhValue = new JButton("Show Water Ph Filter");
        waterInformationFunctionPanel.add(btnGetWaterInformation);
        waterInformationFunctionPanel.add(btnGetWaterPhValue);
        waterInformationLeftPanel.add(waterInformationFunctionPanel);
        
        // TextAreaPanel
        JPanel waterInformationMessagePanel = new JPanel();
        JTextArea waterTextArea = new JTextArea(12,35);
        waterTextArea.setBackground(Color.white);
        JScrollPane waterScrollPane = new JScrollPane(waterTextArea);
        waterInformationMessagePanel.add(waterScrollPane, BorderLayout.CENTER);
        waterInformationRightPanel.add(waterInformationMessagePanel);
        
        
        
        rowWaterInformation.add(waterInformationPanel);
        
        
        btnGetWaterInformation.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){
                ArrayList<Integer> locationList = new ArrayList<Integer>();
        		
    			if(location1.isSelected()) {
    				locationList.add(1);
    			}
    			if(location2.isSelected()) {
    				locationList.add(2);
    			}
    			if(location3.isSelected()) { 
    				locationList.add(3);
    			}		
    	         
    			IRpcCompleteEventListener listener = new IRpcCompleteEventListener() {
					
					@Override
					public void isRpcComplate(String message) {
						textArea.setText(message);
						
					}
					
					@Override
					public void isError() {
						System.out.println("An error occured");
						// TODO Auto-generated method stub
						
					}
				};
    			 
    			try {
					AirWaterTrackerClient.GetCarbonMonoxideLevel(locationList, listener);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	     
    		}
    	}); 
        
        
        
        
        // Radiation Information Service Row -------------------------------------
        
        
        JPanel rowRadiationInformation = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rowRadiationInformation.add(new JLabel("Radiation Information Service"));
        
        JPanel radiationInformationPanel = new JPanel();
        radiationInformationPanel.setLayout(new BoxLayout(radiationInformationPanel, BoxLayout.X_AXIS));
        
        JPanel radiationInformationLeftPanel = new JPanel();
        JPanel radiationInformationRightPanel = new JPanel();
        
        radiationInformationPanel.add(radiationInformationLeftPanel);
        radiationInformationPanel.add(radiationInformationRightPanel);
        radiationInformationLeftPanel.setLayout(new BoxLayout(radiationInformationLeftPanel, BoxLayout.Y_AXIS));
        

        // Location Panel
        JPanel radiationPanelLocation = new JPanel(new FlowLayout(FlowLayout.CENTER));
        radiationPanelLocation.setLayout(new BoxLayout(radiationPanelLocation, BoxLayout.X_AXIS));
     
        JRadioButton loca1 = new JRadioButton("Air");
        JRadioButton loca2 = new JRadioButton("Water");
        JRadioButton loca3 = new JRadioButton("Grand");
        
        radiationPanelLocation.add(new JLabel("Locations :"));
        radiationPanelLocation.add(loca1);
        radiationPanelLocation.add(loca2);
        radiationPanelLocation.add(loca3);
        
        radiationInformationLeftPanel.add(radiationPanelLocation);
        
        //Function Panel
        JPanel 	radiationInformationFunctionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnGetRadiationInformation = new JButton("Show Radiation Information");
        radiationInformationFunctionPanel.add(btnGetRadiationInformation);
        radiationInformationLeftPanel.add(radiationInformationFunctionPanel);
        
        // TextAreaPanel
        JPanel radiationInformationMessagePanel = new JPanel();
        JTextArea radiationTextArea = new JTextArea(12,40);
        textArea.setBackground(Color.white);
        JScrollPane radiationScrollPane = new JScrollPane(radiationTextArea);
        radiationInformationMessagePanel.add(radiationScrollPane, BorderLayout.CENTER);
        radiationInformationRightPanel.add(radiationInformationMessagePanel);
        
        //Add to main Row
        rowRadiationInformation.add(radiationInformationPanel);
        
        
        
        btnGetRadiationInformation.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){
        		int locationId = 0;
         		
    			if(loca1.isSelected()) {
    				locationId = 1;
    			}
    			if(loca2.isSelected()) {
    				locationId = 2;
    			}
    			if(loca3.isSelected()) { 
    				locationId = 3;
    			}		
    	         
    			IRpcCompleteEventListener listener = new IRpcCompleteEventListener() {
					
					@Override
					public void isRpcComplate(String message) {
						radiationTextArea.setText(message);
						
					}
					
					@Override
					public void isError() {
						System.out.println("An error occured");
						// TODO Auto-generated method stub
						
					}
				};
    			 
    			//AirWaterTrackerClient
    	     
    		}
    	}); 
        
        
        // Add all in main panel
        
        mainPanel.add(rowAirInformation);
        mainPanel.add(rowWaterInformation);
        mainPanel.add(rowRadiationInformation);
        
        
        rowAirInformation.setBackground(Color.ORANGE);
        rowWaterInformation.setBackground(Color.BLUE);
        rowRadiationInformation.setBackground(Color.LIGHT_GRAY);
        
        add(mainPanel);

        
        // Set the frame to be visible
        setVisible(true);
	} 
	


}
