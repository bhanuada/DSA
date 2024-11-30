package dsa1; // Remove this line if you are not working within a package

public class ArrayIsSortedOrNot {
    public static boolean isSorted(int[] arr) { // Renamed method to 'isSorted'
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) { // Check if the current element is smaller than the previous
                return false;
            }
        }
        return true; // If no issues found, array is sorted
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0}; // Declared array using conventional style
        boolean result = isSorted(arr); // Updated method call
        System.out.println(result);
    }
}
