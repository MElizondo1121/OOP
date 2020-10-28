/**
 * @author Mirna Elizondo
 * CS3354 Section 6
 * Homework 7 Due: Nov. 5
 *
 * Option done to implement ActionListener than the way it was making anonymous classes.
 * Square, square root and dividing my x fuction implemented.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.lang.Math;

/**
 * JavaCalculator that implements the buttons of the calculator
 * Adding the required square root, square and dividing by x functions.
 * Initialized the variables to 0.
 *
 */
public class JavaCalculator extends JFrame{
    private JFrame f;
    private JTextField t;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsqr,bdix,bsq;
    static double a=0,b=0,result=0;
    static int operator=0;
    static String symbol = "";
    /**
     * JavaCalculator object creation. Sets the bounds of the the buttons on the panel and creates the labels on them.
     * It also implements anonymous classes done when an ActionListener is created.
     *
     */
    public JavaCalculator(){
		f=new JFrame("JavaCalculator");
		t=new JTextField();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdiv=new JButton("/");
		bmul=new JButton("*");
		bsub=new JButton("-");
		badd=new JButton("+");
		bdec=new JButton(".");
		beq=new JButton("=");
                bsqr= new JButton("√");//square root button
                bsq=new JButton("x^2");//square button
                bdix= new JButton("1/x");//dividing my x button
		bdel=new JButton("Del");
		bclr=new JButton("Clr");

                //creates the bounds for the window
		t.setBounds(30,40,530,30);
		b9.setBounds(40,100,70,40);
		b8.setBounds(130,100,70,40);
		b7.setBounds(220,100,70,40);

		bdiv.setBounds(310,100,70,30);
		bmul.setBounds(400,100,70,30);
		bdel.setBounds(490,100,70,30);

		b6.setBounds(40,170,70,40);
		b5.setBounds(130,170,70,40);
		b4.setBounds(220,170,70,40);

		bsq.setBounds(310,150,70,30);
		bdix.setBounds(400,150,70,30);
		bclr.setBounds(490,150,70,30);

		b3.setBounds(40,240,70,40);
		b2.setBounds(130,240,70,40);
		b1.setBounds(220,240,70,40);

                bsub.setBounds(310,200,70,30);
                badd.setBounds(400,200,70,30);
                bdec.setBounds(490,200,70,30);

		b0.setBounds(310,250,70,30);
		bsqr.setBounds(400,250,70,30);
		beq.setBounds(490,250,70,30);

                //adds the buttons on the frame when a new calculator is created
		f.add(t);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bmul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bsub);
		f.add(bdec);
		f.add(b0);
		f.add(beq);
		f.add(badd);
		f.add(bdel);
		f.add(bclr);
                f.add(bsqr);
                f.add(bsq);
                f.add(bdix);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600,350);//panel size
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

                //implements the Action Listeners for 0-9 buttons
		b1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                       t.setText(t.getText().concat("1"));
                    }
                });
		b2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("2"));
                    }
                });
		b3.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("3"));
                    }
                });
		b4.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("4"));
                    }
                });
		b5.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("5"));
                    }
                });
		b6.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("6"));
                    }
                });
		b7.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("7"));
                    }
                });
		b8.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("8"));
                    }
                });
		b9.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("9"));
                    }
                });
		b0.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText(t.getText().concat("0"));
                    }
                });
                //implements what action is performed when the add button is pressed
		badd.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
                    }
                });
                //implements what action is performed when the subtract button is pressed
		bsub.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
                }});
                //implements what action is performed when the multiply button is pressed
		bmul.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
                    }
                });
                //implements what action is performed when the divide button is pressed
		bdiv.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        a=Double.parseDouble(t.getText());
			operator = 4;
                        t.setText("");
                    }
                });
                //implements what action is performed when the dec button is pressed
		bdec.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText("");

                    }
                });
                //implements what action is performed when the equal button is pressed
		beq.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(e.getSource()==beq){
			b=Double.parseDouble(t.getText());

			switch(operator)
			{
				case 1: result=a+b;
                                        symbol = "+";
					break;

				case 2: result=a-b;
                                        symbol = "-";
					break;

				case 3: result=a*b;
                                        symbol = "*";
					break;

				case 4: result=a/b;
                                        symbol = "/";
					break;

				default: result = 0;
                                         symbol = "";
			}

			t.setText(a +" "+ symbol + " "+ b + " = " + result);
		}}
                });
                //implements what action is performed when the del button is pressed
		bdel.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
                    }
                });
                //implements what action is performed when the clear button is pressed
		bclr.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        t.setText("");
                    }
                });
                //implements what action is performed when the square root button is pressed
                bsqr.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        a=Double.parseDouble(t.getText());
                        result = Math.sqrt(a);
			t.setText("√ "+ a + " "+ result);
                    }
                });
                //implements what action is performed when the square button is pressed
                bsq.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        a=Double.parseDouble(t.getText());
                        result = a * a;
			t.setText(a + " ^ 2 " +" = "+ result);
                    }
                });
                //implements what action is performed when the divide by x button is pressed
                bdix.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                      a=Double.parseDouble(t.getText());
                      result = 1/a;
                      t.setText("1/" + a + " = " + result);
                    }
                });


    }

    public static void main(String...s)
	{
		new JavaCalculator();
	}
}
