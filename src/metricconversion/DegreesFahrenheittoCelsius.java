package metricconversion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DegreesFahrenheittoCelsius extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel lbl_number,lbl_value;
	JTextField text_number, text_value;
	JFrame fr;
	JButton btn_convert, btn_clear, btn_exit;
	Container con;
	
	public DegreesFahrenheittoCelsius(JFrame frame1)
	{
		super("Degrees Fahrenheit to Celsius");
		fr = frame1;
		con = getContentPane();
		con.setLayout(null);
		
		lbl_number = new JLabel("Fahrenheit: ");
		lbl_value = new JLabel("Celsius: ");
		
		text_number = new JTextField(15);
		text_value = new JTextField(15);
		
		btn_convert = new JButton("Convert");
		btn_clear = new JButton("Clear");
		btn_exit = new JButton("Exit");
		
		lbl_number.setBounds(10,60,250,25);
		con.add(lbl_number);
		text_number.setBounds(101,60,250,25);
		con.add(text_number);
		
		lbl_value.setBounds(10,88,250,25);
		con.add(lbl_value);
		text_value.setBounds(101,92,250,25);
		con.add(text_value);
		text_value.setEditable(false);
		
		btn_convert.setBounds(20,140,110,25);
		con.add(btn_convert);
		btn_convert.setEnabled(true);
		btn_convert.addActionListener(this);
		
		btn_clear.setBounds(162,140,110,25);
		con.add(btn_clear);
		btn_clear.setEnabled(true);
		btn_clear.addActionListener(this);
		
		btn_exit.setBounds(301,140,110,25);
		con.add(btn_exit);
		btn_exit.addActionListener(this);
		
		pack();
		setSize(450,450);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==btn_convert) 
		{
			int number = Integer.parseInt(text_number.getText());
			int value;
		
			value = (number - 32) * 5/9;
	
			text_value.setText(String.valueOf(value));
		}
		if(ae.getSource()==btn_clear)
		{
			text_number.setText("");
			text_value.setText("");
			btn_convert.setEnabled(true);
			btn_clear.setEnabled(true);
			text_number.requestFocusInWindow();
		}
		if(ae.getSource()==btn_exit) 
		{
			this.dispose();
		}
		
	}

}
