import java.util.Scanner;
public class Proyecto_Montecarlo {

    public static void main(String[] args) {
    System.out.println("BIENVENIDOS");

Scanner sc = new Scanner(System.in);

System.out.println("Ingrese el numero de iteraciones");
int iteraciones = sc.nextInt();
double x, y;
int dentro = 0;

for (int i = 0; i < iteraciones; i++) {
    
    x = Math.random();
    y = Math.random();

    if (x * x + y * y <= 1) {
        dentro++;
    }
}
double precision = (double) dentro / iteraciones * 4;

System.out.println("El valor aproximado de precisión es: " + precision);





 
    }
}
