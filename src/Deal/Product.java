package Deal;

public class Product {
    private String title;
    private double price;
    private int quantity;
    private double cost;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost = price * quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
