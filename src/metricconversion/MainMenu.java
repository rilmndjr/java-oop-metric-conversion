package metricconversion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L; 
	static JFrame fr;
	JButton btn_1, btn_2, btn_3,btn_4,btn_5,btn_6,btn_7;
	Container con;
	
	public MainMenu(JFrame frame1)
	{
		super("METRIC CONVERSION APPLICATION");
		con = getContentPane();
		con.setLayout(null);
		
		btn_1 = new JButton("Inches to Centimeters");
		con.add(btn_1);
		btn_1.setBounds(88,60,250,25);
		btn_1.setEnabled(true);
		btn_1.addActionListener(this);
		
		btn_2 = new JButton("Feet to Meters");
		con.add(btn_2);
		btn_2.setBounds(88,87,250,25);
		btn_2.setEnabled(true);
		btn_2.addActionListener(this);
		
		btn_3 = new JButton("Pounds to Kilograms");
		con.add(btn_3);
		btn_3.setBounds(88,114,250,25);
		btn_3.setEnabled(true);
		btn_3.addActionListener(this);
		
		btn_4 = new JButton("Gallon to Liters");
		con.add(btn_4);
		btn_4.setBounds(88,141,250,25);
		btn_4.setEnabled(true);
		btn_4.addActionListener(this);
		
		btn_5 = new JButton("Degrees Fahrenheit to Celsius");
		con.add(btn_5);
		btn_5.setBounds(88,168,250,25);
		btn_5.setEnabled(true);
		btn_5.addActionListener(this);
		
		btn_6 = new JButton("Degrees Celsius to Fahrenheit");
		con.add(btn_6);
		btn_6.setBounds(88,195,250,25);
		btn_6.setEnabled(true);
		btn_6.addActionListener(this);
		
		btn_7 = new JButton("Quit");
		con.add(btn_7);
		btn_7.setBounds(88,235,250,25);
		btn_7.setEnabled(true);
		btn_7.addActionListener(this);
		
		btn_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				MetricConversion MC = new MetricConversion(fr);
				MC.setVisible(true);
			}
		});
		
		btn_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				FeettoMeter FM = new FeettoMeter(fr);
				FM.setVisible(true);
			}
		});
		
		btn_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				PoundstoKilograms PK = new PoundstoKilograms(fr);
				PK.setVisible(true);
			}
		});
		
		btn_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				GallontoLiters GL = new GallontoLiters(fr);
				GL.setVisible(true);
			}
		});
		
		btn_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				DegreesFahrenheittoCelsius FC = new DegreesFahrenheittoCelsius(fr);
				FC.setVisible(true);
			}
		});
		
		btn_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				DegreesCelsiustoFahrenheit CF = new DegreesCelsiustoFahrenheit(fr);
				CF.setVisible(true);
			}
		});
		
		pack();
		setSize(450,450);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);	
	}


	public static void main(String[] args) 
	{
		new MainMenu(fr);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn_7)
		{
			System.exit(0);
		}
	}

}
