package poo.EjercicioPractica.dominio;

public class Tesis extends Recurso implements Copiable {

    public Tesis(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public String toString() {
        return this.getNombre() + this.getCopias();
    }

    @Override
    public void fotocopiar() {
        copias = copias + 1;
    }


}
