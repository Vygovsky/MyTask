package deal2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Logic {
    private List<Product> products = new ArrayList<>();
    private List<Deal> deals = new ArrayList<>();
    private Date date = new Date();

    private Scanner sc = new Scanner(System.in);

    public Logic() throws IOException {
    }

    protected boolean isNewDeal() {
        while (true) {
            System.out.println("Вы хотите совершить новую сделка Y или N");
            switch (sc.next()) {
                case "Y":
                    return true;
                case "N":
                    System.exit(0);
            }
        }
    }

    public Party createParty() {
        System.out.print("Введите ваше имя: ");
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
        Deal deal = new Deal(createParty(), products);
        while (true) {
            System.out.println("Добавить продукт Y или N");
            switch (sc.next()) {
                case "Y":
                    Product product = inputProduct();
                    products.add(product);
                    break;
                case "N":
                    deal.setProducts(products);
                    deals.add(deal);
                    printInfoProduct(deals.get(deals.size() - 1));
                    getSum(deal);
                    System.out.println("===========================");
                    isNewDeal();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public void printInfoProduct(Deal deal) {
        for (Product product : products) {
            System.out.println(product);
        }
        // System.out.println("Общая стоимоть покупок: " + totalSum(deal) + " " + date);
    }

    public double totalSum(Deal deal) {
        double sum = deal.getSum();
        return sum;
    }

    public void getSum(Deal deal) {
        System.out.println("Общая стоимоть покупок: " + totalSum(deal) + " " + date);
    }

    public void serialize(String fileName) {
        try (FileOutputStream fs = new FileOutputStream(fileName);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(deals);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}

