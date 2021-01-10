package lesson23;
/*Given an int array, return a new array with double the length where
its last element is the same as the original array, and all the other
elements are 0. The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6] makeLast([1, 2]) → [0, 0, 0, 2] makeLast([3]) → [0, 3]
 */
/*15. Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1 */

public class maxarray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{7, 2, 3};
        int[] arr3 = new int[]{1, 2};
        int[] arr4 = new int[]{1, 3};
        int[] arr5 = new int[]{1};
        int[] arr6 = new int[0];
        int[] arr7 = new int[]{0, 3};
        int[] arr8 = new int[]{2, 3, 4};
        System.out.println(start1(arr1, arr4));
        System.out.println(start1(arr2, arr5));
        System.out.println(start1(arr3, arr6));
        System.out.println(start1(arr7, arr8));
    }

    private static int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }
}
