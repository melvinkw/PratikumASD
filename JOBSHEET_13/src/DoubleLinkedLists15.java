import org.w3c.dom.Node;

public class DoubleLinkedLists15 {
    Node15 head;
    Node15 tail;

    DoubleLinkedLists15() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student15 data) {
        Node15 newNode15 = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode15;
        } else {
            newNode15.next = head;
            head.prev = newNode15;
            head = newNode15;
        }
    }

    void addLast(Student15 data) {
        Node15 newNode15 = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode15;
        } else {
            tail.next = newNode15;
            newNode15.prev = tail;
            tail = newNode15;
        }
    }

    void insertAfter(String key, Student15 data) {
        Node15 newNode15 = new Node15(data);
        Node15 temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                found = true;
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode15.next = temp.next;
                    newNode15.prev = temp;
                    temp.next.prev = newNode15;
                    temp.next = newNode15;
                }
                break; // Fix for Question 10
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Insertion failed. Data (" + key + ") not found!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            Node15 temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }

    //Experiment 2
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Updated remove method with bounds checking for Question 7
    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        } 
        if (index < 0) {
            System.out.println("Invalid index! Index cannot be negative.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node15 temp = head;
            for (int i = 0; i < index; i++) {
                if (temp == null) break; // Out of bounds check
                temp = temp.next;
            }
            
            if (temp == null) {
                System.out.println("Index exceeds the size of the Linked List!");
            } else if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }
}