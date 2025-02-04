package SchoolAssignments;

import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int[] num = {0, 12, 15, 16, 24, 36, 46, 59, 75, 108, 126, 176, 256, 678, 857, 1123, 1125, 1243, 2973, 2974, 2975, 2976, 2978};
        int target = 0;
//        binarySearch(num, target);
        System.out.print("How big is the array? ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i * 5;
        }
        System.out.print("Target? ");
        target = sc.nextInt();
        binarySearch(nums, target);
    }
    
    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int temp = right;
        int count = 0;
        int index = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target)
            {
                index = mid;
                left = temp;
            }
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
            count++;
        }
        System.out.println("index: " + index);
        System.out.println("count: " + count);
    }
}