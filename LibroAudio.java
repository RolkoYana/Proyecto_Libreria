import java.io.Serializable;
import java.util.Scanner;

public class LibroAudio extends Libro implements Serializable {
    private int duracion;
    private String idioma;

    public LibroAudio() {
    }

    public LibroAudio(int duracion, String idioma) {
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public LibroAudio(String titulo, String autor, String genero, double precio, int duracion, String idioma) {
        super(titulo, autor, genero, precio);
        this.duracion = duracion;
        this.idioma = idioma;
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

    public double calcularTasaBitsAlta() {
        return duracion * 0.8;
    }

    public double calcularTasaBitsBaja() {
        return duracion * 1.2;
    }

    public double calcularTasaBits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la tasa de bits con la que dispone actualmente: \n" +
                "1_Alta\n" +
                "2_Baja");
        String tasa = scanner.next();
        if (tasa.equalsIgnoreCase("alta")) {
            return calcularTasaBitsAlta();
        } else if (tasa.equalsIgnoreCase("baja")) {
            return calcularTasaBitsBaja();
        } else {
            System.out.println("El valor introducido es incorrecto");
            return -1; // Or some default value to indicate failure
        }
    }

    @Override
    public String toString() {
        double tasaBits = calcularTasaBits();
        return super.toString() +
                ", idioma='" + idioma + '\'' +
                ", duracion normal=" + duracion +
                ", duracion real=" + tasaBits;
    }
}
