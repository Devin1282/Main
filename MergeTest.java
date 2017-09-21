package test;


import java.util.Arrays;

public class MergeTest {
	
	public static void main(String[] args) {
		int[] a1 = {1,4,6,7,8};
		int[] a2 = {2,3,5,6,10};
		int[] a3 = Merge(a1, a2);
		System.out.println(Arrays.toString(a3));
		
		System.out.println(binarySearch(a1, 4));
		
		
	}
	
	private static int binarySearch(int[] arr, int key)
	{
		int low = 0;
		int high = arr.length - 1;
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			if(key < arr[mid])
			{
				high = mid;
			}
			else if(key > arr[mid])
			{
				low = mid;
			}
			else
			{
				return mid;
			}
		}
		return -1;
		
	}
	private static int[] Merge(int[] left, int[] right)
	{
		int[] newArray = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int newArrayIndex = 0;
		while(leftIndex < left.length && rightIndex < right.length) {
			if(left[leftIndex] <= right[rightIndex]) {
				newArray[newArrayIndex] = left[leftIndex];
				leftIndex++;
				newArrayIndex++;
			} else {
				newArray[newArrayIndex] = right[rightIndex];
				rightIndex++;
				newArrayIndex++;
			}
		}
		if(leftIndex >= left.length) {
			while(rightIndex < right.length) {
				newArray[newArrayIndex] = right[rightIndex];
				rightIndex++;
				newArrayIndex++;
			}
		}
		if(rightIndex >= right.length) {
			while(leftIndex < left.length) {
				newArray[newArrayIndex] = left[leftIndex];
				leftIndex++;
				newArrayIndex++;
			}
		}
		return newArray;
	}

}
