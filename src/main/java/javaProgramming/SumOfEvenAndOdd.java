package javaProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SumOfEvenAndOdd {

    public static ArrayList<Integer> Sum(int N){

        int evenSum =0,oddSum =0;
        ArrayList<Integer> sum = new ArrayList<Integer>();

        for(int i=1;i<=N;i++){

            if(i%2 == 0){
                evenSum = evenSum + i;
            }
            else{
                oddSum = oddSum + i;
            }
        }
        sum.add(evenSum);
        sum.add(oddSum);
        return sum;

    }

    public static void main(String[] args){

        int N=10000;
        ArrayList sum = Sum(N);
        System.out.println("Sum of Even Numbers is: "+sum.get(0));
        System.out.println("Sum of Odd Numbers is: "+sum.get(1));

    }
}
