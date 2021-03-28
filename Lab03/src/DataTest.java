
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
//		System.out.println("Test Case 4: ");
//		MyDate testDate4 = new MyDate("");
//		testDate4.print();
		
//		Test Constructor with 3 parameter string (day, month, year)
		System.out.println("Test Case 5: ");
		MyDate testDate5 = new MyDate("second", "january", "one thousand nine hundred nine");
		testDate5.print();
		
		
		// Compare and Sorting DATE
		System.out.println("Test Case Compare and Sorting: ");
       String[] date = new String[]{"1999/12/21", "1999/09/12", "2021/12/21", "2021/09/12"};

       // Before Sorting
       System.out.println("Before Sorting: ");
       for (int i = 0; i < date.length; i++) {
           System.out.println(date[i]);
       }

//       DateUtils.sortingDate(date);

       // After Sorting
       System.out.println("After Sorting: ");
       for (int i = 0; i < date.length; i++) {
           System.out.println(date[i]);
       }
		System.exit(0);
	}

}
