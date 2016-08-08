package guvi;

import java.util.Scanner;

public class Floyd {
public static void main(String[] args) {
	 int n, i=1, row, col;
     Scanner in = new Scanner(System.in);

     System.out.println("Enter the number of rows ");
     n = in.nextInt();

     System.out.println("Floyd's triangle :-");

     for (row=1;row<=n;row++)
     {
        for (col=1;col<=row;col++)
        {
           System.out.print(i+" ");
           i++;
        }

        System.out.println();
     }
}
}
