
public interface IConta {
 
//Uma interface sempre será pública por isso não usamos a assinatura public    
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta ContaDestino);

    void imprimirExtrato();
}