// public class Banco {
//     protected double saldo;

//     public Banco(double saldo) {
//         this.saldo = saldo;
//     }

//     public void mostrarSaldo() {
//         System.out.println("Saldo actual: " + saldo);
//     }
// }
/*
    ¿Por qué no es seguro?
Al declarar saldo como protected, cualquier subclase o clase dentro del mismo paquete puede acceder 
y modificar directamente el valor.
Esto es riesgoso porque el saldo es un dato crítico, no debería poder alterarse sin validaciones 
(ejemplo: evitar valores negativos, controlar depósitos o retiros).
Permitir acceso directo compromete la integridad y seguridad de la información financiera.
*/

//Encapsulación adecuada
public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}
/*
Beneficios de esta solución
Protección total: el atributo saldo no puede ser accedido ni modificado directamente.

Validaciones: los métodos depositar y retirar aseguran que las operaciones sean correctas.

Encapsulación: se cumple el principio de ocultar los datos internos y exponer solo lo necesario. */