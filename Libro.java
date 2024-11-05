public class Libro {

    private static int autonumerico = 1;
    private int id;
    private String titulo;
    private String autor;
    private int cantPaginas;
    private boolean abierto;

    public Libro(String pTitulo, String pAutor, int pCantPaginas){
        this.id=autonumerico;
        this.titulo =pTitulo;
        this.autor=pAutor;
        this.cantPaginas=pCantPaginas;
        this.abierto=false;
        autonumerico++;
    }

    public void abrir(){
        this.abierto=true;
        System.out.println("El libro ha sido abierto");
    }

    public void cerrar(){
        this.abierto=false;
        System.out.println("El libro ha sido cerrado");
    }

    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void mostrarInformacion(){
        System.out.println("Id: "+this.id+", Titulo: "+this.titulo+ ", Autor: "+this.autor+", C. Páginas: "+this.cantPaginas+", el libro está "+(abierto?"abierto":"cerrado"));
    }


}
