package games.crusader.workoutcrud.service;

import games.crusader.workoutcrud.utilities.Util;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutServiceTest {
    @Test
    public void getAll_returnRecords(){
        WorkoutService workoutService = new WorkoutService();
        assertEquals(Util.getDummyRecords(), workoutService.getAll());
    }
}



