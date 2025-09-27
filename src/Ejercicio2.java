import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Arreglo para las notas
        float[] notas = new float[3];
        //Declaracion de Variables   
        float promedio,SumaPromedio = 0;
        int NumeroDeNotas = 3;
        
        //Iteramos por el arreglo
        for(int i = 0; i<NumeroDeNotas; i++)
        {
            //Pedimos las notas
            System.out.println("Ingrese las notas: ");
            notas[i] = scanner.nextFloat();
            //Validamos el rango de las notas
            if (notas[i]<0 || notas[i]>5.0)
            {
                System.out.println("Nota invalida");
                break;
            }
            else
            {
                //Suma de las notas
                SumaPromedio = notas[i]+SumaPromedio;

            }
            
        }
        //Promedio de las notas
        promedio = SumaPromedio/NumeroDeNotas;
        System.out.printf("Promedio: %.2f%n", promedio);
        //Comparamos el promedio y evaluamos los estados
        if (promedio>= 4.5)
        {
            System.out.println("Estado: Promocionado");
        }
        if(promedio>= 4.0 && promedio<4.5)
        {
            System.out.println("Estado: Regular");
        }
        if (promedio<4.0)
        {
            System.out.println("Estado: Reprobado");
        }


     scanner.close();   
    }
}