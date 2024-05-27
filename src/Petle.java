public class Petle {
    public static void main(String[] args) {
        int[] tab = new int[5000];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i*2+2;
        }

        for(int element : tab) {
            System.out.println(element);
        }

        int[][] tab2 = new int[5][5];

        for(int[] innerTab : tab2) {
            for(int element : innerTab) {
                System.out.println(element);
            }
        }
    }
}
