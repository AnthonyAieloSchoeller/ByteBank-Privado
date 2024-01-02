public class TestarValores {
    public static void main(String[] args) {
        Conta conta = new Conta(155,1200);
        Conta conta1 = new Conta(69,69069);
        System.out.println("Total de contas: " + Conta.getTotal());
        //Conta inconssistente
        conta.setNumero(-55);
        conta.setAgencia(-100);
    }
}
