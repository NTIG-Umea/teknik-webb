import javax.swing.*;

public class Hej {
	public static void main (String[] arg) {
		
		String firstname;
		String lastname;
		String greeting;
		/*String falsk:*/
		//Det här är en kommentar
		
		firstname = JOptionPane.showInputDialog("What is your first name?");
		lastname = JOptionPane.showInputDialog("What is your last name?");
		greeting = "Welcome, " + firstname + " " + lastname;
		JOptionPane.showMessageDialog(null, greeting);
	}
}	