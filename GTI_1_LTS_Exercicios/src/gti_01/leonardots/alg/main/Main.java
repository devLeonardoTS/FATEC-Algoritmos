package gti_01.leonardots.alg.main;

import gti_01.leonardots.alg.view.View;
import static gti_01.leonardots.alg.helpers.Exercises.getExercisesList;
import java.util.Scanner;

/**
 *
 * @author Leonardo T. S.
 */
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        View.runView(keyboard, getExercisesList(1));

    }

}
