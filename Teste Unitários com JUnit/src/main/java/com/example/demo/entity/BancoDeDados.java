package com.example.demo.entity;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BancoDeDados {


    public static void iniciarConexao(){
        log.info("Iniciou conexao");
    }


    public static void finalizarConexao(){
        log.info("Finalizou conexao");
    }

    public static void inserirDados(Pessoa pessoa){
        //Inserir dado pessoas DB
        log.info("Inseriu dados");
    }

    public static void excluirDados(Pessoa pessoa){
        //remover dado pessoas DB
        log.info("excluir dados");
    }



}
