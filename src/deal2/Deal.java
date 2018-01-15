package deal2;

import java.util.Date;
import java.util.List;

public class Deal {
    private Date date = new Date();
    private Party buyer;
    private Party seller;
    private List<Product> products;

    public Deal(Party buyer, Party seller, List<Product> products) {
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
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

    public List<Product> getProducts() {
        return products;
    }

    public double getSum() {
        double res = 0;
        for (Product product : products) {
            res += product.getCost();
        }
        return res;
    }

}
