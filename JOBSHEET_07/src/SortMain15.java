public class SortMain15 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        
        System.out.println("Sorting with merge sort");
        MergeSort15 mSort = new MergeSort15();
        
        System.out.println("Initial Data");
        mSort.printArray(data);
        
        mSort.mergeSort(data);
        
        System.out.println("Sorted Data");
        mSort.printArray(data);
    }
}