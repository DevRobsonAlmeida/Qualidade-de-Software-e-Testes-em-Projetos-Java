package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

    @Test
    void validarCenarioDeExcecaoNaTranferencia() {
        Conta origem = new Conta("123456", 0);
        Conta destino = new Conta("123456", 0);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferencia.transfere(origem, destino, -1);
        });
    }

    @Test
    void validarCenarioQueNaoDaExcecaoNaTranferencia() {
        Conta origem = new Conta("123456", 0);
        Conta destino = new Conta("123456", 0);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferencia.transfere(origem, destino, 20));
    }

}
