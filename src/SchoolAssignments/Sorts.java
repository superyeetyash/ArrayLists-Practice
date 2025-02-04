package SchoolAssignments;

public class Sorts {
    public static void main(String[] args) {
        int[] arr = {89, 79, 8, 19, 49, 61, 42, 55, 88, 11, 72, 36, 2, 20, 15};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nSelection:");
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nnew array");
        int[] nums = arrayFiller(15);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nInsertion:");
        insertionSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }


    }

    public static void selectionSort(int[] arr) {

//        repeat (numOfElements - 1) times
//        set the first unsorted element as the minimum
//        for each of the unsorted elements
//        if element < currentMinimum
//        set element as new minimum
//        swap minimum with first unsorted position

        for (int j = 0; j < arr.length - 1; j++) {
            int currentMin = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[currentMin])
                    currentMin = i;
            }
            swap(arr, j, currentMin);
        }
    }

    public static void insertionSort(int[] arr) {
        /*
        [5, 23, 1, 10, 2]
        [5, 23, 1, 10, 2]
        [5, 1, 23, 10, 2]
        [1, 5, 23, 10, 2]

        */
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static void swap(int[] num, int index1, int index2) {
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }

    public static int[] arrayFiller(int elems) {
        int[] arrs = new int[elems];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = (int) (Math.random() * (100 - 1)) + 1;
        }
        return arrs;
    }

}
