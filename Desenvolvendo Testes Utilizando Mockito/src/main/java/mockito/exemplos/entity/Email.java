package mockito.exemplos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {

    private String endereco;

    private String mensagem;

    private Formato formato;




}
