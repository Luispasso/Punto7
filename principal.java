public class principal {
    

    public static void main(String[] args) {
       metodos o = new metodos();

       datos [][] m = new datos[2][2];
        
       m = o.llenarMatriz(m);
       o.clasificacion(m);
    }
}

