package poo.desafio2.app;

import poo.desafio2.dominio.*;

public class AppNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        Empleado juan = new Directo("Juan", 6812000);
        Empleado julian = new Vendedor("Julián", 2410000, 62106200);
        Empleado johanna = new Freelance("Johanna", 120000, 79);
        Empleado carolina = new Vendedor("Carolina",998000,71589600);
        Empleado pedro = new Promotor("Pedro", 974,190, 68);
        Empleado david = new Directo("David", 3578000);
        Empleado gustavo = new Freelance("Gustavo", 70500,64);

        nomina.getEmpleados().add(juan);
        nomina.getEmpleados().add(julian);
        nomina.getEmpleados().add(johanna);
        nomina.getEmpleados().add(carolina);
        nomina.getEmpleados().add(pedro);
        nomina.getEmpleados().add(david);
        nomina.getEmpleados().add(gustavo);

        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarFreelancers();
        nomina.listarPromotores();

    }
}
