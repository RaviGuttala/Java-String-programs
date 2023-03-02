package programs_on_Arrays;

public class duplicateNumber {
	public static void main(String args[]) {
		     
        int [] arr = new int [] {1,2,1,3,4,5,6,4,8,8,9,10,3};   
          
        System.out.println("Duplicate Number in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {
        	int count=0;
            for(int j = i + 1; j < arr.length; j++) {
            	
                if(arr[i] == arr[j]) {
                	count++;}
                     
                
            }  
         if(count==1) {
        	 System.out.println(arr[i]);
         }
        }  	

}
}
