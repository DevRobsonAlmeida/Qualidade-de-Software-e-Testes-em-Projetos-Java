package mockito.exemplos;


import mockito.exemplos.entity.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(1000);

    @Test
    void validarOrdemDeChamadas(){
        conta.pagaBoleto(300);

        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debito(300);
        inOrder.verify(conta).enviarCreditoParaEmissor(300);


    }

    @Test
    void validarQuantidadeDeChamadas(){
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(700);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(anyInt());
    }

    @Test
    void retonarTrueParaQualquerValorNaValidacaoDeSaldo(){
        Mockito.doNothing().when(conta).validaSaldo(anyInt());
        conta.validaSaldo(3500);
    }


}
