
public class Main {
    public static void main(String[] args) {

        Cliente titular = new Cliente();
        titular.setNome("Rico");

        Conta cc = new ContaCorrente(titular);
        Conta cp = new ContaPoupanca(titular);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }    
}
