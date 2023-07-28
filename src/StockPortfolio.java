import java.util.HashMap;

public class StockPortfolio {
    private HashMap<Stock, Integer> allStocks = new HashMap<Stock, Integer>();
    private int portfolioValue;

    public StockPortfolio() {

    }

    public void addStock(Stock stock, int quantity) {
        allStocks.put(stock, quantity);
    }

    public void viewPortfolio() {
        for (Stock i : allStocks.keySet()) {
        this.portfolioValue += (i.getPrice() * allStocks.get(i));
        }
        int count = 1;
        System.out.println();
        System.out.println("PORTFOLIO VIEW: ");
        System.out.println();
        for (Stock i : allStocks.keySet()) {
            System.out.println("Stock " + count + ": " + i.getSymbol());
            System.out.println("Price (Per Share): $" + i.getPrice());
            System.out.println("Quantity Owned: " + allStocks.get(i));
            System.out.println("Total value owned: $" + (i.getPrice() * allStocks.get(i)));
            System.out.println();
            count++;
          }
        System.out.println();
        System.out.println("Total portfolio value: $" + this.portfolioValue);
        System.out.println();
    }
}
