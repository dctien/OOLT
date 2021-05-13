package hust.soict.hedspi.gui.awt;

import java.awt.*;
import java.awt.event.*;

// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter  extends Frame implements ActionListener{
	private Label lbCount; // Declare a Label component
	private TextField tfCount; // Declare a TextField component
	private Button btnCount; // Declare a Button component
	private int count = 0; // Counter's value

	// Constructor to setup GUI components and events handlers
	public AWTCounter() {
		setLayout(new FlowLayout());
		// "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
		// the components from left-to-right, and flow to next row from top-to-bottom.
		
		lbCount = new Label("Counter"); // constructor components
		add(lbCount);		// add components to container

		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false);
		add(tfCount);

		btnCount = new Button("Count");
		add(btnCount);

		btnCount.addActionListener(this);
		// "btnCount" is the source object that fires an ActionEvent when clicked.
		// The source add "this" instance as an ActionEvent listener, which provides
		//   an ActionEvent handler called actionPerformed().
		// Clicking "btnCount" invokes actionPerformed().


		setTitle("AWT title");
		setSize(250, 100);

// 		For inspecting the Container/Components objects
//		System.out.println(this);
//		System.out.println(lbCount);
//		System.out.println(tfCount);
//		System.out.println(btnCount);

		setVisible(true); // super Frame shows

//		System.out.println(this);
//		System.out.println(lbCount);
//		System.out.println(tfCount);
//		System.out.println(btnCount);
	}

	// The entry main() method
	public static void main(String[] args) {
		// Invoke the constructor to setup the GUI, by allocating an instance
		AWTCounter app = new AWTCounter();
		// or simply "new AWTCounter();" for an anonymous instance
	}
	
	// ActionEvent handler -Called back upon button-click.
	@Override
	public void actionPerformed(ActionEvent evt) {
		++count;// Increase the counter value
		// Display the counter value on the TextField tfCount
		tfCount.setText(count + "");
	// Convert int to String
	}
}