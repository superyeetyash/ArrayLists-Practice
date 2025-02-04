package SchoolAssignments;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 2, 3, 45, 132, 53, 7, 8};
        printInt(arr);
//        while (true) {
//            System.out.print("which first index to swap: ");
//            int swap1 = sc.nextInt();
//            System.out.print("which second index to swap: ");
//            int swap2 = sc.nextInt();
//            System.out.println("You want to swap " + swap1 + " and " + swap2);
//            if (swap1 < 0 || swap2 < 0) break;
//            if (swap2 < arr.length && swap1 < arr.length) {
//                swap(swap1, swap2, arr);
//            } else
//                System.out.println("index out of bounds");
//        }

        int length = arr.length;
        int[] tempArr = new int[length];

        for(int i = 0; i < length; i++)
        {
            tempArr[i] = arr[length-1-i];
        }
        System.out.println("using temp swapped: ");
        printInt(tempArr);

        //printInt(arr);
        System.out.println("using in place swap: ");
        int last = length-1;
        for(int i = 0; i < arr.length/2; i++)
        {
            int temp1 = arr[i];
            arr[i] = arr[last-i];
            arr[last-i] = temp1;
        }
        printInt(arr);
    }

    public static void printInt(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void swap(int s1, int s2, int[] arr)
    {
        int temp1 = arr[s1];
        arr[s1] = arr[s2];
        arr[s2] = temp1;
        printInt(arr);
    }
}
