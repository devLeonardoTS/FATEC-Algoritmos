package gti_01.leonardots.alg.helpers;

import gti_01.leonardots.alg.exercises.Exe_041;
import gti_01.leonardots.alg.exercises.Exe_045;
import gti_01.leonardots.alg.exercises.IExercise;
import java.util.ArrayList;
import java.util.List;

public final class Exercises {

    private Exercises() {
    }
    
    public static IExercise getById(List<IExercise> exercises, String id) throws Exception {
        IExercise selected = null;

        for (IExercise exercise : exercises) {
            if (exercise.getId().equals(id)) {
                selected = exercise;
                break;
            }
        }

        if (selected == null) {
            throw new Exception("Exercício [" + id + "] não foi encontrado.");
        }

        return selected;
    };
    
    public static List<IExercise> getExercisesList(int id) {
        
        List<IExercise> exercises = new ArrayList<>();

        switch (id) {
            case 1:
                exercises.add(new Exe_041());
                exercises.add(new Exe_045());
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

            default:
                break;
        }
        
        return exercises;

    }

}
