package com.company;

public class finallyblock {

        public static int div(int a,int b) {
            int c = a / b;
            return c;
        }
        public static void main (String[]args){
                try {
                    int x = div(20, 0);
                    System.out.println(x);
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    System.out.println("Finally Block will always be executed");
                }
            //Another possible scenario
            int d = 10;
            int e = 5;

            while (true) {
                try {
                    System.out.println(d / e);
                } catch (Exception a) {
                    System.out.println(a);
                    break;
                }
                finally {
                    System.out.println("This is Final");
                }
                e--;
            }
        }
}


