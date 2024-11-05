import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro l = new Libro("Harry Potter y la Piedra Filosofal", "J.K Rowling", 309);

        ArrayList<Libro> libros = new ArrayList<>();

        GestionLibros g = new GestionLibros();
        g.agregarLibro(libros, l);
        g.agregarLibro(libros, "Un titulo", "Un autor", 233);


        g.eliminar(libros, 2);


        for(Libro lib : libros){
            lib.mostrarInformacion();
        }

    }
}