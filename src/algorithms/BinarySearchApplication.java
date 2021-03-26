package algorithms;

// To find the index of the first element larger than the target
public class BinarySearchApplication {
	static int findLargerElementIndex(int[] arr, int target) { // array is in ascending order
		int left = 0;
		int right = arr.length - 1;
		int boundaryIndex = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] >= target) {
				boundaryIndex = mid;
				right = mid - 1;
			}
			else
				left = mid + 1;
		}
		return boundaryIndex;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,4,6,7,8};
		System.out.println("The index of the first element greater than target is: "+ findLargerElementIndex(arr, 5));
	}
}