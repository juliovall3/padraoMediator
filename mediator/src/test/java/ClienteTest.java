public class ClienteTest {

    @Test
    void deveFazerPedido() {
        Cliente cliente= new Cliente();
        assertEquals("Obrigado pela preferencia" + "Já está em produção",cliente.fazerPedido("Ótimo atendimento"));
    }

    @Test
    void deveCancelarPedido() {
        Cliente cliente = new Cliente();
        assertEquals("Aguarde o cancelamento" + "Foi cancelado!", cliente.cancelarPedido("Lentidão no atendimento"));
    }


}
