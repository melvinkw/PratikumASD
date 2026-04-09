public class SortingMain15{
    public static void main(String[] args) {

        int[] a = {34, 7, 23, 32, 5, 62};

        Sorting15 dataurut1 = new Sorting15(a);
        System.out.println("Original Array:");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Sorted Array (Bubble sort)");
        dataurut1.tampil();


        int[] b = {34, 7, 23, 32, 5, 62};
        Sorting15 dataurut2 = new Sorting15(b);
        System.out.println("Original Array:");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Sorted Array (Selection Sort)");
        dataurut2.tampil();


        int[] c = {34, 7, 23, 32, 5, 62};
        Sorting15 dataurut3 = new Sorting15(c);
        System.out.println("Original Array:");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Sorted Array (Insertion sort)");
        dataurut3.tampil();
    }
}