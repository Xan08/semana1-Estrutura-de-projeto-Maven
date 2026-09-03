package br.com.alexandre.estudos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void deveCriarSaudacao() {
        assertEquals("Olá, Maven!", App.greeting("Maven"));
    }
}