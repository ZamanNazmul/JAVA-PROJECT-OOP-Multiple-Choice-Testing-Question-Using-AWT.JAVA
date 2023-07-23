import java.awt.*;

import java.awt.event.*;

import javax.swing.*;



public class AWT extends  JFrame implements ActionListener

		
{
	int count=0;

      JLabel ql; 

      JButton lg;

      ButtonGroup bg;

      JRadioButton rb[] = new JRadioButton[5];

      int running = 0;

      //int count = 0;

      

      

    

	AWT()

	{

		//Frame f = new Frame();
		
		
		

		//setSize(600,700);
		setBounds(400,200,1200, 500);
		getContentPane().setBackground(Color.WHITE);

		setTitle("OOPL Lab II");

		setLayout(null);

		setVisible(true);

                setLocation(100,100);
				

                


			   ImageIcon I2 = new ImageIcon("naz3.JPEG");
			   JLabel L2 = new JLabel(I2);
			   L2.setBounds(0,0,1200,200);
			   add(L2);

               ql = new JLabel();

                add(ql);

                

                bg = new ButtonGroup();

                

                for(int i=0;i<5;i++)  

                {
					
					
					
                    rb[i] = new JRadioButton();
					

                    add(rb[i]);
					rb[i].setBackground(Color.WHITE);
                    bg.add(rb[i]);

                }

                

                rb[0].setBounds(400,250,300,20);

                rb[1].setBounds(400,280,300,20);

                rb[2].setBounds(400,310,300,20);

                rb[3].setBounds(400,340,300,20);

         
                

                lg = new JButton("Next");

                lg.setBounds(500,370,70,40);
				lg.setBackground(new Color(30,144,254));

                add(lg);
                

                lg.addActionListener(this);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        

                set();

                

        }

        

        public void actionPerformed(ActionEvent e)

        {
		
			
			
           if(e.getSource()==lg)

           {

              if(check())

              {

                 count = count+1; 

              }

              running++;

              set();

              

              if(running ==9)

              { 

                  lg.setText("Result");

              }
			  

           }

           

           if(e.getActionCommand().equals("Result"))

           {

               if(check())

               {

                   count =count+1;

               }

               running++;

             

                //JOptionPane.showMessageDialog(this,"Correct Answer :" + count);
				this.setVisible(false);
				
				new AWT3(count).setVisible(true);
				
               // System.exit(0);

           }

        }

        

        void set()

        {

            rb[4].setSelected(true);

            

            if (running ==0)

            {

               ql.setText("1. _____ is used to find and fix bugs in the Java programs.?");

               rb[0].setText("JVM");

               rb[1].setText("JRE");

               rb[2].setText("JDK");

               rb[3].setText("JDB");

            }

            

            if (running ==1)

            {

               ql.setText("2. What is the name of the Swing class that is used for frames? ");

               rb[0].setText("Window");

             rb[1].setText("Frame");

               rb[2].setText(" JFrame");

               rb[3].setText("SwingFrame ");

            }
			
			if (running ==2)

            {

               ql.setText("3. Which of the following is not a Java features?");

               rb[0].setText("Dynamic");

               rb[1].setText("Architecture Neutral");

               rb[2].setText("Use of pointers");

               rb[3].setText("Object-oriented");

            }
			if (running ==3)

            {

               ql.setText("4.Encapsulation is supported by ___________?");

               rb[0].setText("Objects");

               rb[1].setText("Methods");

               rb[2].setText("Classes");

               rb[3].setText("None of the above");

            }
			
			
		    if (running ==4)

            {

               ql.setText("5. An interface with no fields or methods is known as a ______.?");

               rb[0].setText("Runnable Interface");

               rb[1].setText("Marker Interface");

               rb[2].setText("Abstract Interface");

               rb[3].setText("CharSequence Interface");

            }
			if (running ==5)

            {

               ql.setText("6. Which of the following is a mutable class in java?");

               rb[0].setText("java.lang.String");

               rb[1].setText("java.lang.Byte");

               rb[2].setText("java.lang.Short");

               rb[3].setText("java.lang.StringBuilder");

            }
	
			 if (running ==6)

            {

               ql.setText("7. The class that inherits an already defined class is called ___.?");

               rb[0].setText("Subclass");

               rb[1].setText("Superclass");

               rb[2].setText("Main Class");

               rb[3].setText("Java Class");

            }
			
			if (running ==7)

            {

               ql.setText("8. Which of these method is used to implement Runnable interface?");

               rb[0].setText("stop()");

               rb[1].setText("run()");

               rb[2].setText("runThread()");

               rb[3].setText("stopThread()");

            }
			
			if (running ==8)

            {

               ql.setText("9. In OOPs in Java, private, public & protected are_____.?");

               rb[0].setText("Interfaces");

               rb[1].setText("Classes");

               rb[2].setText("Access Modifiers");

               rb[3].setText("Method signature");


            }
			
			if (running ==9)

            {

               ql.setText("10. Which of the following is not an OOPS concept??");

               rb[0].setText("Exception");

               rb[1].setText("Abstraction");

               rb[2].setText("Polymorphism");

               rb[3].setText("None of the above");

            }
			


            ql.setBounds(400,220,400,20);

        }

        

        boolean check()

        {

            if(running == 0)

            {

                return(rb[3].isSelected());

            }
			

            if(running == 1)

            {

                return(rb[2].isSelected());

            }
		    if(running == 2)

            {

                return(rb[1].isSelected());

            }
			 if(running == 3)

            {

                return(rb[2].isSelected());

            }
		
			if(running == 4)

            {

                return(rb[1].isSelected());

            }
			if(running == 5)

            {

                return(rb[3].isSelected());

            }
			
			if(running == 6)

            {

                return(rb[1].isSelected());

            }
			
			if(running == 7)

            {

                return(rb[1].isSelected());

            }
			
            if(running == 8)

            {

                return(rb[2].isSelected());

            }
			if(running == 9)

            {

                return(rb[0].isSelected());

            }
			

            


            return false;

        }

   

        

	

	public static void main(String []args)

	{

		AWT awt = new AWT();

	}

	

}
