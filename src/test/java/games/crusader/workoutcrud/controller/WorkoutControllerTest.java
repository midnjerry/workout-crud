package games.crusader.workoutcrud.controller;

import games.crusader.workoutcrud.model.Workout;
import games.crusader.workoutcrud.service.WorkoutService;
import games.crusader.workoutcrud.utilities.Util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WorkoutControllerTest {
    // TDD RED, GREEN, REFACTOR

    WorkoutService workoutService;

    @BeforeEach
    public void setup(){
        workoutService = mock(WorkoutService.class);
        when(workoutService.getAll()).thenReturn(Util.getDummyRecords());
    }

// We want to make a CRUD

    @Test
    public void getAll_returnListOfWorkouts(){
        Workout workout1 = new Workout();
        Workout workout2 = new Workout();
        List<Workout> expected = Arrays.asList(workout1, workout2);
        WorkoutController workoutController = new WorkoutController(workoutService);
        assertEquals(2, workoutController.getAll().size());
    }

    @Test
    public void getAll_callsWorkoutService() {
        WorkoutController workoutController = new WorkoutController(workoutService);
        workoutController.getAll();
        Mockito.verify(workoutService).getAll();
    }

}