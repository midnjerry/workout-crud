package games.crusader.workoutcrud.controller;

import games.crusader.workoutcrud.model.Workout;
import games.crusader.workoutcrud.service.WorkoutService;
import games.crusader.workoutcrud.utilities.Util;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("workouts")
public class WorkoutController {
    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping()
    public List<Workout> getAll() {
        return workoutService.getAll();
    }


}
