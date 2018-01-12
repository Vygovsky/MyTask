package deal;

import java.util.Scanner;

public class Program2 {
    int maxDeal = 2;
    static int maxProd = 2;

    private Deal[] deals;


    private static String keyboard(String message) {
        System.out.println(message + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static Deal inputDeal() {
        System.out.println("Input dael: ");

        System.out.println("Seller");
        Party seller = inputParty();

        System.out.println("Bayer");
        Party bayer = inputParty();

        Product[] products = new Product[maxProd];
        for (int i = 0; i < products.length; i++) {
            products[i] = inputProduct();
        }
        Deal deal = new Deal(bayer, seller, products);
        return deal;
    }
    public void input(){

    }

    private static Party inputParty() {
        String partyName = keyboard("Input Party");
        Party party = new Party();
        party.setName(partyName);
        return party;
    }

    private static Product inputProduct() {
        String title = keyboard("Title ");
        String price = keyboard("Price ");
        String quantity = keyboard("Quantity ");
        Product product = new Product();
        product.setTitle(title);
        product.setPrice(Double.parseDouble(price));
        product.setQuantity(Integer.parseInt(quantity));
        return product;
    }

    public static void printInfo(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
    inputDeal();


    }
}