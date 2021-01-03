import java.sql.SQLOutput;

public class petlaForeach {

    public static void main(String[] args) {
        double [] prices = {22.13, 33.12, 50};

        for(double price2 : prices){
        //  price2 = price2 *1.2;
            System.out.print(price2*1.1+", ");
        }
    }
}
