package mockito.exemplos.entity;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class Conta {

    private int saldo;

    public void pagaBoleto(int valorAPagar){
        validaSaldo(valorAPagar);
        debito(valorAPagar);
        enviarCreditoParaEmissor(valorAPagar);
    }

    public void validaSaldo(int valorAPagar){
        if (saldo < valorAPagar){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public void debito(int valorAPagar){
        saldo -= valorAPagar;
    }

    public void enviarCreditoParaEmissor(int valorAPagar){
        System.out.println("Enviando credito para emissor");
        System.out.println("Saldo: " + saldo);
        System.out.println("Valor emissor: " + valorAPagar);
        System.out.println("Data da emissão: " + new Date());
    }


}
