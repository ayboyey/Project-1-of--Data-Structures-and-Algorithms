package dsaa.lab01;

public class Drawer {
    private static void drawLine(int n, char ch) {

    }


    private static String pyramid(int n, int move) {
        String py = "";
       
        int Largest = 2*n-1;
        int current = 1;
        for (int i = 0; i < n; i++) {
            int spaces = (Largest - current)/2;
            
            for (int j = 0; j < spaces + move; j++) {
                py += " ";
            }
           
            for (int j = 0; j < current; j++) {
                py += "X";
            }
           
            py += "\n";

           
            current += 2;
        }
        return py;
    }

    public static void drawPyramid(int n) {
        System.out.print(pyramid(n, 0));
    }


    public static void drawChristmassTree(int n) {
     
        int j = n-1;
        for (int i = 1; i <= n; i++) {
            System.out.print(pyramid(i, j));
            j--;
        }
    }

}