package hust.soict.hepspi.lab02;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("height of triangle: ");
		n= s.nextInt();
		do {
		for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
            	System.out.print("   ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
            	System.out.print(" * ");
            }
            System.out.println("");
		}
		}while (n<0);
	}

}
