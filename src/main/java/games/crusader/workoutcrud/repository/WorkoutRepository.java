package games.crusader.workoutcrud.repository;

import games.crusader.workoutcrud.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {
}
