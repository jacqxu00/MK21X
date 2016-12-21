import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Temperature extends JFrame implements ActiveListener {
    private JTextField t;
    private JButton toc;
    private JButton tof;
    private JLabel l;
    
    public Temperature() {

    public static double CtoF(double t) {
	return ((9/5.0) * t) +32;
    }
    public static double FtoC(double t) {
	return (t - 32) * (5.0/9);
    }
    public static void main(String[] args) {
	System.out.println(FtoC(32));
	System.out.println(FtoC(212));
	System.out.println(CtoF(0));
	System.out.println(CtoF(100));
    }
}
