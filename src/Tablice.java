public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[10];
        imiona[0] = "Janusz";
        imiona[1] = "Wiesiek";
        imiona[5] = "Zbyszek";

        System.out.println(imiona[0]);

        int[] liczby = new int[100];
        liczby[5] = 15;
        liczby[30] = 40;
        liczby[70] = 77;

        System.out.println(liczby[5]);

        int[][] liczby2D = new int[5][5];

        liczby2D[4][1] = 6;

        int[][][] liczby3D = new int[3][3][3];

        int[][] liczby2 = new int[5][10];

        int x = 5;
        int[] tab1 = new int[5];
        tab1[0] = 7;
        int[][] tab2 = new int[5][5];
        tab2[3][4] = 7;

        int[][][] tab3;

        double d = 5.5;
        int[] tab4 = {1,2,3,4,5,6};
        double[] tab5 = {3.3,4.4,5.5,6.6};
        int[][] tab6 = {
                {1,2,3},
                {2,3,4},
                {3,4,5},
                {4,5,6}
        };

        int[] cos = tab6[0];
        System.out.println(cos[0]);

        Object[][] tab7 = {
            {1,2,3},
            {"Janusz","Zbyszek"}
        };

        int[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][] q;
    }
}
