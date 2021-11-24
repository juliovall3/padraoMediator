public class Atendente implements Central{

    private static Atendente instancia = new Atendente();

    private Atendente() {}

    public static Atendente getInstancia() {
        return instancia;
    }

    public String receberPedido(String mensagem) {
        return "Já está em produção" + mensagem;
    }

    public String receberCancelamento(String mensagem) {
        return "Foi cancelado!" + mensagem;
    }
}
