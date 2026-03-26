import java.util.Scanner;
public class volumeofcircle{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("enter height :");
        double height = scanner.nextDouble();
        double answer = (3.14 * radius*radius * height);
        System.out.println("volume of circle is" + answer );
        scanner.close();

    }
}