package com.example.ACTIVITY;
import java.util.*;
public class Activity2 {
    public static void main(String args[]){
        int[] array = {10, 77, 10, 54, -11, 10};
        System.out.println("Array" + Arrays.toString(array) );

        int NumToSearch = 10;
        int Sum = 30;

        System.out.println("Result: " + result(array, NumToSearch, Sum));
    }
        public static boolean result(int[] numbers, int NumToSearch, int Sum) 
        {
            int temp_sum = 0;
          
            for (int number : numbers) 
            {
              
                if (number == NumToSearch) {
                  
                    temp_sum += NumToSearch;
                }

                if (temp_sum > Sum) {
                    break;
                }
            }
            return temp_sum == Sum;
        }
    
    

}
