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
    int age = 2025-year;
    System.out.println(name+" tienes "+age+" años");

    if(age>18)
    {
      System.out.println("Bienvenido a bebestar");
    }
    else
    {
      System.out.println("Regrese en "+(18-age)+" años");
    }




  }
}
