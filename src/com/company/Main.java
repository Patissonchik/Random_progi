package com.company;
import java.util.Locale;
import java.util.Scanner;
class Vector2D{
    public double vX=0;
    public double vY=0;
    public int count=3;
    public Vector2D() {
        vX = vX+1;
        vY = vY+1;
    }
    public Vector2D(double x, double y) {
        vX = vX+x;
        vY = vY+y;
    }
    public Vector2D(double Vector2D){
    }
    public Vector2D(Vector2D v) {
        vX = vX+v.vX;
        vY = vY+v.vY;
    }
    public double length(){
        double a = Math.sqrt(vX*vX+vY*vY);
        return a;
    }
    void add(Vector2D v){
        vX= vX+v.vX;
        vY= vY+v.vY;
    }
    void sub(Vector2D v){
        vX= vX-v.vX;
        vY= vY-v.vY;
    }
    void scale(double scaleFactor){
        vX=vX*scaleFactor;
        vY=vY*scaleFactor;
    }
    public double normalized(){
        double a=Math.sqrt(vX*vX+vY*vY);
        vX=vX/a;
        vY=vY/a;
        double c = vX*vX+vY*vY;
        return c;
    }
    public double dotProduct(Vector2D v){
        double b= (vY*v.vY+vX*v.vX);
        return b;
    }
    public void count(){
        int b=3;
        System.out.println(b);
    }
    public void print() {
        System.out.println("("+String.format(Locale.US, "%.2f", vX)+", "+String.format(Locale.US, "%.2f", vY)+")");
    }
}
public class Main {
    public static void main(String[] args) {
// write your code here
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double s = in.nextDouble();
        double s1 = in.nextDouble();
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(x, y);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(s);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(s1);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}




