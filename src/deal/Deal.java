package deal;

import java.util.Date;

public class Deal {
    private Date date = new Date();
    private Party buyer;
    private Party seller;
    private Product[] products;

    public Deal(String buyer, String seller, String products) {
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
    }

    public double getSum(double sum) {
        return sum;
    }

    public Date getDate() {
        return date;
    }

    public Party getBuyer() {
        return buyer;
    }

    public Party getSeller() {
        return seller;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getSum() {
        double res = 0;
        for (Product product : products) {
            res = product.getCost();
        }
        return res;
    }
}
