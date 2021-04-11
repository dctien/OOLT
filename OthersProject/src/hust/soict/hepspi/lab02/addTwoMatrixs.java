package hust.soict.hepspi.lab02;
import java.util.Scanner;

public class addTwoMatrixs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of matrices: ");
		int sHang = sc.nextInt();
		int sCot = sc.nextInt();
		
		int[][] mt1 = new int[sHang][sCot];
		int[][] mt2 = new int[sHang][sCot];
		int[][] tongmt = new int [sHang][sCot];
		System.out.println("Nhap cac phan tu ma tran 1: ");
		for (int i=0;i<sHang;i++) {
			for (int j=0;j<sCot;j++) {
			System.out.printf("mt1[%d][%d]= ",i,j);
			mt1[i][j]= sc.nextInt();
			}
		}
		System.out.println("Nhap cac phan tu ma tran 2: ");
		for (int i=0;i<sHang;i++) {
			for (int j=0;j<sCot;j++) {
			System.out.printf("mt2[%d][%d]= ",i,j);
			mt2[i][j]= sc.nextInt();
			}
		}
		for (int i=0;i<sHang;i++) {
			for (int j=0;j<sCot;j++) {
				tongmt[i][j]= mt1[i][j] + mt2[i][j];
			}
		}
		System.out.println("Ma tran 1: ");
        for (int i = 0; i < sHang; i++) {
            for (int j = 0; j < sCot; j++) {
            	 System.out.print(mt1[i][j] + "\t");
            } 
            System.out.println();
        }
        System.out.println("Ma tran 2: ");
        for (int i = 0; i < sHang; i++) {
            for (int j = 0; j < sCot; j++) {
            	 System.out.print(mt2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Tong hai ma tran: ");
        for (int i = 0; i < sHang; i++) {
            for (int j = 0; j < sCot; j++) {
            	 System.out.print(tongmt[i][j] + "\t");
            }
            System.out.println();
        }
	}

}
