
import java.util.Scanner;

public class AccessoriesDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of Accessories: ");
        int n = sc.nextInt();   
        sc.nextLine();

        Accessories15[] listAccessories = new Accessories15[n];
        String name, category;
        int price, sold, stock, totalSales;

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Accessories ke-" + (i + 1));
            System.out.print("Name      : ");
            name = sc.nextLine();
            System.out.print("Category  : ");
            category = sc.nextLine();
            System.out.print("Price     :Rp.");
            price = sc.nextInt();
            sc.nextLine();
            System.out.print("Sold      : ");
            sold = sc.nextInt();
            sc.nextLine();
            System.out.print("Stock     : ");
            stock = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------------");
            
            listAccessories[i] = new Accessories15();
            
            listAccessories[i].addData(name, category, price, sold, stock);
        }

        System.out.println("\n=== Accessories Data ===");

        for (Accessories15 a : listAccessories) {
            a.printInfo();
        }

        Accessories15.checkStock(listAccessories);

        totalSales = Accessories15.calculateTotalSales(listAccessories);
        System.out.println("\nTotal Sales  :Rp."+totalSales);

        Accessories15.searchCheapestAccessories(listAccessories);

        sc.close();
    }
}
