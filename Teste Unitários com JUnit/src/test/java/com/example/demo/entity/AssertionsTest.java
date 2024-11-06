package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTest {

    @Test
    void validarLancamento(){
        int[] primeirolancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 2, 3, 4, 50};

        assertNotEquals(primeirolancamento, segundoLancamento);

    }

    @Test
    void validarObjetoIsNull() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        assertNotNull(pessoa);

    }


    @Test
    void validarObjetoDiferente() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);

    }

}
