package metricconversion;
import java.awt.*;
import java.awt.event.*;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MainPage extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	
	JPanel panel1;
	CardLayout cl;
	JMenuBar menu_bar;
	JMenu menu1, menu2;
	JMenuItem menu_item1, menu_item2;
	
	MainMenu g_me;
	
	public MainPage()
	{
		super("Metric Conversion - OOP");
		
		panel1 = new JPanel()
		{

			private static final long serialVersionUID = 1L;
			
			public Dimension getPreferredSize()
			{
				return new Dimension(1366,100);
			}
		};
		
		cl = new CardLayout();
		panel1.setLayout(cl);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		setLayout(new BorderLayout());
		
		menu1 = new JMenu("About");
		menu_item1 = new JMenuItem("Author");
		menu1.add(menu_item1);
		
		Action aboutApp = new AbstractAction("Author")
		{
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent ae)
			{
				
			}
		};
		
		aboutApp.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));
		menu_item1.setAction(aboutApp);
		menu_item1.addActionListener(this);
		
		menu2 = new JMenu("Conversion");
		menu_item2 = new JMenuItem("Metric Conversion App");
		menu2.add(menu_item2);
		
		Action conversionApp = new AbstractAction("Metric Conversion App")
		{
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent ae)
			{
				
			}
		};
		conversionApp.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
		menu_item2.setAction(conversionApp);
		menu_item2.addActionListener(this);
		
		add(panel1, BorderLayout.NORTH);
		menu_bar = new JMenuBar();
		menu_bar.add(menu1);
		menu_bar.add(menu2);
		setJMenuBar(menu_bar);
		
		JToolBar toolbar = new JToolBar();
		toolbar.setFloatable(false);
		toolbar.setRollover(true);
		
		add(toolbar, BorderLayout.NORTH);
		setSize(1366,50);
		setVisible(true);
		
		pack();
		setSize(1366,768);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
			
			if(ae.getSource()==menu_item1)
			{
				JOptionPane.showMessageDialog(null, "Developed and Programmed by: APRIL ROSE MONDEJAR", "Author Info", JOptionPane.INFORMATION_MESSAGE);
			}
			if(ae.getSource()==menu_item2)
			{
				g_me = new MainMenu(this);
			}
	}
	
	public static void main(String[] args) 
	{
		new MainPage();
	}

}
