package deal;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Date date = new Date();

        Deal[] deal = new Deal[5];

        Party buyer = new Party();
        buyer.setName("Sergey");

        Party seller = new Party();
        seller.setName("Target");

        Product[] products = new Product[5];
        products[0] = new Product();

        products[0].setTitle("масло Олейна");
        products[0].setQuantity(5);
        products[0].setPrice(20);
        double res = products[0].getCost();
        System.out.println("Общая стоимость: " + res + " " + date);

        products[0].setTitle("пиво Опелля");
        products[0].setQuantity(2);
        products[0].setPrice(14.56);
        double res1 = products[0].getCost();
        System.out.println("Общая стоимость: " + res1 + " " + date);

        products[0].setTitle("шоколад Аленка");
        products[0].setQuantity(3);
        products[0].setPrice(18.20);
        double res2 = products[0].getCost();
        System.out.println("Общая стоимость: " + res2 + " " + date);


        deal[0] = new Deal(buyer, seller, products);


    }
}
