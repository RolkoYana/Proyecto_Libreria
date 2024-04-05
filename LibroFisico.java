public class LibroFisico extends Libro{

    private String ubicacion; //sala + estanteria + balda
    private int numeroCopias;

    public LibroFisico() {}

    public LibroFisico(String titulo, String autor, String genero, double precio, String ubicacion) {
        super(titulo, autor, genero, precio);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int agregarCopias(int cantidad){
        return numeroCopias+cantidad;
    }

    public int eliminarCopias(int cantidad){
        return numeroCopias-cantidad;
    }


}
