package chapter7.examples.example8rekursia;

public class Factorial {
    int fact(int n){
        int result;
        if(n==1) return 1;
        result = n* fact(n-1) ;
        return result;
    }
}
//
//        public static void main(String[] args) {
//            int i = 5;
//            int count =1;
//            for (i = 5; i >0 ; i--) {
//                count *=i;
//
//            }
//            System.out.println(count);
//
//        }