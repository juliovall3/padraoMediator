public class Pessoa {

    public String fazerPedido(String mensagem){
        return Boot.getInstancia().receberPedidoAtendente(mensagem);
    }

    public String cancelarPedido(String mensagem){
        return Boot.getInstancia().receberCancelamentoAtendente(mensagem);
    }
}
