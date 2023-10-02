
package Unit1;

abstract class Calc1{
    private int x;
    private int y;
    public Calc1(int x, int y){
        this.x=x;
        this.y =y;
    }
    public void sum(){
        System.out.println("sum is "+(x+y));
    }
    public abstract void diff(int x, int y);
    public abstract void multi(int x,int y);

}

class Solve1 extends Calc1{
    private int x1;
    private int y1;
    public Solve1(int x1,int y1,int x,int y){
        super(x,y);// calls superclass constructor
        this.x1=x1;
        this.y1=y1;
    }
    
    public void div(){
        System.out.println("division is "+(x1/y1));
    }
    
    public void diff(int x,int y){
        System.out.println("diff is "+(x-y));
    }
    public void multi(int x,int y){
        System.out.println("product is"+(x*y));
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Solve1 s1 = new Solve1(30,30,40,35);
        s1.diff(10, 5);
        s1.multi(2, 5);
        s1.sum();
        s1.div();
        
        //Using reference of abstract clas
        Calc1 c1;
        c1= s1;
        c1.sum();
        c1.diff(30, 5);
        c1.multi(20, 20);
    }
}
