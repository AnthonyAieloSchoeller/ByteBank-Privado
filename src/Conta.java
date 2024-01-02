import java.util.Set;

public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   private static int total =0;
    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    //Métodos
    public void deposita(double valor){
        // saldo += valor;
        //***ou***
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean transfere(double valor , Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }
   public double getSaldo() {
        return this.saldo;
   }
   public int getNumero(){
        return  this.numero;
   }
   public int getAgencia(){
        return this.agencia;
   }
   public Cliente getTitular(){
        return titular;
   }

    public static int getTotal() {
        return total;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("ERRO não pode ser usado números menores ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }
    public void setNumero(int numero){
        if (numero <= 0){
            System.out.println("ERRO não pode ser usado números menores ou igual a 0");
            return;
        }
        this.numero = numero;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
