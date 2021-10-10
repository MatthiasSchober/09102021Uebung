public class arrayDemo {
    public static void main(String[] args) {


        double[] articles = new double[5];
        articles[0] = 2.40;
        articles[1] = 2;
        articles[2] = 2.90;


        //double summe = articles[0] + articles[1] + articles[2];
       // System.out.println("Gesamtsumme: " +summe);

        double sum = 0;
        sum = sum + articles[0];
        sum = sum + articles[1];
        sum = sum + articles[2];
        sum = sum + articles[3];

        double sumFor = 0;
        for (int i = 0; i < articles.length; i++) {
            sumFor = sumFor + articles[i];
        }
        System.out.println("sumFor: "+ sumFor);
        }


    }

