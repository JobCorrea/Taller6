public class Moto extends Vehiculo {
    protected int cilindrada;

    public Moto(String tipo, String marca, int cilindrada){
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostarInfo(){
        System.out.println("|||| MOTO ||||");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada);

    }
}
