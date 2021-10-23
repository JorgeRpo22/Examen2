package poo.desafio2.dominio;

public class Directo extends Empleado{
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long calcularSalud() {
        return (long) (0.04*salario);
    }

    public long calcularPension() {
        return (long) (0.065*salario);
    }

    @Override
    public long calcularSalario() {
        long salario = this.salario - this.calcularPension() - this.calcularSalud();
        return salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
}
