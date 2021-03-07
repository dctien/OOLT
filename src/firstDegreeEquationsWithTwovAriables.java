// package Lab01;1
import java.util.Scanner;
public class firstDegreeEquationsWithTwovAriables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a11, a12, a21, a22, b1, b2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a11 number: ");
		a11 = scanner.nextInt();
		System.out.println("Enter a12 number: ");
		a12 = scanner.nextInt();
		System.out.println("Enter b1 number: ");
		b1 = scanner.nextInt();
		System.out.println("Enter a21 number: ");
		a21 = scanner.nextInt();
		System.out.println("Enter a22 number: ");
		a22 = scanner.nextInt();
		System.out.println("Enter b2 number: ");
		b2 = scanner.nextInt();
		System.out.println("Phuong trinh ban vua nhap la: ");
		System.out.println(a11 +"x1 + " + a12 + "x2 = " + b1);
		System.out.println(a21 +"x1 + " + a22 +"x2 = " + b2);
		 
		int D, D1, D2;
		double x1, x2;
		D = a11 * a22 - a21 * a12;
		D1 = b1*a22 - b2*a12;
		D2 = a11*b2 - a21*b1;
		x1 = (double)D1/D;
		x2 = (double)D2/D;
		if(D==0) {
			if(D1==0 && D2==0)
				System.out.println("PHuong trinh da cho vo so nghiem");
			else {
				System.out.println("Phuong trinh da cho vo nghiem");
			}
		} else {
			System.out.println("Phuong trinh da cho co nghiem: (x1,x2) = " + "(" + x1 +", "+ x2 +" )");
		}
	}

}
