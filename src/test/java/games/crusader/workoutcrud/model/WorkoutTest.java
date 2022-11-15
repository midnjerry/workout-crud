package games.crusader.workoutcrud.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {
    // RED
    // GREEN
    // REFACTOR

    @Test
    public void getName_returnsName(){
        Workout workout = new Workout();
        workout.setName("Chest Day");
        assertEquals("Chest Day", workout.getName());

        workout.setName("Leg Day");
        assertEquals("Leg Day", workout.getName());
    }

    @Test
    public void getRoutine_returnsListOfExerciseSets(){
        Workout workout = new Workout();
        ExerciseSet exerciseSet1 = new ExerciseSet();
        ExerciseSet exerciseSet2 = new ExerciseSet();
        List<ExerciseSet> routine = Arrays.asList(exerciseSet1, exerciseSet2);
        workout.setRoutine(routine);
        assertEquals(routine, workout.getRoutine());

        workout = new Workout();
        exerciseSet1 = new ExerciseSet();
        exerciseSet2 = new ExerciseSet();
        routine = Arrays.asList(exerciseSet1, exerciseSet2);
        workout.setRoutine(routine);
        assertEquals(routine, workout.getRoutine());
    }

}