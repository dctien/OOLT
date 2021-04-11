package hust.soict.hepspi.lab01;
//package Lab01;
import javax.swing.JOptionPane;
public class calculationOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2;

		strNum1 = JOptionPane.showInputDialog(null, "Please input first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);

		double calculateSum = num1 +num2;
		double differenceNumber = num1 - num2;
		double productNumber = num1*num2;
		double quotientNumber = num1/num2;
		
		JOptionPane.showMessageDialog(null, calculateSum, "Calcuation of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, differenceNumber, "Difference of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, productNumber, "Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, quotientNumber, "Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
