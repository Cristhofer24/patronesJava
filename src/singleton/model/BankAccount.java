package singleton.model;

import singleton.registro.TransacctionLogger;

public class BankAccount {
    private String titular;
    private double saldo;

    public BankAccount(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
//Depositar
    public void depositar(double monto) {
      this.saldo += monto;
      String message = "Se ha depositado $" + monto + " en la cuenta de " + this.titular + ". Nuevo saldo: $" + this.saldo;
      TransacctionLogger.getInstance().log(message);
    }

    //Retirar
    public void retirar(double monto){
        String message;
        if (monto <= this.saldo){
            this.saldo -= monto;
            message = "Se ha retirado $" + monto + " de la cuenta de " + this.titular + ". Nuevo saldo: $" + this.saldo;
            TransacctionLogger.getInstance().log(message);
        }else {
            message = "No se puede retirar $" + monto + " de la cuenta de " + this.titular + ". Saldo insuficiente.";
            TransacctionLogger.getInstance().log(message);
        }

    }


    //getters and setter


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
