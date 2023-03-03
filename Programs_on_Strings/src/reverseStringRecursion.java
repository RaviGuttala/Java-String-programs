/*
//program to print reversed string  
 
public class reverseStringRecursion {
	String reverseName="";
	public void reversestr(String name) {
		for(int i=(name.length()-1);i>=0;--i) {
			reverseName=reverseName+name.charAt(i);
		}
		System.out.println(reverseName);
	}

	public static void main(String[] args) {
		String name="Ravi";
		reverseStringRecursion obj=new reverseStringRecursion();
		obj.reversestr(name);
		
	
	}

}
*/
// Java program to reverse a string using recursion

class reverseStringRecursion
{
	/* Function to print reverse of the passed string */
	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		String str = "Testme";
		reverseStringRecursion obj = new reverseStringRecursion();
		obj.reverse(str);
	}
}

