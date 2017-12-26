package deal;

public class Program {
    public static void main(String[] args) {

        Deal[] deal = new Deal[5];
        
        Party buyer = new Party();
        buyer.setName("Sergey");
        
        Party seller = new Party();
        seller.setName("Target");
        
        Product[] products = new Product[5];
        products[0] = new Product();
        products[0].setTitle("Maslo");
        products[0].setQuantity(5);
        products[0].setPrice(80.6);
        
        deal[0] = new Deal(buyer, seller, products);
    }
}
