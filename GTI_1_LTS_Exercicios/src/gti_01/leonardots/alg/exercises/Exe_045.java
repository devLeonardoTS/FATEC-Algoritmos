package gti_01.leonardots.alg.exercises;

import gti_01.leonardots.alg.view.View;
import static gti_01.leonardots.alg.view.View.showDivider;
import java.util.Scanner;

public class Exe_045 implements IExercise {

    private final String id;
    private final String name;

    public Exe_045() {
        this.id = "45";
        this.name = "Raiz Quadrada - Math API";
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void run(Scanner keyboard) {

        double numero;
        double quadrado;
        double raizQuadrada;
        
        String headerMsg = "= Exercicio " + this.getId() + " - " + this.getName() + " =";
    
        showDivider(headerMsg.length());
        System.out.println(headerMsg);
        showDivider(headerMsg.length());
        System.out.println("> Dado um numero qualquer.");
        System.out.println("> Exibe o quadrado e a raiz quadrada do numero.");
        showDivider(headerMsg.length());
        
        System.out.println();

        // Entrada.
        numero = View.askDoubleInput(keyboard, "> Digite um numero: ");

        // Processamento. 
        quadrado = Math.pow(numero, 2);
        raizQuadrada = Math.sqrt(numero);

        // Saída.
        System.out.println();
        System.out.println("[Seu numero foi]: " + numero);
        System.out.println("[Quadrado do numero]: " + quadrado);
        System.out.println("[Raiz quadrada do numero]: " + raizQuadrada);
    }

}
