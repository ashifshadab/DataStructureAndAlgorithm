package com.ashifshadab.search;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 10, 14, 19, 26, 27, 31, 33, 35, 42, 44 };
		int target = 31;

		int result = search(arr, target);

		print(target, result);

	}

	private static void print(int target, int result) {
		if (result == -1)
			System.out.print("Target Element " + target + " is not present in array");
		else
			System.out.print("Target Element " + target + " is present at index " + result);
	}

	private static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

}
