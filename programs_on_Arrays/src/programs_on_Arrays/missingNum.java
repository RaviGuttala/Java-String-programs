package programs_on_Arrays;


public class missingNum {
  public static void main(String[] args) {
      
      
	  int Array[]= {1,2,3,4,5,6,9,7,10};
	  int n=Array.length;
      //Finding the missing number
      int sumOfAll = (n*(n+1))/2;
      int sumOfArray = 0;
      for(int i=0; i<=n-2; i++) {
         sumOfArray = sumOfArray+Array[i];
      }
      int missingNumber = sumOfAll-sumOfArray;
      System.out.println("Missing number is: "+missingNumber);
   }
}


