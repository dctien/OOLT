
public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test Constructor no parameter 
		MyDate testDate = new MyDate();
		System.out.println("Test Case 1: ");
		testDate.print();
		
//		Test Constructor 3 parameter
		MyDate testDate2 = new MyDate(17, 3, 2021);
		System.out.println("Test Case 2: ");
		testDate2.print();
		
//		Test Constructor with 1 string parameter 
		MyDate testDate3 = new MyDate("March 17 2021");
		System.out.println("Test Case 3: ");
		testDate3.print();
		
//		Test accept method from MyDate Class
		System.out.println("Test Case 4: ");
		MyDate testDate4 = new MyDate("");
		testDate4.print();
		
		System.exit(0);
	}

}
