package patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        /*
            *
           **
          ***
         ****
        *****
        */


        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nspaces = n-1;
        int nstars = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nspaces;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=nstars;k++){
                System.out.print("*\t");
            }
            System.out.println();
            nspaces--;
            nstars++;
        }
    }
}
