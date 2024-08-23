public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World. Java");
        
        // Define an array to be sorted
        int[] arr = {12, 11, 13, 5, 6, 7};
        
        // Create an instance of HeapSort
        HeapSort heapSort = new HeapSort();
        
        // Sort the array
        heapSort.sort(arr);
        
        // Print the sorted array
        System.out.println("Sorted array is:");
        heapSort.printArray(arr);
    }
}
