import java.util.ArrayList;

public class Pelicula {

    //ATRIBUTOS
    String titulo;
    int duracion;
    int año;
    String categoria;
    ArrayList<Actor> actores = new ArrayList<Actor>();
    String tituloPelicula;

    //CONSTRUCTORES

    public Pelicula(String titulo, int duracion, int año, String categoria){
        this.titulo = titulo;
        this.duracion = duracion;
        this.año = año;
        this.categoria = categoria;
    }
    public Pelicula (String tituloPelicula){
        this.tituloPelicula = tituloPelicula;
    }
    //METODOS

    public void agregarActor(Actor actor){
        this.actores.add(actor);
    }
    public void removerJugador(Actor actor){
        this.actores.remove(actor);
    }

    public void mostrarActores(){
        System.out.println("Actores de la pelicula: " + tituloPelicula);
        for (int i = 0; i < this.actores.size(); i++) {
            System.out.println(this.actores.get(i));
        }
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + "(" + año + ")";
    }








}
