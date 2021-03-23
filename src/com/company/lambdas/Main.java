package com.company.lambdas;

public class Main {
    public static void main(String[] args) {
        GreetingsMessage gm = new GreetingsMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);

            }
        };
        gm.greet("Gill");
    }
}
