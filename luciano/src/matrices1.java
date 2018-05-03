
import java.util.Scanner;

public class matrices1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz;
        
        matriz = cargar();
        imprimir(matriz);

    }

    public static int[][] cargar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas");
        int filas = teclado.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[f].length; c++) {

                System.out.println("Ingrese valor");
                matriz[f][c] = teclado.nextInt();

            }

        }

        return matriz;
    }
    
    public static void imprimir(int[][] matriz){
        
        
        for(int i = 0;i<matriz.length;i++){
            
            System.out.println();
            
            for(int j = 0;j<matriz[i].length;j++){
                
                System.out.print(matriz[i][j] + " ");
                
            }
                    
                    
            
        }
        
        
        
        
        
    }

}
