package mockito.exemplos.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Pessoa {

    private String nome;

    private String documento;

    private LocalDate nascimento;

    private DadosLocalizacao dadosLocalizacao;

    public void adcionarDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
        this.dadosLocalizacao = dadosLocalizacao;
    }
}
