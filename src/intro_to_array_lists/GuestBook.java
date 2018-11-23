package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JTextField T = new JTextField(30);
	JLabel JL = new JLabel();
	JLabel JL2 = new JLabel();
	String S = new String();
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook G = new GuestBook();
		G.showButton();
	}
	public void showButton() {
		J.add(P);
		J.setVisible(true);
		P.add(b1);
		P.add(b2);
		b1.setText("Add Name");
		b2.setText("View Names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		J.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			P.add(T);
			P.add(JL);
			JL.setText("Enter a name");
			P.add(b3);
			b3.setText("Add");
			b3.addActionListener(this);
			J.pack();
		} else if(e.getSource() == b2) {
			for(int i = 0; i < names.size(); i++) {
				String n = names.get(i);
				 JOptionPane.showMessageDialog(null, "#"+ (i+1) + " "+ n);
				J.pack();
			}
		}
		else if(e.getSource() == b3) {
		names.add(T.getText());
		}
		
	}
}
//Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners