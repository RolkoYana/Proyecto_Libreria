import java.io.Serializable;

public class LibroAudio extends Libro implements Serializable {
    private int duracion;
    private String idioma;
    private int nuevaDuracion;

    public LibroAudio() {
    }

    public LibroAudio(int duracion, String idioma, int nuevaDuracion) {
        this.duracion = duracion;
        this.idioma = idioma;
        this.nuevaDuracion = nuevaDuracion;
    }

    public LibroAudio(String titulo, String autor, String genero, double precio, int duracion, String idioma, int nuevaDuracion) {
        super(titulo, autor, genero, precio);
        this.duracion = duracion;
        this.idioma = idioma;
        this.nuevaDuracion = nuevaDuracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNuevaDuracion() {
        return nuevaDuracion;
    }

    public void setNuevaDuracion(int nuevaDuracion) {
        this.nuevaDuracion = nuevaDuracion;
    }

    public void calcularTasaBitAlta() {
        nuevaDuracion = (int) (duracion * 0.8);
    }

    public void calcularTasaBitBaja() {
        nuevaDuracion = (int) (duracion * 1.2);
    }

    public void calcularTasaBits(String tasa) {
        if (tasa.equalsIgnoreCase("alta")) {
            calcularTasaBitAlta();
        } else if (tasa.equalsIgnoreCase("baja")) {
            calcularTasaBitBaja();
        } else {
            System.out.println("El valor introducido es incorrecto");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", idioma='" + idioma + '\'' +
                ", duracion normal=" + duracion +
                ", duracion real=" + nuevaDuracion +
                '}';
    }
}

