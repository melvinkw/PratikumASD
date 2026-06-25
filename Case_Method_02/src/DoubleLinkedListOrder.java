public class DoubleLinkedListOrder {
    NodeOrder head;
    NodeOrder tail;
    int size;

    public DoubleLinkedListOrder() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Order item) {
        if (isEmpty()) {
            head = new NodeOrder(null, item, null);
            tail = head;
        } else {
            NodeOrder newNode = new NodeOrder(tail, item, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void sortOrdersByName() {
        if (isEmpty() || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            NodeOrder current = head;
            while (current.next != null) {
                if (current.data.OrderName.compareToIgnoreCase(current.next.data.OrderName) > 0) {
                    Order temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printOrderReport() {
        if (isEmpty()) {
            System.out.println("Belum ada data pesanan.");
            return;
        }
        sortOrdersByName(); 
        
        System.out.println("========================================");
        System.out.println("            LAPORAN PESANAN");
        System.out.println("========================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodeOrder current = head;
        int totalprice = 0;

        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.data.OrderCode, current.data.OrderName, current.data.price);
            totalprice += current.data.price;
            current = current.next;
        }
        System.out.println("=========================================");
        System.out.println("Total Price= " + totalprice);
    }
}