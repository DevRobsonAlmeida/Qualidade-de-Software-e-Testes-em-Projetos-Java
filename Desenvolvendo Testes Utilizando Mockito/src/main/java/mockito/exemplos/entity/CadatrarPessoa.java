package mockito.exemplos.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadatrarPessoa {

    private final ApiDosCorreios apiDosCorreios;

    public Pessoa cadatrar(Pessoa pessoa, String cep) {
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscarDadosComBaseNoCep(cep);
        pessoa.adcionarDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }
}
