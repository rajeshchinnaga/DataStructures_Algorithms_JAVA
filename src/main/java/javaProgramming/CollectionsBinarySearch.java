package javaProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsBinarySearch {

    public static void main(String[] args){

       List<Integer> list = new ArrayList<Integer>();
       list.add(6);
       list.add(29);
       list.add(19);
       list.add(22);
       list.add(1);
       list.add(58);
       list.add(52);
       Collections.sort(list);
       for(int a: list){
           System.out.println(a);
       }
       int key = 29;
       int index = Collections.binarySearch(list,key);
       if(index >=0){
           System.out.println("Key Found at: "+index);
       }
       else{
           System.out.println("Key Not Found");
       }

    }
}
