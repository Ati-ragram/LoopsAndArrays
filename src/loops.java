public class loops {
    public static void main(String[] args ) {
        int [] array = new int [5];
        int array2[] = new int [7];
        int [] array3 = {2, 3, 4, 5, 6, 7};
        int [] array4 = new int []{4, 5, 6, 7, 8, 9};

        int[][] array5 = new int [4][8];

        for (int f = 0; f < array5.length; f++) {
            for ( int g = 0; g < array5.length; g++) {
                array5[f][g] = f+g;
            }
        }

        for (int f = 0; f < array5.length; f++) {
            for (int g = 0; g < array5.length; g++) {
                System.out.println(array5[f][g]);
            }
            System.out.println();
        }


        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > 0; j--) {
                System.out.println(i + "*" + j + "=" +i *j);
            }
            System.out.println();
        }

        int x = 10;
        while (x < 20) {
            System.out.println("Value of x:" + x);
            x++;
        }


        int y = 15;
        do {
            System.out.println("Value of y:" + y);
            y++;
        } while (y <= 20);




    }
}
