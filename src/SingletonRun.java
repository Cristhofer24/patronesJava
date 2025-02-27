import singleton.model.BankAccount;

import java.util.Scanner;

public class SingletonRun {
    public static void main(String[] args) {
        String titular;
        double saldo;
        int op;
        double monto;
        String continuar;
        Scanner sc = new Scanner(System.in);

        System.out.println("*Welcome to the National Bank*");
        System.out.println("Ingrese su nombre");
        titular = sc.nextLine();
        System.out.println("Ingrese su saldo");
        saldo = sc.nextDouble();
        BankAccount cuenta = new BankAccount(titular, saldo);

        System.out.println("Cuenta registrada con exito" + cuenta.getTitular() + " con un saldo de $" + cuenta.getSaldo() + "Dolares");
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el monto a depositar");
                    monto = sc.nextDouble();
                    cuenta.depositar(monto);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    monto = sc.nextDouble();
                    cuenta.retirar(monto);
                    break;
                case 3:
                    System.out.println("Su saldo es de $" + cuenta.getSaldo() + " Dolares");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Desea continuar? S/N");
            continuar = sc.next();

        }while (continuar.equalsIgnoreCase("S"));

        System.out.println("Gracias por usar nuestros servicios");
        sc.close();

    }
}