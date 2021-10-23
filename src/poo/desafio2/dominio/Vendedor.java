package poo.desafio2.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;

    }

    public long calcularComision() {
        long comision = 0;
        if (this.getSalario() <= 999999) {
            comision = (long)(ventasDelMes*0.055);
        } else {
            comision = (long)(ventasDelMes*0.045);
        }
        return comision;
    }

    @Override
    public long calcularSalario() {
        long saldo = this.getSalario() + calcularComision() - (calcularSalud() + calcularPension());
        return saldo;
    }
}
