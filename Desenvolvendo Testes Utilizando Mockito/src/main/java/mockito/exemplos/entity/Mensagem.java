package mockito.exemplos.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Mensagem {

    private String id;

    private String mensagem;

    public Mensagem(String mensagem) {
        this.id = UUID.randomUUID().toString();
        this.mensagem = mensagem;
    }

}
