public class TestaBanco {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        carlos.nome="Carlos Pinheiro";
        carlos.cpf="11111111";
        carlos.profissao="programador";

        Conta contaDoCarlos = new Conta();
        contaDoCarlos.deposita(100);

        //contaDoCarlos.titular = carlos;
        //System.out.println(contaDoCarlos.titular.nome);
    }

}
