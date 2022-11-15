package games.crusader.workoutcrud.model;

import java.util.List;

public class Workout {

    private String name;
    private List<ExerciseSet> routine;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoutine(List<ExerciseSet> routine) {
        this.routine = routine;
    }

    public List<ExerciseSet> getRoutine() {
        return routine;
    }
}
