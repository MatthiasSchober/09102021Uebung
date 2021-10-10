public class findEven {
    public static void main(String[] args) {

        int count = 1; //schleife 10 mal durchlaufen
        int end = 11;

        while (count<end); {
            System.out.println("bin in der Schleife");
            if (count % 2 == 0) {
                System.out.println("bin gerade: " + count);
                count++;
            }


        }
    }
}
