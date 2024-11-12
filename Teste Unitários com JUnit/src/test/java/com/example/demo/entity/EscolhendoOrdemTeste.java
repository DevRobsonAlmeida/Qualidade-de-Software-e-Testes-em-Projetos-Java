package com.example.demo.entity;

import org.junit.jupiter.api.*;

// Outros tipos de MethodOrderer
// MethodName   - Pelo nome do metodo em ordem alfabetina
// Random       - Ordena aleatóriamente
// DisplayName  - Pelo nome do DisplayName dado ao metodo em ordem alfabetina
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTeste {

    @Test
    @Order(4)
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }


    @Test
    @Order(3)
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }


    @Test
    @Order(2)
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }


    @Test
    @Order(1)
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }

}
