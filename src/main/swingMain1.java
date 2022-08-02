package main;

import javax.swing.*; 
public class swingMain1 {

	void Simple2(){  
		JFrame f;
		JButton b=new JButton("click");//create button  
		b.setBounds(130,100,100, 40);  
		f = new JFrame();          
		f.add(b);//adding button on frame  
		f.setSize(400,500);  
		f.setLayout(null);  
		f.setVisible(true);  
	}  

	public static void main(String[] args) {
		swingMain1 temp = new swingMain1();
		temp.Simple2();
	}  

}
