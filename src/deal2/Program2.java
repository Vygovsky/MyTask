package deal2;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program2 {
    Date date = new Date();

    private List<Deal> deals;


    private String keyboard(String message) {
        System.out.println(message + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

  /*  private Deal inputDeal() {
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
*/
  /*  public void input() {
        deals = new Deal[maxDeal];
        for (int i = 0; i < deals.length; i++) {
            deals[i] = inputDeal();
        }
    }*/

    private Party inputParty() {
        String partyName = keyboard("Input Party");
        Party party = new Party();
        party.setName(partyName);
        return party;
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

    public void printInfo(Deal deal) {
        for (Product product : deal.getProducts()) {
            System.out.println(product);
        }
        System.out.println("Общая стоимоть покупок: " + totalSum(deal) + " " + date);
    }
    public double totalSum(Deal deal){
        double sum = deal.getSum();
        return sum;
    }

  /*  public static void main(String[] args) {
        Program2 pr = new Program2();
        Deal deal = pr.inputDeal();
        pr.printInfo(deal);


    }*/
}