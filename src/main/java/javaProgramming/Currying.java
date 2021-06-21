package javaProgramming;

import java.util.function.Function;

public class Currying {

    public static void main(String[] args){

        Function<Integer,Function<Integer, Function<Integer,Integer>>> currying = u -> v -> w -> u+v+w;

        System.out.println("Adding 3 numbers using currying: "+currying.apply(2).apply(3).apply(4));

    }
}
