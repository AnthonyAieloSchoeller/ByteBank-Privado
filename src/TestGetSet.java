public class TestGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(155, 1200);
        //conta.numero = 1300
        conta.setNumero(1300);
        System.out.println(conta.getNumero());

        Cliente tony = new Cliente();
        tony.setNome("Tony pingo");
        conta.setTitular(tony);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        // Com duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

    }
}
