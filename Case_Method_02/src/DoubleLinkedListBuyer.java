public class DoubleLinkedListBuyer {
    NodeBuyer head; 
    NodeBuyer tail; 
    int size;

    public DoubleLinkedListBuyer() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null; 
    }

    public void addLast(Buyer item) {
        if (isEmpty()) {
            head = new NodeBuyer(null, item, null);
            tail = head; 
        } else {
            NodeBuyer newNode = new NodeBuyer(tail, item, null);
            tail.next = newNode; 
            tail = newNode; 
        }
        size++; 
    }

    public Buyer removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Buyer removedData = head.data;
        if (head == tail) {
            head = null;
            tail = null; 
        } else {
            head = head.next; 
            head.prev = null; 
        }
        size--;
        return removedData;
    }

    public Buyer removebyIndex(int queueNum){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
            return null;
        }

        NodeBuyer temp = head;
        while (temp != null) {
            if(temp.data.queueNumber == queueNum){
                Buyer foundBuyer = temp.data;

            if(temp == head){
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null; // List jadi kosong
                }
            }else if(temp == tail){
                tail = tail.prev;
                tail.next = null;
            }else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            size--;
            return foundBuyer;
            }
            temp = temp.next; 
        }

        System.out.println("Peringatan: Nomor antrian " + queueNum + " tidak ditemukan!");
        return null;
        
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("========================================");
        System.out.println("Daftar Antrian Pembeli"); 
        System.out.println("========================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        NodeBuyer current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.data.queueNumber, current.data.name, current.data.mobileNumber);
            current = current.next;
        }
    }
}