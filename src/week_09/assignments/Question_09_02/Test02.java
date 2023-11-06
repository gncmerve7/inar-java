package week_09.assignments.Question_09_02;

public class Test02 {
    public static void main(String[] args) {
        Stock st1 = new Stock("Oracle Corporation", "ORCL");
        st1.previousClosingPrice = 34.5;
        st1.currentPrice = 34.35;
        System.out.println("Stock name: " + st1.name);
        System.out.println("Stock symbol: " + st1.symbol);
        System.out.println("Price-change percentage: " + st1.getChangePercent());
    }

}
