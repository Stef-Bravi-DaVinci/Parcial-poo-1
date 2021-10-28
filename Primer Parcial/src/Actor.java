public class Actor {

    //ATRIBUTOS
    String nombre;
    String apellido;
    String pais;
    int añoNacimiento;

    //CONSTRUCTOR
    public Actor (String nombre, String apellido, String pais, int añoNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.añoNacimiento = añoNacimiento;
    }

    //METODO
    public void calcularEdad(int añoActual){     //VER ESTO!
        añoActual = añoActual - añoNacimiento;
    }

    @Override
    public String toString() {
        return "Actor: " + this.nombre + this.apellido;
    }
}
