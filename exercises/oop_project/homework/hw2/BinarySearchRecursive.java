package oop_project.homework.hw2;
import java.util.Arrays;
public class BinarySearchRecursive {
    public static void main(String [] args) {
        int [] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        int key1 = 12; 
        int key2 = 34;
        Arrays.sort(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println(
                binarySearchRecursive(array, key1, 0, array.length - 1) ? key1 + " Found" : key1 + " Not found");
        System.out.println(
                binarySearchRecursive(array, key2, 0, array.length - 1) ? key2 + " Found" : key2 + " Not found");
    }

    public static boolean binarySearchRecursive(int [] array, int key, int start, int end) {
        int middle = (start + end) / 2;
        if (end < start) {
            return false;
        }
        if (key < array[middle]) {
            return binarySearchRecursive(array, key, start, middle - 1);
        } else if (key > array[middle]) {
            return binarySearchRecursive(array, key, middle + 1, end);
        } else if (key == array[middle]) {
            return true;
        }
        return false;
    }
}
