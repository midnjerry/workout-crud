package games.crusader.workoutcrud.controller;

import games.crusader.workoutcrud.model.Workout;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutControllerTest {
    // TDD RED, GREEN, REFACTOR

// We want to make a CRUD

    @Test
    public void getAll_returnListOfWorkouts(){
        Workout workout1 = new Workout();
        Workout workout2 = new Workout();
        List<Workout> expected = Arrays.asList(workout1, workout2);
        WorkoutController workoutController = new WorkoutController();
        assertEquals(2, workoutController.getAll().size());
    }

}