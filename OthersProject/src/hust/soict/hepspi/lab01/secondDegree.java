package hust.soict.hepspi.lab01;
// package Lab01;
import java.util.Scanner;
public class secondDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = scanner.nextInt();
		System.out.println("Enter b number: ");
		b = scanner.nextInt();
		System.out.println("Enter c number: ");
		c = scanner.nextInt();
		double nghiem, denta;
		System.out.println("Phuong trinh ban vua nhap la: "+ a+"x^2 + " +b +"x + " +c +" = 0.");
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Phuong trinh da cho vo so nghiem");
				}else {
					System.out.println("Phuong trinh da cho vo nghiem");
				}
			}else {
				nghiem = -b/a;
				System.out.println("Phuong trinh da cho co nghiem: "+ nghiem);	
			}
		}else {
			denta = b*b - a*4*c;
			if(denta==0) {
				nghiem = -b/(2*a);
				System.out.println("Phuong trinh da cho co nghiem: " + nghiem);
			} else if (denta > 0) {
				double x1, x2;
				x1 = (double) ((-b + Math.sqrt(denta))/(2*a));
				x2 = (double) ((-b - Math.sqrt(denta))/(2*a));
				System.out.println("Phuong trinh da cho co cac nghiem: "+ x1+", "+x2);
			}else {
				System.out.println("Phuong trinh da cho vo nghiem!");
			}
		}
	}

}
