public class LectureData15 {
    Lecture15[] LectureData15;
    int idx;

    public LectureData15() {
        LectureData15 = new Lecture15[10];
    }

    void tambah(Lecture15 dsn) {
        if (idx < LectureData15.length) {
            LectureData15[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    void print() {
        if (idx == 0) {
            System.out.println("No lecturer data available.");
        } else {
            for (int i = 0; i < idx; i++) {
                LectureData15[i].print();
            }
        }
    }

    // Bubble Sort Ascending by age
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (LectureData15[j].usia > LectureData15[j + 1].usia) {
                    Lecture15 temp = LectureData15[j];
                    LectureData15[j] = LectureData15[j + 1];
                    LectureData15[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Descending by age
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (LectureData15[j].usia > LectureData15[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Lecture15 temp = LectureData15[maxIndex];
            LectureData15[maxIndex] = LectureData15[i];
            LectureData15[i] = temp;
        }
    }

    // Optional insertion sort descending by age
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Lecture15 temp = LectureData15[i];
            int j = i;
            while (j > 0 && LectureData15[j - 1].usia < temp.usia) {
                LectureData15[j] = LectureData15[j - 1];
                j--;
            }
            LectureData15[j] = temp;
        }
    }
}