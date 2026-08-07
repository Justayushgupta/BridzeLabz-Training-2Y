import java.util.Scanner;
public class perimeteRctangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length:");
        double length = sc.nextDouble();
        System.out.println("enter the width:");
        double width = sc.nextDouble();
        double perimeter = 2*(length + width);
        System.out.println("perimeter is :" + perimeter);

        sc.close();

        
        }
    }