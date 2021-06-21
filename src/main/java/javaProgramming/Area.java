package javaProgramming;

import java.util.*;

public class Area {

    static double switchCase(int choice, List<Double> arr){
        double area = 0.00;
        switch(choice){

            case 1:
                area = (Math.PI)*arr.get(0)*arr.get(0);
                break;
            case 2:
                area = arr.get(0)*arr.get(1);
                break;

        }
        return area;
    }

    public static void main(String[] args) {

        int choice = 1;
        List<Double> arr = new ArrayList<Double>();
        arr.add(93.00);
        double area = switchCase(choice,arr);
        System.out.println("Area is "+area);

        }
    }
