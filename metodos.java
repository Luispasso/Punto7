import java.util.Scanner;

public class metodos {
    
    public datos[][] llenarMatriz(datos[][] m){
        Scanner sc = new Scanner(System.in);
        String cal;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
             
                datos o = new datos();
                System.out.println("Ingrese el nombre del estudiante: ");
                o.setNombre(sc.next());
                System.out.println("Ingrese la calificacion del estudiante: ");
                cal = sc.next();
                cal = cal.toUpperCase();
                o.setCalificacion(cal);
                m[i][j] = o;

            }
        }
        return m;
    }

    public void clasificacion(datos[][] m){
        datos [][] A = new datos[2][2];
        datos [][] B = new datos[2][2];
        datos [][] C = new datos[2][2]; 
        datos [][] D = new datos[2][2];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (m[i][j].getCalificacion().equalsIgnoreCase("A")) {
                    A[i][j] = m[i][j];
                } else if (m[i][j].getCalificacion().equalsIgnoreCase("B")) {
                    B[i][j] = m[i][j];
                } else if (m[i][j].getCalificacion().equalsIgnoreCase("C")) {
                    C[i][j] = m[i][j];
                } else if (m[i][j].getCalificacion().equalsIgnoreCase("D")) {
                    D[i][j] = m[i][j];
                }
            }
        }

        imprimirMatriz(A);
        imprimirMatriz(B);
        imprimirMatriz(C);
        imprimirMatriz(D);
    }

    public static void imprimirMatriz(datos[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                if (m[i][j] != null) {
                    System.out.println("Nombre: " + m[i][j].getNombre() + " Calificación: " + m[i][j].getCalificacion());
                }                
            }           
        }
        System.out.println("-----------------------------");
    }


}
