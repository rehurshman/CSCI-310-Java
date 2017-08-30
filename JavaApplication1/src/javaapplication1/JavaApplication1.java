/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Randy
 */
public class JavaApplication1 
{
    public int x;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       JavaApplication1 app = new JavaApplication1();
       app.run();
       
    }
    
    void run()
    {
        double radius = 14.0;
        colorCode=BLUE;
        double area = getArea(radius);
        System.out.println("area = " + area);
        System.out.println("my color is " + getColor());
     
    }
    int colorCode;
    
    double getArea(double radius)
    {
        double area = Math.PI*Math.pow(radius,2.0);
        return area; 
    }
    public static final int BLUE =0;
     public static final int RED =1;
    String getColorForCode(int code){
        switch(code){
            case BLUE: return "blue";
            case RED: return "red";
        }
        throw new IllegalArgumentException("invalid color code " + code);
    }
    String getColor(){
        return getColorForCode(colorCode);
    }
}
