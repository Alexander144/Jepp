package test;
import javax.swing.JOptionPane;
public class Klientprogram {	
	public static void main(String[] args) {
		//konverterer string til int
		int tall = Integer.parseInt(JOptionPane.showInputDialog("Oppgi verdien: "));
		D d = new D(tall);
		System.out.println(d);
		d.metode2(); 
		JOptionPane.showMessageDialog(null, d);
	}

}
