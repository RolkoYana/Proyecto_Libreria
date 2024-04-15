import java.io.Serializable;

//comentario prueba

public class LibroFisico extends Libro implements Serializable {

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

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public int agregarCopias(int cantidad){

        this.numeroCopias += cantidad;
        return this.numeroCopias;
    }

    public int eliminarCopias(int cantidad){
        this.numeroCopias -= cantidad;
        return this.numeroCopias;
    }

    @Override
    public String toString() {
        return "LibroFisico{" +
                "ubicacion='" + ubicacion + '\'' +
                ", numeroCopias=" + numeroCopias +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                '}';
    }
}
