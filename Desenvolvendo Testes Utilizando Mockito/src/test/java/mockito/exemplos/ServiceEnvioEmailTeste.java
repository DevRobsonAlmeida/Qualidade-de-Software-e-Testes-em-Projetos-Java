package mockito.exemplos;

import mockito.exemplos.entity.Email;
import mockito.exemplos.entity.Formato;
import mockito.exemplos.entity.PlataformaDeEnvio;
import mockito.exemplos.entity.ServiceEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiceEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServiceEnvioEmail service;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviaEnviadosParaPlataforma() {
        String enderecoEmail = "test@email.com";
        String mensagem = "Olá mundo teste mensagem";
        boolean formatoHtml = false;

        service.enviarEmail(enderecoEmail, mensagem, formatoHtml);

        Mockito.verify(plataforma).enviarEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEndereco());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());

    }


}
