package gti_01.leonardots.alg.view;

import gti_01.leonardots.alg.helpers.Exercises;
import gti_01.leonardots.alg.exercises.IExercise;
import java.util.List;
import java.util.Scanner;

public final class View {

    private View() {
    }

    public static void runView(Scanner keyboard, List<IExercise> exercises) {
        showWelcome();
        System.out.println();
        View.askPressAny(keyboard);
        System.out.println();

        while (true) {
            showMenu(exercises);
            System.out.println();

            selectExercise(keyboard, exercises);
            System.out.println();

            String nextStep = askNextStep(keyboard);
            System.out.println();

            switch (nextStep) {
                case "sair":
                    return;
                default:
                    break;
            }
        }
    }

    private static void showWelcome() {
        String headerMsg = "= Lista de exercicios de Algoritmos =";

        showDivider(headerMsg.length());
        System.out.println(headerMsg);
        showDivider(headerMsg.length());

        System.out.println("> Coleção de exercícios da disciplina de algoritmos");
        System.out.println("> Aluno: Leonardo T.S.");
        System.out.println("> Professor: Deluqui.");
        showDivider(headerMsg.length());
    }

    private static void showMenu(List<IExercise> exercises) {
        String headerMsg = "= Menu de exercícios =";
        
        showDivider(headerMsg.length());
        System.out.println(headerMsg);
        showDivider(headerMsg.length());

        exercises.stream().forEach((ex) -> {
            System.out.println(
                    "> ["
                    + ex.getId()
                    + "] - "
                    + ex.getName()
            );
        });

        showDivider(headerMsg.length());
    }

    public static void selectExercise(Scanner keyboard, List<IExercise> exercises) {
        String input = askInput(keyboard, "> Digite o número do exercício que deseja visualizar: ");

        try {
            IExercise selected = Exercises.getById(exercises, input);
            selected.run(keyboard);
        } catch (Exception ex) {
            System.out.println("> [Oops!]: " + ex.getMessage());
        }
    }

    public static String askInput(Scanner teclado, String askMsg) {
        String input;

        System.out.print(askMsg);
        input = teclado.nextLine();

        input = input.trim();

        return input;
    }

    public static int askIntegerInput(Scanner teclado, String askMsg) {
        int input = 0;

        while (true) {
            try {
                System.out.print(askMsg);
                input = teclado.nextInt();
                break;
            } catch (Exception ex) {
                System.out.println("> Por favor, digite um valor numerico do tipo inteiro.");
            } finally {
                teclado.nextLine();
            }
        }

        return input;
    }

    public static double askDoubleInput(Scanner teclado, String askMsg) {
        double input = 0;

        while (true) {
            try {
                System.out.print(askMsg);
                input = teclado.nextDouble();
                break;
            } catch (Exception ex) {
                System.out.println("> Por favor, digite um valor numerico.");
            } finally {
                teclado.nextLine();
            }
        }

        return input;
    }

    public static void askPressAny(Scanner teclado) {
        askPressAny(teclado, "> Pressione qualquer tecla para continuar...");
    }

    public static void askPressAny(Scanner teclado, String confirmMsg) {
        System.out.print(confirmMsg);
        teclado.nextLine();
    }

    public static String askNextStep(Scanner keyboard) {
        String nextStep;
        System.out.print("> Ir para o [menu] ou [sair]? Digite a opção: ");

        while (true) {
            nextStep = keyboard.nextLine();

            switch (nextStep.trim().toLowerCase()) {
                case "menu":
                    return nextStep;
                case "sair":
                    return nextStep;
                default:
                    System.out.print("> Por favor, digite [menu] ou [sair]: ");
                    break;
            }
        }

    }

    public static void showDivider() {
        System.out.println("=======================");
    }

    public static void showDivider(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append("=");
        }
        String divider = builder.toString();
        
        System.out.println(divider);
    }

}
