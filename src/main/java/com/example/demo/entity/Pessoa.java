package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    public boolean maiorIdade(){
        return 18 <= getIdade();
    }

}
