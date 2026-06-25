
public class BinaryTreeArray15 {

    Student15[] data;
    int idxLast;

    public BinaryTreeArray15() {
        data = new Student15[10];
        idxLast = -1;
    }

    void populateData(Student15[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Method to add data into the Array-based BST
    public void add(Student15 student) {
        if (data[0] == null) {
            data[0] = student;
            idxLast = Math.max(idxLast, 0);
            return;
        }

        int currentIdx = 0;
        while (true) {
            if (student.ipk < data[currentIdx].ipk) {
                int leftChildIdx = 2 * currentIdx + 1;
                // Check if array is big enough
                if (leftChildIdx >= data.length) {
                    System.out.println("Array is full, cannot add data.");
                    return;
                }
                if (data[leftChildIdx] == null) {
                    data[leftChildIdx] = student;
                    idxLast = Math.max(idxLast, leftChildIdx);
                    break;
                } else {
                    currentIdx = leftChildIdx;
                }
            } else if (student.ipk > data[currentIdx].ipk) {
                int rightChildIdx = 2 * currentIdx + 2;
                if (rightChildIdx >= data.length) {
                    System.out.println("Array is full, cannot add data.");
                    return;
                }
                if (data[rightChildIdx] == null) {
                    data[rightChildIdx] = student;
                    idxLast = Math.max(idxLast, rightChildIdx);
                    break;
                } else {
                    currentIdx = rightChildIdx;
                }
            } else {
                break;
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print(); // Visit and print root
            traversePreOrder(2 * idxStart + 1); // Traverse left
            traversePreOrder(2 * idxStart + 2); // Traverse right
        }
    }
}
