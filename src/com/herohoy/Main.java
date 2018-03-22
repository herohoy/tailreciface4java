package com.herohoy;

import com.herohoy.tailrec.FactorialTailRecursion;

/**
 * @author lihui  2018/3/22 下午5:35
 **/
public class Main {
    public static void main(String[] args){
        // StackOverflowError
//        FactorialTailRecursion.factorialTailRecursionNonInterface(1,100000);
        System.out.println(FactorialTailRecursion.factorialTailRecursion(1L,10000000L).invoke());
    }
}
