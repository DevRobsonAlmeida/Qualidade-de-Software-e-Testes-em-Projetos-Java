package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "robso")
    void validarAlgoSomenteNoUsuarioRobson(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "root")
    void desabilitarAlgoSomenteNoUsuarioRobson(){
        Assertions.assertEquals(10, 5 + 5);
    }


    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void validarSomenteNoOS(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarSomenteNaVersaoJava(){
        Assertions.assertEquals(10, 5 + 5);
    }


}
