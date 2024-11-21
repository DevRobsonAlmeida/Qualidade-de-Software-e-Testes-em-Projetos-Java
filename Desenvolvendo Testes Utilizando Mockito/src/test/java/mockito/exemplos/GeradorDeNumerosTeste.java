package mockito.exemplos;

import lombok.AllArgsConstructor;
import mockito.exemplos.entity.GeradorDeNumeros;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GeradorDeNumerosTeste {

    private static MockedStatic<GeradorDeNumeros> gerador;

    @BeforeEach
    void beforeEach(){
        gerador = Mockito.mockStatic(GeradorDeNumeros.class);
    }

    @AfterEach
    void afterEach(){
        gerador.close();
    }

    @Test
    @Order(1)
    void validarGeracaoListaDeNumeros() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);


        gerador.when(() -> GeradorDeNumeros.geraNumerosAleatorios(anyInt())).thenReturn(integers);

        Assertions.assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios(8));
    }

    @Test
    @Order(2)
    void validarGeracaoListaDeNumerosSemInformarTamanho() {
        List<Integer> integers = List.of(10, 9, 8, 6);

        gerador.when(GeradorDeNumeros::geraNumerosAleatorios).thenReturn(integers);

        Assertions.assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios());
    }

}
