// Exception Handling
// Try-catch
// Try -> It means, Try is trying to execute the line of code where we use try block . If code is succesfully compiled then ok . 
//        If there are exception occurs then Try block give that exception to catch block...
// Catch -> Catch block is catch tha exception which is given by Try block after that the catch block start excetion line by line


public class Day36 {
  public static void main(String[] args) {
    /*
    int a=6900;
    int b=2;
    int c = a/b;
    System.out.println(c);       // output is 3450, there are no exception occurs.
    */


    // there are Arithmetical exception occus if we divide any value by 0  >> So we use Try catch block
     

    // Then we put 0 in b
    /*
    int a=6900;
    int b=0;
    int c= a/b;
    System.out.println(c);        // there are exception occurs
    */

    // Now we use Try-catch block
    int a=6900;
    int b=2;
    try {
     int c= a/b;
     System.out.println(c);
    } 
    catch (Exception e) {
      System.out.println("there are Exception occurs Reason : ");
      System.out.println(e);
    }
    // and after this the next line of codes starting Execute

    System.out.println("------- End of Program --------");
   

    
  }  
}
