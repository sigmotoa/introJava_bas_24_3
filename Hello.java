import java.util.Scanner;
public class Hello{
  public static void main(String args[]){

    Scanner leer = new Scanner(System.in);
    System.out.println("Hola en JAVA desde Bloc de notas");
    System.out.println("Ingresa tu nombre");

    String name = leer.nextLine();

    System.out.println("Gracias por venir "+name);
    System.out.println("Ingrese su año de nacimiento");
    int year = leer.nextInt();
    System.out.println(name+" tienes "+(2025-year)+" años");

  }
}
