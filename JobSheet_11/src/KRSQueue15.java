public class KRSQueue15 {
    Student15[] data;
    int front, rear, size, max;
    int completedKRS;
    final int DPA_QUOTA = 30;

    public KRSQueue15(int n) {
        max = n;
        data = new Student15[max];
        size = 0;
        front = 0;
        rear = -1;
        completedKRS = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue has been cleared!");
        } else {
            System.out.println("Queue is already empty!!!");
        }
    }

    void enqueue(Student15 dt) {
        if (isFull()) {
            System.out.println("Queue is full!!!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is successfully added to the queue\n", dt.name);
    }

    void processKRS() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("=== Processing KRS ===");
        for (int i = 0; i < 2; i++) {
            if (!isEmpty()) {
                Student15 dt = data[front];
                front = (front + 1) % max;
                size--;
                completedKRS++;
                System.out.println("KRS approved for: " + dt.name);
            }
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
    }

    void peekTwo() {
        if (size == 0) {
            System.out.println("Queue is empty!!!");
        } else if (size == 1) {
            System.out.println("Only 1 student in line:");
            data[front].print();
        } else {
            System.out.println("First two students in line:");
            data[front].print();
            data[(front + 1) % max].print();
        }
    }

    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Last student in the queue:");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void printStatistics() {
        System.out.println("Total students currently in queue: " + size);
        System.out.println("Students who have completed KRS: " + completedKRS);
        int remaining = DPA_QUOTA - completedKRS;
        System.out.println("Students not yet completed (Remaining Quota): " + remaining);
    }
}