package poo.EjercicioPractica.dominio;

public class FolletoInformativo extends Recurso {
    public FolletoInformativo(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
