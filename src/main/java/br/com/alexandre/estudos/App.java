package br.com.alexandre.estudos;

public final class App {

    private App() {
    }

    public static String greeting(String name) {
        return "Olá, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting("Maven"));
    }
}