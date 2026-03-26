import java.util.Scanner;
public class converttemperature{
    public static void main(String[]args){
       try(Scanner scanner = new Scanner(System.in)){
        System.out.println("enter temperaturein celcius: ");
        double celsius = scanner.nextDouble();
        double fahrenhiet = (celsius * 9/5) +32;
        System.out.println(celsius + "°C is equal to " + fahrenhiet + "°F");
       }}}