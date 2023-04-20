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
        // Size
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));
        
        // Rows
        JPanel rowAirInformation = new JPanel(new GridLayout(1, 1));
        

        //Air Information Service Row ----------------------
        
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
        
    
        // Add the components
        
   
        
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
        
        
        
        JPanel rowWaterInformation = new JPanel();
        JPanel rowRadiationInformation = new JPanel();
        
        rowWaterInformation.add(new JLabel("Water Information Service"));
        rowRadiationInformation.add(new JLabel("Radiation Information Service"));
        
        

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
