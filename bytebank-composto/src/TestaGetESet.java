public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(100);
        System.out.println(conta.getSaldo());

        Cliente carlos = new Cliente();
        carlos.setNome("Carlos Pinheiro");
        conta.setTitular(carlos);

        System.out.println(conta.getTitular().getNome() );
        conta.getTitular().setProfissao("Programador");
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(conta.getTitular());
        System.out.println(titularDaConta);
        System.out.println(carlos);

        System.out.println(conta.getTitular());

    }
}
