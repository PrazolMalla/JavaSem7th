
package Unit1;
import java.util.*;

class Person{
    private String name;
    private String address;
    private String gender;
    
    public Person(String name,String address,String gender){
        this.name = name;
        this.address=address;
        this.gender=gender;
    }
    
    public void displayPerson(){
        System.out.println("name is "+this.name);
        System.out.println("address is "+this.address);
        System.out.println("gender is "+this.gender);
    }

}

class Student extends Person{
    private int roll;
    private String faculty;

    public Student(int roll,String faculty, String name, String address, String gender) {
        super(name, address, gender);
        this.roll = roll;
        this.faculty = faculty;
    }
    
    public void displayStudent(){
        System.out.println("roll of student is "+this.roll);
        System.out.println("faculty of Student is "+this.faculty);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1,"CSIT","Prazol","Banasthali","Male");
        s1.displayPerson();
        s1.displayStudent();
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your roll");
        int roll = sc.nextInt();
        System.out.println("enter your faculty");
        String fac = sc.next();
        System.out.println("enter your Name");
        String name = sc.next();
        System.out.println("enter your address");
        String addr = sc.next();
        System.out.println("enter your gender");
        String gender = sc.next();
        
        Student s2 = new Student(roll,fac,name,addr,gender);
        s2.displayPerson();
        s2.displayStudent();
    }
}
