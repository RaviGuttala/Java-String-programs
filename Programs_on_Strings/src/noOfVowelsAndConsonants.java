
public class noOfVowelsAndConsonants {
	public void count(String str) {
		int vowel=0,consonant=0;
		String refstr="aeiouAEIOU";
		for(int i=0;i<str.length();i++) {
		  if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')) {
			  if(refstr.indexOf(str.charAt(i))==-1) {
				  consonant++;
				  
			  }
			  else {
				  vowel++;
			  }
		  }
		  
		}
		System.out.println("No of Consonants : "+consonant);
		System.out.println("No of Vowels : "+vowel);
	}

	public static void main(String[] args) {
		String ques="Ravi";
		noOfVowelsAndConsonants obj=new noOfVowelsAndConsonants();
		obj.count(ques);
		
		

	}

}
