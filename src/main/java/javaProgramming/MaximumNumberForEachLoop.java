package javaProgramming;

public class MaximumNumberForEachLoop {

    public static int getMax(int array[]){

        int max = 0;
        for(int arr: array){

            if(arr>max){
                max = arr;
            }
        }
        return max;
    }

    public static void main(String[] args){

        int array[] = {21,20,19,29,16,54,1,29,56,98,20};

        int maxNumber = getMax(array);
        System.out.println("Maximum number in the given array is: "+maxNumber);

    }
}
