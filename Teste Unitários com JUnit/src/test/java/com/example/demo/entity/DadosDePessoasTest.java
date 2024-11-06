package com.example.demo.entity;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class DadosDePessoasTest {

    static Pessoa pessoa = new Pessoa("Robson", LocalDateTime.now());

    // Inicia antes que todos os processos comecem
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    // Finaliza depois que todos os processos terminarem
    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

    // Carrega a cada @Test que executar
    @BeforeEach
    void inserirDadosParaTest(){
        BancoDeDados.inserirDados(pessoa);
    }

    // Carrega a cada @Test que finalizar
    @AfterEach
    void removerDadosParaTest(){
        BancoDeDados.excluirDados(pessoa);
    }


    // Teste unitario
    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    // Teste unitario
    @Test
    void verificarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }



}
