import java.util.HashMap;

public class StockPortfolio {
    private HashMap<Stock, Integer> allStocks = new HashMap<Stock, Integer>();

    public StockPortfolio() {

    }

    public void addStock(Stock stock, int quantity) {
        allStocks.put(stock, quantity);
    }

    public void viewPortfolio() {

    }
    // 
}
