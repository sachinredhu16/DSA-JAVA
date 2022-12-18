package patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        /*
         *	*	*	*	*
         *	*	*	*
         *	*	*
         *	*
         *
         */

        Scanner scn = new Scanner(System.in);

        // write ur code here
        int num = scn.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
