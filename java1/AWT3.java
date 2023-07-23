import javax.swing.*;
import java.awt.*;

public class AWT3 extends JFrame{
	
	AWT3(int count)
		{
			setBounds(700,150,750,550);
			setLocation(300,100);
			getContentPane().setBackground(Color.WHITE);
			setLayout(null);
		
		
		 
		   ImageIcon I1 = new ImageIcon("nazmul5.JPEG");
		   JLabel L1 = new JLabel(I1);
		   L1.setBounds(0,0,700,200);
		   add(L1);
		   
		   JLabel L2=new JLabel("YOUR SCORE IS : " +count);
		   L2.setFont(new Font ("Railway",Font.BOLD,50));
		   //L4.setForeground(new Color(30,144,254));
		   L2.setBounds(150,200,500,100);
		   add(L2);
		   
		   JLabel L3=new JLabel("THANK YOU!!!");
		   L3.setFont(new Font ("Railway",Font.BOLD,40));
		   //L4.setForeground(new Color(30,144,254));
		   L3.setBounds(250,250,300,100);
		   add(L3);
		  
		
	}
	
	
	public static void main(String [] args)
		{
			
		new AWT3(0).setVisible(true);

		}	
		
}