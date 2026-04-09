public class TopStudent15 {

    Student15[] listStudents;
    int idx;

    public TopStudent15(int size) {
        listStudents = new Student15[size];
    }

    void add(Student15 student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    void print() {
        for (int i = 0; i < idx;i++){
            listStudents[i].print();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudents[j].ipk < listStudents[j + 1].ipk) {
                    Student15 temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {

        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudents[j].ipk < listStudents[minIndex].ipk) {
                    minIndex = j;
                }
            }
            Student15 temp = listStudents[minIndex];
            listStudents[minIndex] = listStudents[i];
            listStudents[i] = temp;
        }  
    }

    void insertionSort(){
        for (int i=1;i<idx;i++){
            Student15 temp = listStudents[i];
            int j = i;
            while (j > 0 && listStudents[j-1].ipk < temp.ipk ){
                listStudents[j] = listStudents[j-1];
                j--;
            }
            listStudents[j]=temp;
        }
    }
}