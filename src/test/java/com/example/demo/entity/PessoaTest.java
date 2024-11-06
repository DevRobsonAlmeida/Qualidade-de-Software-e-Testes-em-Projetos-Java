package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa rob = new Pessoa("Robson", LocalDate.of(1999, 7, 11));

        Assertions.assertTrue(rob.maiorIdade());

        Pessoa rei = new Pessoa("Reinaldo", LocalDate.of(2009, 10, 15));

        Assertions.assertFalse(rei.maiorIdade());


        List<Pessoa> pessoas = List.of(new Pessoa("Mariana", LocalDate.now()), new Pessoa("Eduardo", LocalDate.now()));

        Assertions.assertAll("pessoas",
                () -> Assertions.assertFalse(pessoas.get(0).maiorIdade()),
                () -> Assertions.assertFalse(pessoas.get(1).maiorIdade()));


    }

}
