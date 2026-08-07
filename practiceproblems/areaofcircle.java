import java.util.Scanner;
public class areaofcircle{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius: ");
        double radius = scanner.nextDouble();
        double answer = (Math.PI * radius * radius);
        System.out.println("area of circle is" + answer );
        scanner.close();

    }
}
