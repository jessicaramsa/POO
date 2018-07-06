package Unidad5.Genericidad;

public class TestStack {
    public static void main(String[] args) {
        Stack<Películas> películas = new Stack();
        
        películas.push(new Películas("El Rey León", "Disney"));
        películas.push(new Películas("StarWars", "LucasFilms"));
        películas.push(new Películas("Mulan", "Disney"));
        
        while(!películas.isEmpty()){
            Películas x = películas.pop();
            System.out.println(x.título + " de los estudios " + x.Studios);
        }
        
        Stack<Integer> calificaciones = new Stack();
        
        calificaciones.push(70);
        calificaciones.push(80);
        
        while(!calificaciones.isEmpty()){
            System.out.println(calificaciones.pop());
        }
    }
}
