package poo.EjercicioPractica.dominio;

public class RecursoDigital extends Recurso implements Prestable{
    public RecursoDigital(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
