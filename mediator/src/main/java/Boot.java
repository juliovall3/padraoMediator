public class Boot {

    private static Boot instancia = new Boot();

    private Boot() {}

    public static Boot getInstancia() {
        return instancia;
    }

    public String receberPedidoAtendente(String mensagem) {
        return "Obrigado pela preferencia" + Atendente.getInstancia().receberPedido(mensagem);
    }

    public String receberCancelamentoAtendente(String mensagem) {
        return "Aguarde o cancelamento" + Atendente.getInstancia().receberCancelamento(mensagem);
    }
}
