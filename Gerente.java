public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== GERENTE ===");
        System.out.println("Nombre: "+nombre+" Salario: "+salario+" Departamento: "+departamento );
    }
}
