package guvi;

import java.util.Arrays;
import java.util.HashSet;

public class Commonelements {
public static void main(String[] args) {
		 Integer[] i1 = {1, 2, 3, 4, 5, 4};
	 
     Integer[] i2 = {3, 4, 5, 6, 7, 4};

     HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));

     HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
     
     HashSet<Integer> set3 = new HashSet<>();
     set1.retainAll(set2);

   //  System.out.println(set1); 
    	 set3.addAll(set1);
    	 System.out.println(set3);
    	 
     }
}