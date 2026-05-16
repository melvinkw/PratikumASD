public class Node15 {
    Student15 data;
    Node15 prev;
    Node15 next;

    Node15() {
    }

    Node15(Student15 data) {
        this.data = data;
        prev = null;
        next = null;
    }

    Node15(Node15 prev, Student15 data, Node15 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}