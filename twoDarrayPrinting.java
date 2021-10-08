package meethods;

import java.util.Arrays;

public class twoDarrayPrinting {

    public static void main(String[] args) {
        int [][]x = new int[3][3];
        x[0][0]=2;
        x[0][1]=3;
        x[0][2]=1;
        x[1][0]=4;
        x[1][1]=7;
        x[1][2]=3;
        x[2][0]=1;
        x[2][1]=4;
        x[2][2]=2;

        for (int[] ints : x) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
