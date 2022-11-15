package games.crusader.workoutcrud.controller;

import games.crusader.workoutcrud.model.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("workouts")
public class WorkoutController {


    @GetMapping()
    public List<Workout> getAll() {
        Workout workout1 = new Workout();
        Workout workout2 = new Workout();
        return Arrays.asList(workout1, workout2);
    }
}
