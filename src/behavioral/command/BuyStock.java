package behavioral.command;

public class BuyStock implements Order {
    private Stock stock;

    // внедрение зависимости
    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
