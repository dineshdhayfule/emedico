package com.e_medico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.GridLayout;

public class Cart extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList a = new ArrayList();
					ArrayList a1 = new ArrayList();
					Cart frame = new Cart(a,a1);
//					Cart frame = new Cart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cart(ArrayList a,ArrayList a1) {
//		JtableData jd = new JtableData();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 JPanel panel = new JPanel();
		    panel.setBounds(0, 130, 710, 466);
		    contentPane.add(panel);
		    panel.setLayout(new GridLayout(5, 5, 5, 5));
		    int sum = 0;

		    for(int i = 0; i<a.size();i++) {
		    	panel.add(new JLabel(""+a.get(i)));
		    	sum += Integer.parseInt( (String) a1.get(i)); 

		    	//panel.add(new JButton(""+a.get(i)));
		    }
//		    for(int i = 0; i<a1.size();i++) 
//		    {
//		    	
//		    	sum += Integer.parseInt( (String) a1.get(i)); 
//		    	
////		    	//panel.add(new JButton(""+a.get(i)));
//		    }
	    	panel.add(new JLabel(""+sum));

	}
}	
	
		
//		for(int i=0;i<a.size();i++)
//		
//		{
//			//contentPane.add(new JLabel(""+a.get(i)));
//			
//  
//			JLabel lblNewLabel = new JLabel(" ");
//			lblNewLabel.setLayout(new FlowLayout());
//			
//			contentPane.add(lblNewLabel);	
//		    lblNewLabel.setText("  "+a.get(i));
//
//		}
		
	
			
		
			