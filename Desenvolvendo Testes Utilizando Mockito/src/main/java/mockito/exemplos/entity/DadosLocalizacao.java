package mockito.exemplos.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosLocalizacao {

    private String uf;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;


}
