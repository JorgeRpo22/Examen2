package poo.EjercicioPractica.dominio;

public class ArticuloCientifico extends Recurso implements Copiable{

    public ArticuloCientifico(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void fotocopiar() {
        copias = copias + 1;

    }

    @Override
    public String toString() {
        return this.getNombre();
    }

}
