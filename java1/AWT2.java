import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AWT2 extends JFrame implements ActionListener{
	
	
	
	JButton btn1;
	
	AWT2()
	{
		   setBounds(400,200,1200, 500);
		   getContentPane().setBackground(Color.WHITE);
		   setLayout(null);
		   setTitle("OOPL Lab II");
	       //setSize(600,700);		   
		   setLocation(100,100);
		   
		   
		   
		   
		  
		   ImageIcon I1 = new ImageIcon("naz.jpeg");
		   JLabel L1 = new JLabel(I1);
		   L1.setBounds(0,0,620,500);
		   add(L1);
		   
		   JLabel L4=new JLabel("WELCOME TO OOPL QUIZ FINAL ");
		   L4.setFont(new Font ("Railway",Font.BOLD,20));
		   L4.setForeground(new Color(30,144,254));
		   L4.setBounds(750,10,500,100);
		   add(L4);
		   
		   JLabel L2=new JLabel("UNIVERSITY OF INFORMATION TECHNOLOGY AND SCIENCE ");
		   L2.setFont(new Font ("Railway",Font.BOLD,15));
		   L2.setForeground(new Color(30,144,254));
		   L2.setBounds(700,40,500,100);
		   add(L2);
		   
		   JLabel L3=new JLabel("DEPARTMENT OF INFORMATION TECHNOLOGY ");
		   L3.setFont(new Font ("Railway",Font.BOLD,15));
		   L3.setForeground(new Color(30,144,254));
		   L3.setBounds(740,60,500,100);
		   add(L3);
			   
		   Label l1 = new Label("Your Name: ");
		   l1.setBounds(750,160,100,20);
		   l1.setForeground(new Color(30,144,254));
		   add(l1);
			
			
		   Label l2= new Label("Your SID: ");
           l2.setBounds(750,210,100,30);
		   l2.setForeground(new Color(30,144,254));
		   add(l2);
			
			
			
		   JTextField t1 = new JTextField();
           t1.setBounds(850,160,150,25);
           add(t1);
	    	
				   
		   JTextField t2 = new JTextField();
           t2.setBounds(850,210,150,25);
           add(t2);
			
			
		   
           btn1 = new JButton("Next");
           btn1.setBounds(870, 270, 80, 25);
		   btn1.setBackground(new Color(30,144,254));
		   btn1.addActionListener(this);
		   add(btn1);
		   
		   
		   
		   Label db = new Label("DEVELOPED BY NAZMUL ZAMAN(55)  AND JERIN SARKER(36)");
           db.setBounds(750,410,360,35);
		   db.setBackground(new Color(30,144,254));
		 
           add(db);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setVisible(true);

		   
		   
		  


		
	}
	      public void actionPerformed(ActionEvent e)

        {
			if(e.getSource()==btn1)
			{
				this.setVisible(false);
				new AWT().setVisible(true);
			}
			
		}
		public static void main(String [] args)
		{
			
		new AWT2();

		}	
	
}