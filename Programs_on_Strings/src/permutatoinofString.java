import java.util.Scanner;
import java.io.*;
import java.util.*;
public class permutatoinofString {
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string that you want to list permutions");
		String str=sc.next();
		
		
		printpermutaions(str,"");
		

	}
	public static void printpermutaions(String ques,String asf) {
		
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String lsques=ques.substring(0, i);
			String rsques=ques.substring(i+1);
			String roq=lsques+rsques;
			
			printpermutaions(roq,asf+ch);
			
		}
	}

	

}
