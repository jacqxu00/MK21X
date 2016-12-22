import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperature extends JFrame implements ActionListener {
    private Container pane;
    private JTextField t;
    private JButton toc;
    private JButton tof;
    private JLabel l;
    
    public Temperature() {
	this.setTitle("Temperature Converter");
	this.setSize(300,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	JButton toc = new JButton("to Celcius");
	toc.addActionListener(this);
	toc.setActionCommand("toC");
	JButton tof = new JButton("to Fahrenheit");
	tof.addActionListener(this);
	tof.setActionCommand("toF");
	t = new JTextField(10);
	l = new JLabel("");
	pane.add(t);
	pane.add(toc);
	pane.add(tof);
	pane.add(l);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("toC") || event.equals("toF")){
	    try {
	        Double.parseDouble(t.getText());
	    }
	    catch (NumberFormatException s) {
		l.setText("INPUT ERROR: NUMBER ONLY");
	    }
	    if (t.getText().length()==0){
		l.setText("INPUT ERROR: EMPTY");
	    }
	    else if (event.equals("toC")) {
		double v = Double.parseDouble(t.getText());
		l.setText(FtoC(v) + " degrees Celcius");
	    }
	    else if (event.equals("toF")) {
		double v = Double.parseDouble(t.getText());
		l.setText(CtoF(v) + " degrees Fahrenheit");
	    }
	}
	else {
	    l.setText("Please Select a Button");
	}
    }

    public static double CtoF(double t) {
	return ((9/5.0) * t) +32;
    }
    public static double FtoC(double t) {
	return (t - 32) * (5.0/9);
    }
    
    public static void main(String[] args) {
        Temperature g = new Temperature();
        g.setVisible(true);
    }
}
