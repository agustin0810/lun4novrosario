import java.util.ArrayList;

public class GestionLibros {

    public void agregarLibro(ArrayList<Libro> libros, Libro l){
        libros.add(l);
        System.out.println("Se agregó el libro con éxito");
    }
    public void agregarLibro(ArrayList<Libro> libros, String pTitulo, String pAutor, int pCantPaginas){
        libros.add(new Libro(pTitulo, pAutor, pCantPaginas));
        System.out.println("Se agregó el libro con éxito");
    }

    public void eliminar(ArrayList<Libro> coleccion, String pTitulo){
        for(Libro l : coleccion){
            if(pTitulo.equals(l.getTitulo()))
                coleccion.remove(l);
        }
    }

    public void eliminar(ArrayList<Libro> coleccion, int pId){
        Libro l = buscarLibroPorId(coleccion, pId);
        coleccion.remove(l);
    }

    public Libro buscarLibroPorId(ArrayList<Libro> coleccion, int pId){
        for(int i =0;i<coleccion.size();i++){
            if(coleccion.get(i).getId()==pId)
                return coleccion.get(i);
        }
        return null;
    }
}
