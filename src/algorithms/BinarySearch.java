package algorithms;

public class BinarySearch {
	static int findTargetIndex(int[] arr, int target) { // the array is sorted in ascending order
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2; // to avoid potential overflow
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1; // when the target element is not found
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 45,56,23444,3444443};
		System.out.println("The target element is stored at: "+ findTargetIndex(arr,3));
	}
}