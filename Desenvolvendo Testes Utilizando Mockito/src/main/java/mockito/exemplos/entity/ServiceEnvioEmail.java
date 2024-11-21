package mockito.exemplos.entity;

public class ServiceEnvioEmail {

    private PlataformaDeEnvio plataforma;

    public void enviarEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = null;

        if (formatoHtml) {
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        } else {
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);
        }

        plataforma.enviarEmail(email);

    }
}
