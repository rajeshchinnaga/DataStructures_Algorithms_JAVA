package javaProgramming;

import java.util.Arrays;

public class ArraysBinarySearch {

    public static void main(String[] args){

        int arr[] = {10,15,9,6,2,29,46,19};

        Arrays.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }

        int key = 29;
        int index = Arrays.binarySearch(arr,key);

        if(index >=0){
            System.out.println("Key found at: "+index);
        }
        else{
            System.out.println("Key Not Found");
        }


    }
}
