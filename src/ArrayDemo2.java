public class ArrayDemo2 {
    public static void main(String[] args) {

        double[] array1 = new double[3];
        double[] array2 = new double[3];

        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;

        array2[0] = 7;
        array2[1] = 1;
        array2[2] = 3;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + array2[i] + ", ");
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array1[i] + array2[i] + ", ");


        }
    }
}
//    double sumFor = 0;
//        for (int i = 0; i < articles.length; i++) {
//        sumFor = sumFor + articles[i];
//        }
//        System.out.println("sumFor: "+ sumFor);

//    double[] articles = new double[5];
//        articles[0] = 2.40;
//                articles[1] = 2;
//                articles[2] = 2.90;


//    double sum = 0;
//        sum = sum + articles[0];
//                sum = sum + articles[1];
//                sum = sum + articles[2];
//                sum = sum + articles[3];