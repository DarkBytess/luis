public class MainBanco {
    public static void main(String[] args) {
        ContaBancaria ContaBancaria = new ContaBancaria();

//        contaBancaria.depositar(100);
//        contaBancaria.depositar(100);
//
//        contaBancaria.sacar(50);

        ContaCredito contaCredito = new ContaCredito();
        contaCredito.depositar(100);
        contaCredito.sacar(200);
    }
}
