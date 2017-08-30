/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Randy
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication2 app = new JavaApplication2();
        app.run();
    }
    void run(){
        double num=2.0;
        double squared = square(num);
        System.out.println("your number squared is : "+ squared);
    }
    double square(double num)
    {
        double square;
        square =num*num;
        System.out.println("your number squared " + square);
        return square;
    }
}
