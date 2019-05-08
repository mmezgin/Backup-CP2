import java.util.Scanner;

public class Arrays {

	public static void sort(int arr[]) 
	    { 
	        int n = arr.length; 
	  
	        // One by one move boundary of unsorted subarray 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min= i; 
	            for (int j = i+1; j < n; j++) 
	                if (arr[j] < arr[min]) 
	                    min = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            int temp = arr[min]; 
	            arr[min] = arr[i]; 
	            arr[i] = temp; 
	        } 
	    } 
	 public static void main(String [] args) {
		/* System.out.println("kaç sayý giricen");
		 int x,i,j;
			Scanner sc1 = new Scanner(System.in);
			x=sc1.nextInt();
			int arr[]=new int[x];
			for (i=0;i<x;i++) {
				j=sc1.nextInt();
				arr[i]=j;
				
				
			}
			sort(arr);
			for(i=0;i<x;i++) {
				System.out.print(arr[i]+" ");
			}*/
		 
		 int x,i=0;
			int arr[]=new int[5];
		 do
		 {
			 Scanner sc1 = new Scanner(System.in);
				x=sc1.nextInt();
				if(x>=0) {
					i++;
					arr[i-1]=x;
				}
		
		 
		 }
		 while(x>=0);
			 i=arr.length;
			 
			 
			 
		 for(int j=0;j<i;j++) {
			 System.out.print(arr[j]+" ");
		 }
		 
		 
		 
		 
		 
		 sort(arr);
			for(i=0;i<x;i++) {
				System.out.print(arr[i]+" ");
		 
		 
		 
	 }
} 
}