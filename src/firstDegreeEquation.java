// package Lab01;
import java.util.Scanner;

public class firstDegreeEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First-degree equation: ax + b =0 \n");
		int aNumber,bNumber;
		double xNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		aNumber = scanner.nextInt();
		System.out.println("Enter b number: ");
		bNumber = scanner.nextInt();
		System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
		if(aNumber==0) {
			if (bNumber==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else {
			xNumber = (double)-bNumber/aNumber;
			System.out.println("Phương trình đã cho có nghiệm x= "+ xNumber);
		}
	}

}
