import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListBuyer queueList = new DoubleLinkedListBuyer();
        DoubleLinkedListOrder orderList = new DoubleLinkedListOrder();

        queueList.addLast(new Buyer(1, "Ainra", "08224500000"));
        queueList.addLast(new Buyer(2, "Danra", "08224511111")); 
        queueList.addLast(new Buyer(3, "Sanri", "08224522222")); 
        int currentQueueNo = 4;

        int menu = -1;
        do {
            System.out.println("========================================");
            System.out.println("ROYAL DELISH QUEUE SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Queue"); 
            System.out.println("2. Print Queue"); 
            System.out.println("3. Remove Queue and Messages");
            System.out.println("4. Order Report"); 
            System.out.println("0. Exit"); 
            System.out.print("Select menu : "); 
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Buyer Name : "); 
                    String nama = sc.nextLine();
                    System.out.print("No HP      : "); 
                    String noHp = sc.nextLine();
                    
                    queueList.addLast(new Buyer(currentQueueNo, nama, noHp));
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + currentQueueNo);
                    currentQueueNo++;
                    break;
                
                case 2:
                    queueList.printQueue();
                    break;
                
                case 3: 
                    if (queueList.isEmpty()) {
                        System.out.println("Antrian kosong. Tidak ada yang bisa dilayani.");
                    } else {                        
                        queueList.printQueue();
                        System.out.println();

                        System.out.print("Masukkan Nomor Antrian yang akan dilayani/dihapus: ");
                        int index = sc.nextInt();
                        sc.nextLine(); // Consume newline

                        Buyer ServedBuyer = queueList.removebyIndex(index);

                        if(ServedBuyer != null){
                            System.out.print("Order Code: "); 
                            int orderCode = sc.nextInt();
                            sc.nextLine(); 
                            System.out.print("Order Name: "); 
                            String orderName = sc.nextLine();
                            System.out.print("Price     : "); 
                            int price = sc.nextInt();
                            sc.nextLine();
                            orderList.addLast(new Order(orderCode, orderName, price)); 
                            System.out.println(ServedBuyer.name + " telah memesan " + orderName);
                        } 
                    }
                    break;         
                case 4:
                    orderList.printOrderReport();
                    break;
                    
                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (menu != 0);
        
        sc.close();
    }
}