package roteiro5.parte2;

//o que deve ser feito sem se preocupar como. (classe/modulo de alto nivel)
public class NotificacaoService {
    private Notificacao notificacao;

    public NotificacaoService(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarNotificacao(String mensagem) {
        notificacao.enviar(mensagem);
    }
}
