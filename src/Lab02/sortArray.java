package Lab02;
import java.util.Scanner;
import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			System.out.printf("s[%d]= ",i);
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr); 
		System.out.println("Chuoi sau khi xap xep: "+ Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum value of array: " + sum);
		double tb=(double)sum/n;
		System.out.println("average value of array: " + tb);
	}

}
