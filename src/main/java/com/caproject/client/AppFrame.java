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
        rowAirInformation.setLayout(new BoxLayout(rowAirInformation, BoxLayout.Y_AXIS));
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
        rowWaterInformation.setLayout(new BoxLayout(rowWaterInformation, BoxLayout.Y_AXIS));
        rowWaterInformation.add(new JLabel("Water Information Service"));
        
        JPanel waterInformationPanel = new JPanel();
        waterInformationPanel.setLayout(new BoxLayout(waterInformationPanel, BoxLayout.X_AXIS));
        
        JPanel waterInformationLeftPanel = new JPanel();
        JPanel waterInformationRightPanel = new JPanel();
        
        waterInformationPanel.add(waterInformationLeftPanel);
        waterInformationPanel.add(waterInformationRightPanel);
        waterInformationLeftPanel.setLayout(new BoxLayout(waterInformationLeftPanel, BoxLayout.Y_AXIS));

        // Location Panel
        JPanel waterPanelLocation = new JPanel(new FlowLayout(FlowLayout.LEFT));
        waterPanelLocation.setLayout(new BoxLayout(waterPanelLocation, BoxLayout.X_AXIS));
        
        String[] lItems = {"Wiclow Lake", "Cork Lake", "Dublin River", "Limerick River"};
        JComboBox<String> waterLocations = new JComboBox<>(lItems);
        waterLocations.setSelectedIndex(0);
        waterPanelLocation.add(new JLabel("Locations: "));
        waterPanelLocation.add(waterLocations);
        
        
        waterInformationLeftPanel.add(waterPanelLocation);
        JButton btnGetWaterInformation = new JButton("Show Water Information");
        
        
        //Depth Panel
        JPanel waterPanelDepth = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField depthTextInput = new JTextField(15);
        
        waterPanelDepth.add(new JLabel("Depth Value: "));
        waterPanelDepth.add(depthTextInput);
        waterInformationLeftPanel.add(waterPanelDepth);
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPanel.add(btnGetWaterInformation);
        waterInformationLeftPanel.add(btnPanel);
        
        JPanel waterPanelLocation2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        waterPanelLocation2.setLayout(new BoxLayout(waterPanelLocation2, BoxLayout.X_AXIS));
        JRadioButton waterLoc1 = new JRadioButton("South");
        JRadioButton waterLoc2 = new JRadioButton("North");
        JRadioButton waterLoc3 = new JRadioButton("East");
        JRadioButton waterLoc4 = new JRadioButton("West");
        
        waterPanelLocation2.add(new JLabel("Locations: "));
        waterPanelLocation2.add(waterLoc1);
        waterPanelLocation2.add(waterLoc2);
        waterPanelLocation2.add(waterLoc3);
        waterPanelLocation2.add(waterLoc4);
        waterInformationLeftPanel.add(waterPanelLocation2);
        JPanel waterPanelWaterTypePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        waterInformationLeftPanel.add(waterPanelWaterTypePanel);
        String[] items = {"Fresh Water", "Salt Water"};
        JComboBox<String> waterTypeCombo = new JComboBox<>(items);
        waterTypeCombo.setSelectedIndex(0);
        
        waterPanelWaterTypePanel.add(new JLabel("Water Type: "));
        waterPanelWaterTypePanel.add(waterTypeCombo);
        
        
        //Function Panel
        JPanel 	waterInformationFunctionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnGetWaterPhValue = new JButton("Show Water Ph Value");
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
        		int locationId = waterLocations.getSelectedIndex() + 1;
                ArrayList<Integer> locationList = new ArrayList<Integer>();
    			
				if(!depthTextInput.getText().equals("")) {
				 String responseText =	AirWaterTrackerClient.GetWaterInformation(locationId,
																Integer.parseInt(depthTextInput.getText()));
				 waterTextArea.setText(responseText); 
				}
				
    	     
    		}
    	}); 
        
        btnGetWaterPhValue.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){
                ArrayList<Integer> locationList = new ArrayList<Integer>();
                int waterType = 1;
        		
    			if(waterLoc1.isSelected()) {
    				locationList.add(1);
    			}
    			if(waterLoc2.isSelected()) {
    				locationList.add(2);
    			}
    			if(waterLoc3.isSelected()) { 
    				locationList.add(3);
    			}		
    			if(waterLoc4.isSelected()) { 
    				locationList.add(4);
    			}			
    	         
    			//water type selection 
    			waterType = waterTypeCombo.getSelectedIndex() + 1;
    				
    			IRpcCompleteEventListener listener = new IRpcCompleteEventListener() {
					
					@Override
					public void isRpcComplate(String message) {
						waterTextArea.setText(message);
						
					}
					
					@Override
					public void isError() {
						System.out.println("An error occured");
						// TODO Auto-generated method stub
						
					}
				};
    			 
    			try {
					AirWaterTrackerClient.GetWaterPhValue(locationList, waterType, listener);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	     
    		}
    	});  
        
        
        
        // Radiation Information Service Row -------------------------------------
        
        
        JPanel rowRadiationInformation = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rowRadiationInformation.setLayout(new BoxLayout(rowRadiationInformation, BoxLayout.Y_AXIS));
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
        String[] typeItems = {"Air", "Water", "Ground"};
        JComboBox<String> locationCombo = new JComboBox<>(typeItems);
        locationCombo.setSelectedIndex(0);
        radiationPanelLocation.add(new JLabel("Locations :"));
        radiationPanelLocation.add(locationCombo);
        
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
         		locationId = locationCombo.getSelectedIndex() + 1;
         		System.out.println(locationId);
    			IRpcCompleteEventListener listener = new IRpcCompleteEventListener() {
					
					@Override
					public void isRpcComplate(String message) {
						radiationTextArea.setText(message);
						
					}
					
					@Override
					public void isError() {
						System.out.println("An error occured");		
					}
				};
				
				AirWaterTrackerClient.GetRadiationLevel(locationId, listener);
				
    		}
    	}); 
        
        
        // Add all in main panel
        
        mainPanel.add(rowAirInformation);
        mainPanel.add(rowWaterInformation);
        mainPanel.add(rowRadiationInformation);
        
        
        rowAirInformation.setBackground(Color.LIGHT_GRAY);
        rowWaterInformation.setBackground(Color.LIGHT_GRAY);
        rowRadiationInformation.setBackground(Color.LIGHT_GRAY);
        
        add(mainPanel);

        
        // Set the frame to be visible
        setVisible(false);
	} 
	


}
