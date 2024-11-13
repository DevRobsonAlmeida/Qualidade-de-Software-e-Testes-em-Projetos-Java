package mockito.exemplos;

import mockito.exemplos.entity.ApiDosCorreios;
import mockito.exemplos.entity.CadatrarPessoa;
import mockito.exemplos.entity.DadosLocalizacao;
import mockito.exemplos.entity.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadatrarPessoa cadastroPessoa;

    @Test
    void validarDadosCadastro() {
        DadosLocalizacao dados = DadosLocalizacao.builder().uf("CE").cidade("Fortaleza").logradouro("Rua").complemento("").bairro("JW").build();
        Mockito.when(apiDosCorreios.buscarDadosComBaseNoCep("3243244324")).thenReturn(dados);

        Pessoa pessoa = cadastroPessoa.cadatrar(Pessoa.builder().nome("Robson").nascimento(LocalDate.now()).documento("43243243243").build()
                , "3243244324");

        assertEquals("Robson", pessoa.getNome());
        assertEquals("43243243243", pessoa.getDocumento());
        assertEquals("CE", pessoa.getDadosLocalizacao().getUf());

    }

}
