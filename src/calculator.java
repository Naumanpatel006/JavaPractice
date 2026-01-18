import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        System.out.println("Percentage calculator :)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Math:");
         int math= sc.nextInt();

        System.out.println("Physics:");
         int Physics= sc.nextInt();

        System.out.println("Chemistry:");
         int chem= sc.nextInt();

        System.out.println("English:");
         int eng= sc.nextInt();
        float percentage = ((math + Physics + chem + eng)/(400.0f))*100;
        System.out.println("Percentage=" + percentage + "%");


    }
}
