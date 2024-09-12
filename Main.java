import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digitame un numero");
        double numero2=sc.nextDouble();

        System.out.println("Digitame su multiplo");
        double numero1= sc.nextDouble(); 
        
        Logic llamarLogic = new Logic(numero1, numero2);
        int calMultiplo = llamarLogic.calcularMultiplo();

        
        switch (calMultiplo) {
            case 0: 
                System.out.println("Error, no se puede dividir por cero");
                break;
            case 1:
                System.out.println(numero1+" es multiplo de "+numero2);
                break;
            case 2:
                System.out.println(numero1+" no es multiplo de "+numero2+" pero "+numero2+" si es multiplo de "+numero1);
                break;
            default:
                System.out.println("no son multiplos");
                break;
        }
        /*implemente el switch en este caso porque en la clase, me dijo que es mejor en terminos de rendimiento usar un switch
         * que un if anidado, ya que el switch usa el caso que se cumpla, mas el if itera cada procedimiento hasta el verdadero
         */
    }
}
