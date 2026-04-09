public class Sorting15 {
    int[] data;
    int size;

    public Sorting15(int[] Data) {
        this.data = Data;
        this.size = data.length;
    }

    void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i <size; i++) {
            int key = data[i];
            int j = i-1;
            while (j >= 0 && data[j] > key) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
    }

    void tampil() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}