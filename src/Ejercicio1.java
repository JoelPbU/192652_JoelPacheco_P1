import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Leemos los datos del usuario
        System.out.println("Ingrese numero a:");
        float NumA = scanner.nextFloat();

        System.out.println("Ingrese numero b:");
        float NumB = scanner.nextFloat();
        //Primera condicion
        if (NumA>NumB)
        {
            //suma
            float suma = NumA+NumB;
            System.out.println("Suma: " + suma);
            //diferencia
            float diff = NumA-NumB;
            System.out.println("Diferencia: "+ diff);
        }
        //Segunda condicion
        if (NumB>NumA || NumA==NumB)
        {  
            //producto
            float producto = NumA*NumB;
            System.out.println("Producto: " + producto);
            //Cuando B==0
            if (NumB==0)
            {
                System.out.println("Division no definida(b es 0)");
            }
            else
            {
                //division
                float division = NumA/NumB;
                System.out.println("Division(a/b): " + division);
            }
        }
    scanner.close();
    }
}