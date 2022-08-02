package main;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;

public class swingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();//creating instance of JFrame  

		JButton b=new JButton("clickHello");//creating instance of JButton
		b.setSize(100, 40);;
//		b.setBounds(100,100,40, 40);//x axis, y axis, width, height  
//		b.setAlignmentX(Component.CENTER_ALIGNMENT);
//		b.setAlignmentY(Component.CENTER_ALIGNMENT);
		f.setLocation(20, 30);
		f.add(b);//adding button in JFrame  
//		f.setBounds(100, 100, 400,500);
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  

}
