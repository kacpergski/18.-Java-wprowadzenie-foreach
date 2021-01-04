import java.sql.SQLOutput;

public class petlaForeach {

    public static void main(String[] args) {
        double [] prices = {22.13, 33.12, 50};

        for(double price2 : prices){
        //  price2 = price2 *1.2;
            System.out.print(price2*1.1+", ");
        }
        System.out.println();
        System.out.println("----Zadanie 2-------------------------");
        System.out.println();

        int[]numbers={1,2,3,5,23,15,23,10,100,22};


        for (int five : numbers){
            if (five%5==0){
                System.out.print(five+", ");
            }

             }

        System.out.println();
        System.out.println("----Zadanie 3-------------------------");
        System.out.println();
        int[][]tabl={{1,2,3},{5,23,15},{23,10,100,22}};

                for( int[]w: tabl){// zmienna "w" przyjmuje wszystkie elementy tablicy wewnwtrzne(zawarotsc wiersza(kolumna 1,2,3 etc)
                    for( int k: w){// zmienna "k" pojedyncze elemety danego wiersza(wlwmenty wewnwtrznych tablic)
                    System.out.print(k + ", ");

                    }
                    System.out.println();
                }



    }
}
