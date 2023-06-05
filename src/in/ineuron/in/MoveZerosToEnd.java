package in.ineuron.in;

public class MoveZerosToEnd {
    public static void moveZeros(int[] nums) {
        int i = 0; // pointer to track non-zero elements
        
        // Move all non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        
        // Fill the remaining elements with zeros
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.print("Input: ");
        printArray(nums1);
        moveZeros(nums1);
        System.out.print("Output: ");
        printArray(nums1);
        
        int[] nums2 = {0};
        System.out.print("Input: ");
        printArray(nums2);
        moveZeros(nums2);
        System.out.print("Output: ");
        printArray(nums2);
    }
    
    // Helper method to print an array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
