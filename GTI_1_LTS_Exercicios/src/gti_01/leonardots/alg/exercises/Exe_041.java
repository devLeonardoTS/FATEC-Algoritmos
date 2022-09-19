package gti_01.leonardots.alg.exercises;

import gti_01.leonardots.alg.view.View;
import static gti_01.leonardots.alg.view.View.showDivider;
import java.util.Scanner;
import java.util.StringJoiner;

public class Exe_041 implements IExercise {

    private final String id;
    private final String name;

    public Exe_041() {
        this.id = "41";
        this.name = "Media Ponderada";
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
        
        StringJoiner sj = new StringJoiner("; ");
        double[] numeros = new double[4];
        double mediaPonderada = 0;
        double dividendo = 0;
        double divisor = 0;
        
        String headerMsg = "= Exercicio " + this.getId() + " - " + this.getName() + " =";
    
        showDivider(headerMsg.length());
        System.out.println(headerMsg);
        showDivider(headerMsg.length());
        System.out.println("> Dado 4 numeros e os pesos 1, 2, 3 e 4.");
        System.out.println("> Exibe a media ponderada.");
        showDivider(headerMsg.length());
        
        System.out.println();
        
        // Entrada.
        System.out.println("> Digite 4 numeros.");
        numeros[0] = View.askDoubleInput(keyboard, "> 1º Numero: ");
        numeros[1] = View.askDoubleInput(keyboard, "> 2º Numero: ");
        numeros[2] = View.askDoubleInput(keyboard, "> 3º Numero: ");
        numeros[3] = View.askDoubleInput(keyboard, "> 4º Numero: ");
        
        // Processamento. 
        for (int i = 0; i < numeros.length; i++) {
            sj.add(Double.toString(numeros[i]));

            dividendo += numeros[i] * (i + 1);
            divisor += i + 1;
        }
        
        mediaPonderada = dividendo / divisor;

        // Saída.
        System.out.println();
        System.out.println("[Valores]: " + sj.toString());
        System.out.println("[Media Ponderada]: " + mediaPonderada);
    }

}
