public class Main{
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 521454);
        Gerente gt = new  Gerente("Chuco", 5621487, "Contabilidad");

        emp.mostrarInformacion();
        gt.mostrarInformacion();

        Vehiculo vh = new Vehiculo("Cuatri Moto", "Susuki");
        Moto mt = new Moto("Sport", "Yahama", 650);
       
        // Intento de acceder directamente a atributos protected
        /*System.out.println(v.tipo);   //  Error de compilación
        System.out.println(v.marca);  //  Error de compilación
        System.out.println(m.cilindrada); //  Error de compilación*/

        // Forma correcta: usar los métodos públicos
        vh.mostarInfo();
        mt.mostarInfo();
    }
}
/*
error: tipo has protected access in Vehiculo
System.out.println(v.tipo);
                       ^
error: marca has protected access in Vehiculo
System.out.println(v.marca);
                       ^
error: cilindrada has protected access in Moto
System.out.println(m.cilindrada);
                       ^
 */