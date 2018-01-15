package deal2;

import java.util.Scanner;

/**
 * Created by Roman_v on 13.01.2018.
 */
public class Logic {
    private Scanner sc = new Scanner(System.in);

    public boolean isNewDeal() {

        while (true) {
            System.out.println("Новая сделка N ili E");
            switch (sc.next()) {
                case "N":
                    return true;
                case "E":
                    return false;
                default:
                    continue;
            }
        }
    }

    public Party createParty() {
        Party bayer = new Party();
        bayer.setName(sc.next());
        return bayer;
    }

    private Product inputProduct() {
        String title = keyboard("Title ");
        String price = keyboard("Price ");
        String quantity = keyboard("Quantity ");
        Product product = new Product();
        product.setTitle(title);
        product.setPrice(Double.parseDouble(price));
        product.setQuantity(Integer.parseInt(quantity));
        return product;
    }

    private String keyboard(String message) {
        System.out.println(message + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public void addsProducts() {
        while (true) {
            System.out.println("добавить продукт Н ili E");
            switch (sc.next()) {
                case "Н":
                    Product product = inputProduct();
                    //todo add prod to ArrayList
                case "E":
                default:
                    break;
            }
        }
    }
}