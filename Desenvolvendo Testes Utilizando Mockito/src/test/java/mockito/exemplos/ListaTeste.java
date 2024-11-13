package mockito.exemplos;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    void adicionarItemNaLista(){
        Mockito.when(letras.get(0)).thenReturn("B");

        Assertions.assertThat("B").isEqualTo(letras.get(0));
    }


}