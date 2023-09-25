/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import java.util.*;

/**
 *
 * @author Dell
 */
class Box{
    private int length;
    private int breadth;
    private int height;
    
    public Box(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    
    public void calcArea(){
        System.out.println("area is "+ (length*breadth*height));
    }
    
    public int calcPeri(){
        int peri =length+breadth+height; 
        return peri;
    }
}
public class ClassConceptDemo {
    public static void main(String[] args) {
        Box b1 = new Box(50,50,40);
        b1.calcArea();
        int peri1 = b1.calcPeri();
        System.out.println("perimeter is "+peri1);
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of box");
        int len = sc.nextInt();
        System.out.println("enter breadth of box");
        int bre = sc.nextInt();
        System.out.println("enter height of box");
        int hei = sc.nextInt();
        Box b2 = new Box(len,bre,hei);
        b2.calcArea();
        int peri2 = b2.calcPeri();
        System.out.println("perimeter of box is "+ peri2);
    }
}

