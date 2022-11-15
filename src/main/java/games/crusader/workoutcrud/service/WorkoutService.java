package games.crusader.workoutcrud.service;

import games.crusader.workoutcrud.model.Workout;
import games.crusader.workoutcrud.utilities.Util;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    public List<Workout> getAll() {
        return Util.getDummyRecords();
    }
}
