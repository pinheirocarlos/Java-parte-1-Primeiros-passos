public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaCarlos = new Conta();
        contaCarlos.saldo = 100;
        contaCarlos.deposita(50);
        System.out.println(contaCarlos.saldo);
        boolean conseguiuRetirar = contaCarlos.saca(20);
        System.out.println(contaCarlos.saldo);

        Conta contaMaria = new Conta();
        contaMaria.deposita(1000);
        if(contaMaria.transfere(300,contaCarlos)){
            System.out.println("Transferência realizada com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaMaria.saldo);
        System.out.println(contaCarlos.saldo);

        contaCarlos.titular = "Carlos Pinheiro";
        System.out.println(contaCarlos.titular);
    }
}
