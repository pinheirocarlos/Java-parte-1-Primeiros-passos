public class Conta {

    private double saldo;
    private int numero;
    private int agencia;
    private Cliente titular;
    private static int total;

    public static int getTotal() {
        return Conta.total;
    }
    public Conta(){

    }
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas eh:"+ Conta.total);
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Conta criada com sucesso");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {

        if(agencia <= 0){
            System.out.println("não pode valor menor que 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }



    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >=  valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;

    }
}