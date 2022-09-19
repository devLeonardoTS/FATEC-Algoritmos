package gti_01.leonardots.alg.exercises;

import java.util.Scanner;

public interface IExercise {
    
    abstract public String getId();
    abstract public String getName();
    abstract public void run(Scanner keyboard);
}
