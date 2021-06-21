package javaProgramming;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ForEachLoopPerformance {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();
        long startTime;
        long endTime;

        for(int i=0;i<1000000;i++){
            list.add(i);
        }
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int i : list){
            int a =i;
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For Each Loop Time Taken = "+(endTime-startTime)+" ms");

        startTime = Calendar.getInstance().getTimeInMillis();
        for(int i=0;i<list.size();i++){
            int a =list.get(i);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For Loop Time Taken = "+(endTime-startTime)+" ms");


        //Best approach by calculating the size of list first and then iterating it with for loop
        startTime = Calendar.getInstance().getTimeInMillis();
        int size = list.size();
        for(int i=0;i<size;i++){
            int a =list.get(i);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For Loop Time Taken with precalculating list size = "+(endTime-startTime)+" ms");

        startTime = Calendar.getInstance().getTimeInMillis();
        for(int i=list.size()-1;i>=0;i--){
            int a =list.get(i);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For Loop Time Taken with decreasing order = "+(endTime-startTime)+" ms");
    }
}
