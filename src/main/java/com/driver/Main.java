package com.driver;

public class Main {
    //create a class Product inside Main class
    public static class Product{

        //create a method of following defination public int product(int x, int y) {}
        public int product(int x, int y){
            return x*y;
        }
        //create a Overloaded method product of following defination public int product(int x, int y, int z) {}
        public int product(int x, int y, int z){
            return x*y*z;
        }
        //create a Overloaded method product of following defination public double product(double x, double y) {}

        public int product(double x, double y){
            return (int) (x*y);
        }

    }
    //create object of Product in Main function called p
    public static void main(String args[]){
        Product p= new Product();
        //call the 1st method from Main using Product class object p
        p.product(100,200);
        //call the 2nd method also from Main using Product class object p
        p.product(20,30,50);
        //call the 3rd method also from Main using Product class object p
        p.product(60,50);
    }

}