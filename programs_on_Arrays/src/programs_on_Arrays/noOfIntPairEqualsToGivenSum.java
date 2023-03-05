package programs_on_Arrays;

public class noOfIntPairEqualsToGivenSum {
	public static void intPairs(int  arr[],int sumOf2Int) {
		int count=0;
		
		if(arr.length==0||arr.length==1) {
			System.out.print("pls pass arry of length at least 2!!!!");
		}
		else {
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if((arr[i]+arr[j])==sumOf2Int) {
						count++;
						System.out.println("The sum of two integer="+sumOf2Int+" Pair : "+arr[i]+" + "+arr[j]+" --> ThepairNo------>>"+count);
					}
				}
			}
		}
		System.out.println("The total no of pair count: "+count);
	}

	public static void main(String[] args) {
		int quesArr[]= {1,2,3,4,5,6,7,8,9};
		int sumOf2Int=9;
		intPairs(quesArr,sumOf2Int);
		

	

	}
}