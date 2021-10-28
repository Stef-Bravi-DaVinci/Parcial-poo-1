public class Main {
    public static void main(String[] args) {
        Actor primerActor= new Actor("Stefano", "Bravi", "Argentina", 1980);
        Actor segundoActor= new Actor("Hernesto", "Hugo", "Argentina", 1980);
        Actor tercerActor= new Actor("Jose", "Ovando", "Argentina", 1980);
        Actor cuartoActor= new Actor("Igancio", "Cortez", "Argentina", 1980);

        Pelicula pelicula1 = new Pelicula("Titanic",120, 2000,"Romance" );
        Pelicula pelicula2 = new Pelicula("El Rey León",120, 2000,"Infantil" );

        Cine nuevoCine = new Cine("Nuevo Cine", "Buenos Aires");

        pelicula1.agregarActor(primerActor);
        pelicula1.agregarActor(segundoActor);

        pelicula2.agregarActor(tercerActor);
        pelicula2.agregarActor(cuartoActor);

        nuevoCine.agregarPelicula(pelicula1);
        nuevoCine.agregarPelicula(pelicula2);

        pelicula1.mostrarActores();
        pelicula2.mostrarActores();

        nuevoCine.mostrarPeliculas();
    }
}
