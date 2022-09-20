package gti_01.leonardots.alg.exercises;

import gti_01.leonardots.alg.view.View;
import static gti_01.leonardots.alg.view.View.showDivider;
import java.util.Scanner;

public class Exe_068 implements IExercise {

    private final String id;
    private final String name;

    public Exe_068() {
        this.id = "68";
        this.name = "Substituição de valores";
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

        String a = "";
        String b = "";
        
        String headerMsg = "= Exercicio " + this.getId() + " - " + this.getName() + " =";
    
        showDivider(headerMsg.length());
        System.out.println(headerMsg);
        showDivider(headerMsg.length());
        System.out.println("> Dado um valor pra variável A e um pra B");
        System.out.println("> Os valores contidos nas variáveis trocam entre si (A recebe B, B recebe A)");
        showDivider(headerMsg.length());
        
        System.out.println();

        // Entrada.
        a = View.askInput(keyboard, "> Digite o valor de [A]: ");
        b = View.askInput(keyboard, "> Digite o valor de [B]: ");

        // Processamento. 
        Object temp = a;
        a = b;
        b = a.getClass().cast(temp);

        // Saída.
        System.out.println();
        System.out.println("[Novo valor de A]: " + a);
        System.out.println("[Novo valor de B]: " + b);
        
    }

}
