
package Unit1;

class Question{
    public void solve1(){
        System.out.println("this is solve of superclass");
    }
    public void solve2(int x,int y){
        System.out.println("sum is "+(x+y));
    }
}

class Answer extends Question{
    public void solve1(){
//        super.solve1();
        System.out.println("this is solve of subclass");
        }
    public void solve2(int x, int y){
//        super.solve2(x, y);
        System.out.println("diff is "+(x-y));
    }
    public void calcmulti(int x,int y){
        System.out.println("product is "+(x*y));
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Answer a = new Answer();
        a.solve1();
        a.solve2(4, 3);
        a.calcmulti(5, 6);
        
        // Dynamic method dispatch 
        // using superclass reference to call overriden method of subclass
        System.out.println("Example on dynamic method dispatch");
        Question q1;
        q1 = a;
        q1.solve1();
        q1.solve2(5, 3);
        
    }
}
