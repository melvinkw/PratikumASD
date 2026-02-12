public class fuction {

    public static int calculateIncome(int[] stock, int[] price) {

        int total = 0;

        for (int i = 0; i < stock.length; i++) {
            total += stock[i] * price[i];
        }

        return total;
    }

    public static String getStatus(int income) {

        if (income > 1500000) {
            return "Very Good";
        } else {
            return "Need Evaluation";
        }
    }

    public static void main(String[] args) {

        int[][] stock = {
                {10, 5, 15, 7},   // RoyalGarden 1
                {6, 11, 9, 12},   // RoyalGarden 2
                {2, 10, 10, 5},   // RoyalGarden 3
                {5, 7, 12, 9}     // RoyalGarden 4
        };

        String[] branches = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        String[] flowers = {
                "Aglonema",
                "Yam",
                "Alocasia",
                "Rose"
        };

        int[] price = {
                75000,  // Aglonema
                50000,  // Yam
                60000,  // Alocasia
                10000   // Rose
        };

        System.out.println("=================================");
        System.out.println("RoyalGarden Income Report");
        System.out.println("=================================");

        for (int i = 0; i < stock.length; i++) {

            int income = calculateIncome(stock[i], price);

            String status = getStatus(income);

            System.out.println(branches[i]);
            System.out.println("Income : IDR " + income);
            System.out.println("Status : " + status);
            System.out.println("---------------------------------");
        }
    }
}
