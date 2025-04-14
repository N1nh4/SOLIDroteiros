package roteiro5.parte1;

// modulo/classe de baixo nivel, se preocupa com como fazer ou seja com os detalhes espeficos 
public class NotificacaoService {

    public void enviarNotificacaoEmail(String mensagem) {
        System.out.println("Enviando notificação: " + mensagem);
    }

    public void enviarNotificacaoSMS(String mensagem) {
        System.out.println("Enviando notificação por SMS: " + mensagem);
    }

    public void enviarNotificacaoPush(String mensagem) {
        System.out.println("Enviando notificação push: " + mensagem);
    }
}
