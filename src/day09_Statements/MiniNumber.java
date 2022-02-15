package day09_Statements;

public class MiniNumber {
    public static void main(String[] args) {

int n1=100;
int n2=200;

boolean n1IsMin= n1<n2;
boolean n2IsMin= n2<n1;
boolean equal=n1==n2;
      if (n1IsMin) {//if n1 is minumum number
      System.out.println(n1+" is minimum number");}
      if (n2IsMin){//if n2 is minumum number
        System.out.println(n2+" is minimum number");}
      if (equal){ //if n1 is equal ton2
        System.out.println(equal);}
/*
        you can write your code like this
        if(n1<n2){
            System.out.println(n1+" is the minimum number");}
            if (n2<n1){
                System.out.println(n2+" is the minimum number");}
                if (n1==n2){
                    System.out.println("equal");}

*/





    }
}
/*
1. Create a class called MinNumber, Write a program that can print
the minimum number between two numbers, if both are equal then print Equal
Ex:
n1= 100, n2 = 200;
output:
100 is the minimum number
n1 & n2
possibility #1: n1 is Min
possibility #2: n2 is Min
possibility #3: equal
 */