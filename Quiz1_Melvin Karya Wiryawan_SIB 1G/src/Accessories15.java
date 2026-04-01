public class Accessories15{
    public String name;
    public String category;
    public int price;
    public int sold;
    public int stock;

    public Accessories15(){

    }

    public Accessories15(String nm, String cat, int price, int sold, int stock) {
        this.name = nm;
        this.category = cat;
        this.price = price;
        this.sold = sold;
        this.stock = stock;
    }

    public void addData(String nm, String cat, int price, int sold, int stock) {
        this.name = nm;
        this.category = cat;
        this.price = price;
        this.sold = sold;
        this.stock = stock;
    }

    public void printInfo() {
        System.out.println("Name        : " + this.name);
        System.out.println("Category    : " + this.category);
        System.out.println("Price       : " + this.price);
        System.out.println("Sold        : " + this.sold);
        System.out.println("Stock       : " + this.stock);
        System.out.println("------------------------------------");
    }

    public static void searchCheapestAccessories(Accessories15[] arrayOfDosen) {
        Accessories15 cheapest = arrayOfDosen[0];

        for (Accessories15 a : arrayOfDosen) {
            if (a.price < cheapest.price) {
                cheapest = a;
            }
        }

        System.out.println("\nMost Cheapest Accessories");
        cheapest.printInfo();
    }

    public static void checkStock(Accessories15[] arrayOfDosen){
        System.out.println("\nCheck Stock");

        for (Accessories15 a : arrayOfDosen) {
            if(a.stock <= 5){
                System.out.println(a.name+" : Limited Stock("+a.stock+" Left)");
            }else {
                System.out.println(a.name+" : Many Stock("+a.stock+" Left)");
            }
        }
    }

    public static int calculateTotalSales(Accessories15[] arrayOfDosen){
        int total = 0;

        for (Accessories15 a : arrayOfDosen) {
            total += a.sold*a.price;
        }

        return total;
    }
}
