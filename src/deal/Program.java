package deal;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Date date = new Date();

        Deal[] deal = new Deal[1];
        String bayer=keyboard("bayer");

        Party buyer = new Party();
        buyer.setName("Sergey");

        Party seller = new Party();
        seller.setName("Target");

        Product[] products = new Product[3];
        products[0] = new Product();

        products[0].setTitle("масло Олейна");
        products[0].setQuantity(5);
        products[0].setPrice(20);


        products[1] = new Product();
        products[1].setTitle("пиво Опелля");
        products[1].setQuantity(2);
        products[1].setPrice(14.56);


        products[2] = new Product();
        products[2].setTitle("шоколад Аленка");
        products[2].setQuantity(3);
        products[2].setPrice(18);
        printInfo(products);

        deal[0] = new Deal(buyer, seller, products);
        double sum = deal[0].getSum();
        System.out.println("Общая стоимоть покупок: " + sum + " " + date);

    }

    public static void printInfo(Product[] products) {
        for (Product product : products) {
            System.out.println(product);

        }
    }

    public static String keyboard(String message) {
        System.out.println(message+": ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        return str;
    }
}
