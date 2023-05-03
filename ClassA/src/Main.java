import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public void meth1() {
     Scanner sc = new Scanner(System.in);
     ClassA aobj = new ClassA();
        System.out.println("Please enter your id");
     aobj.setEmpId(sc.nextInt());
        System.out.println("Please enter your name");
     aobj.setEmpName(sc.next());
        System.out.println("Please enter your salary");
     aobj.setEmpSal(sc.nextInt());
        System.out.println("Please enter your experience");
     aobj.setExperience(sc.nextInt());

        System.out.println("Data entered by you");
        System.out.println("Emp : "+aobj.getEmpId());
        System.out.println("Emp : "+aobj.getEmpName());
        System.out.println("Emp : "+aobj.getEmpSal());
        System.out.println("Emp : "+aobj.getExperience());
        if(aobj.getExperience()>=5){
            System.out.println("your salary rewised : "+(5/aobj.getExperience()*100));
        }else
            System.out.println("your salary rewised: "+(5/aobj.getExperience()*100));

    }
    public static void main(String[] args) {
        new Main().meth1();
    }
}