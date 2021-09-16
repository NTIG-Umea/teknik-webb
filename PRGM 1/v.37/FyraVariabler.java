import javax.swing.*;

public class FyraVariabler {
	
	public static void main (String[] arg){
		
		String namn = "Natalie Tuomi";
	
		String adress = "Sverige";
	
		String nr = "070 256 0425";
	
		String total = namn + "\n" + adress + "\n" + nr;
		
		JOptionPane.showMessageDialog(null, total);
	}
}