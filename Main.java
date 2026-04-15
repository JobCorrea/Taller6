public class Main{
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 521454);
        Gerente gt = new  Gerente("Chuco", 5621487, "Contabilidad");

        emp.mostrarInformacion();
        gt.mostrarInformacion();
    }
}