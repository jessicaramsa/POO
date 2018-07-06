package Unidad5.Genericidad;

public class ArreglosGenéricos {
    public static void main(String[] args) {
        Integer [] numSuerte = {1, 2, 7, 5, 8};
        String [] ciudadVisitar = {"San Pancho", "Silao"};
        
        ArreglosGenéricos.<Integer>imprimir(numSuerte);
        ArreglosGenéricos.<String>imprimir(ciudadVisitar);
    }
    
    public static <Tipo> void imprimir(Tipo [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
