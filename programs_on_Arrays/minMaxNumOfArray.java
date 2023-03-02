package programs_on_Arrays;


public class minMaxNumOfArray {
	public static void main(String args[]) {
		int arr[]= {3,4,5,1,1,6,34,54};
		int n=arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n-i-1 ; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
		System.out.println("the nimimum number is :"+arr[0]);
		System.out.println("the maximum number is :"+arr[n-1]);
	}
}
/*	static int[] minMaxNum(int arr[],int n){
		int mini=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<mini) {
				mini=arr[i];
			}
			else if(arr[i]>max){
				max=arr[i];
			}
		}
		int ans[]=new int[2];
		ans[0]=mini;
		ans[1]=max;
		return ans;
	} 

	public static void main(String args[]) {
		int arr[]= {1,1,1,1,1,1};
		int n=arr.length;
		
		int ans[]=minMaxNum(arr,n);
		System.out.print("Maximum is: " + ans[1]);
		System.out.print("\n"+ "Minimum is: " + ans[0]);
						
	} */

	

