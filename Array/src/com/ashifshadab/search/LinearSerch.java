package com.ashifshadab.search;

public class LinearSerch {

	public static void main(String[] args) {

		int arr[]= {1,10,4,2,40,8,50};
		
		int target=8;
		
		int result=search(arr, target);
		
		
		print(target,result);

	}

	private static void print(int target, int result) {
		if (result == -1)
			System.out.print("Target Element "+target+" is not present in array");
		else
			System.out.print("Target Element "+target+" is present at index " + result);
	}

	private static int search(int[] arr, int key) {
		int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
		
	}

}
