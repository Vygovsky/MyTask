package deal;

import java.util.Arrays;
import java.util.Date;

public class Deal {
    private Date date = new Date();
    private Party buyer;
    private Party seller;
    private Product[] products;

    public Deal(Party buyer, Party seller, Product[] products) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal deal = (Deal) o;

        if (date != null ? !date.equals(deal.date) : deal.date != null) return false;
        if (buyer != null ? !buyer.equals(deal.buyer) : deal.buyer != null) return false;
        if (seller != null ? !seller.equals(deal.seller) : deal.seller != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(products, deal.products);
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

}
