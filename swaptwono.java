import java.util.*;

//public class swaptwono {
	//Java program to swap two numbers using function.

	

	class SwapTwoNumbersFunc {
	    int a, b;
	    //function to swap two numbers
	    public void swap(SwapTwoNumbersFunc swp) {
	        int temp;
	        temp = swp.a;
	        swp.a = swp.b;
	        swp.b = temp;
	    }
     public static void main(String s[]) {
	        SwapTwoNumbersFunc objSwp = new SwapTwoNumbersFunc();
	        try {
 
         Scanner sc = new Scanner(System.in);

	            System.out.print("Enter first  number: ");
	            objSwp.a = sc.nextInt();

	            System.out.print("Enter second number: ");
	            objSwp.b = sc.nextInt();

	            objSwp.swap(objSwp);
	            System.out.println("After swapping  -a: " + objSwp.a + ", b: " + objSwp.b);
	        }   catch (Exception E) {
	            System.out.println("Exception: " + E.toString());
	        }
	    }
	}

	

