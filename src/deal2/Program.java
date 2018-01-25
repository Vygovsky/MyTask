package deal2;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Logic logic=new Logic();

        logic.isNewDeal();
        logic.addsProducts();
        logic.serialize("OutputStreamDeals.ser");



    }
}
