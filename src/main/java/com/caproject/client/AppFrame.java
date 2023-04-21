package com.caproject.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AppFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public AppFrame() { 
		 // Set the title of the frame
        setTitle("Air Water Tracker Panel");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));

        //Air Information Service Row ----------------------------------
        JPanel rowAirInformation = new JPanel(new GridLayout(1, 1));
        JPanel airInformationPanel = new JPanel(new BorderLayout());
        
        JPanel airInformationLeftPanel = new JPanel();
        JPanel airInformationRightPanel = new JPanel(new BorderLayout());
        
        airInformationPanel.add(airInformationLeftPanel);
        airInformationPanel.add(airInformationRightPanel);

        // Location Panel
        JPanel panelLocation = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelLocation.setLayout(new BoxLayout(panelLocation, BoxLayout.X_AXIS));
     
        JRadioButton location1 = new JRadioButton("Dublin");
        JRadioButton location2 = new JRadioButton("Wiclow");
        JRadioButton location3 = new JRadioButton("Cork");
        
        panelLocation.add(new JLabel("Locations :"));
        panelLocation.add(location1);
        panelLocation.add(location2);
        panelLocation.add(location3);
        
        airInformationLeftPanel.add(panelLocation);
        
        //Function Panel
        JPanel airInformationFunctionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnGetCarbonMonoxideLvl = new JButton("Show Carbon Monoxide Level");
        JButton btnActivateFilter = new JButton("Activete Filter");
        airInformationFunctionPanel.add(btnGetCarbonMonoxideLvl);
        airInformationFunctionPanel.add(btnActivateFilter);
        airInformationLeftPanel.add(airInformationFunctionPanel);
        
        // TextAreaPanel
        JPanel airInformationMessagePanel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea("Message:");
        textArea.setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane(textArea);
        airInformationMessagePanel.add(scrollPane, BorderLayout.CENTER);
        airInformationRightPanel.add(airInformationMessagePanel);
        
        
        //rowAirInformation.add(new JLabel("Air Information Service"));
        rowAirInformation.add(airInformationLeftPanel);
        rowAirInformation.add(airInformationRightPanel);
       
  
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
        
        JPanel rowWaterInformation = new JPanel(new GridLayout(1, 1));
        //rowWaterInformation.add(new JLabel("Water Information Service"));
        JPanel waterInformationPanel = new JPanel(new BorderLayout());
        
        JPanel waterInformationLeftPanel = new JPanel();
        JPanel waterInformationRightPanel = new JPanel(new BorderLayout());
        
        waterInformationPanel.add(waterInformationLeftPanel);
        waterInformationPanel.add(waterInformationRightPanel);

        // Location Panel
        JPanel waterPanelLocation = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelLocation.setLayout(new BoxLayout(panelLocation, BoxLayout.X_AXIS));
     
        JRadioButton loc1 = new JRadioButton("Dublin");
        JRadioButton loc2 = new JRadioButton("Wiclow");
        JRadioButton loc3 = new JRadioButton("Cork");
        
        waterPanelLocation.add(new JLabel("Locations :"));
        waterPanelLocation.add(loc1);
        waterPanelLocation.add(loc2);
        waterPanelLocation.add(loc3);
        
        waterInformationLeftPanel.add(waterPanelLocation);
        
        //Function Panel
        JPanel 	waterInformationFunctionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnGetWaterInformation = new JButton("Show Water Information");
        JButton btnGetWaterPhValue = new JButton("Show Water Ph Filter");
        waterInformationFunctionPanel.add(btnGetWaterInformation);
        waterInformationFunctionPanel.add(btnGetWaterPhValue);
        waterInformationLeftPanel.add(waterInformationFunctionPanel);
        
        // TextAreaPanel
        JPanel waterInformationMessagePanel = new JPanel(new BorderLayout());
        JTextArea waterTextArea = new JTextArea("Message:");
        textArea.setBackground(Color.white);
        JScrollPane waterScrollPane = new JScrollPane(waterTextArea);
        waterInformationMessagePanel.add(waterScrollPane, BorderLayout.CENTER);
        waterInformationRightPanel.add(waterInformationMessagePanel);
        
        
        //rowAirInformation.add(new JLabel("Air Information Service"));
        rowWaterInformation.add(waterInformationLeftPanel);
        rowWaterInformation.add(waterInformationRightPanel);
        
        
        
        
        
        
        // Radiation Information Service Row -------------------------------------
        JPanel rowRadiationInformation = new JPanel(new GridLayout(1, 1));
        //rowradiationInformation.add(new JLabel("radiation Information Service"));
        JPanel radiationInformationPanel = new JPanel(new BorderLayout());
        
        JPanel radiationInformationLeftPanel = new JPanel();
        JPanel radiationInformationRightPanel = new JPanel(new BorderLayout());
        
        radiationInformationPanel.add(radiationInformationLeftPanel);
        radiationInformationPanel.add(radiationInformationRightPanel);

        // Location Panel
        JPanel radiationPanelLocation = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelLocation.setLayout(new BoxLayout(panelLocation, BoxLayout.X_AXIS));
     
        JRadioButton loca1 = new JRadioButton("Air");
        JRadioButton loca2 = new JRadioButton("Water");
        JRadioButton loca3 = new JRadioButton("Grand");
        
        radiationPanelLocation.add(new JLabel("Locations :"));
        radiationPanelLocation.add(loca1);
        radiationPanelLocation.add(loca2);
        radiationPanelLocation.add(loca3);
        
        radiationInformationLeftPanel.add(radiationPanelLocation);
        
        //Function Panel
        JPanel 	radiationInformationFunctionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnGetRadiationInformation = new JButton("Show radiation Information");
        radiationInformationFunctionPanel.add(btnGetRadiationInformation);
        radiationInformationLeftPanel.add(radiationInformationFunctionPanel);
        
        // TextAreaPanel
        JPanel radiationInformationMessagePanel = new JPanel(new BorderLayout());
        JTextArea radiationTextArea = new JTextArea("Message:");
        textArea.setBackground(Color.white);
        JScrollPane radiationScrollPane = new JScrollPane(radiationTextArea);
        radiationInformationMessagePanel.add(radiationScrollPane, BorderLayout.CENTER);
        radiationInformationRightPanel.add(radiationInformationMessagePanel);
        
        
        //rowAirInformation.add(new JLabel("Air Information Service"));
        rowRadiationInformation.add(radiationInformationLeftPanel);
        rowRadiationInformation.add(radiationInformationRightPanel);
        
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
        
        //rowRadiationInformation.add(new JLabel("Radiation Information Service"));
        
        

        // Add all in main panel
        mainPanel.add(rowAirInformation);
        mainPanel.add(new JSeparator());
        mainPanel.add(rowWaterInformation);
        mainPanel.add(new JSeparator());
        mainPanel.add(rowRadiationInformation);
        
        
        add(mainPanel);

        
        // Set the frame to be visible
        setVisible(true);
	} 
	


}
