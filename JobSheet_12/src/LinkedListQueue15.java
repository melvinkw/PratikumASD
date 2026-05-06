public class LinkedListQueue15 {
    NodeQueue15 front, rear;
    int size;

    public LinkedListQueue15() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        System.out.println("Queue is dynamic and not restricted by a fixed array size.");
        return false; 
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared.");
    }

    public void enqueue(StudentQueue15 std) {
        NodeQueue15 newNode = new NodeQueue15(std, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Student added to the queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No student to call.");
        } else {
            System.out.println("Calling student:");
            front.data.print();
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    public void printFrontRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("--- Front Student ---");
            front.data.print();
            System.out.println("--- Rear Student ---");
            rear.data.print();
        }
    }

    public void printTotalStudents() {
        System.out.println("Total students currently in queue: " + size);
    }
}