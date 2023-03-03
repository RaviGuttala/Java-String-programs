
public class isStringContainsOnlyDigits {

	public static void main(String[] args) {
		String str="12346578327727";
		Boolean result=str.matches("[0-9]+");
		System.out.println("Original String: "+str);
		if(result) {
			System.out.println("The string contains only digits");
		}
		else {
			System.out.println("The string contains some characters other than digits");
		}
	}

}
