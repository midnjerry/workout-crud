package games.crusader.workoutcrud.repository;

import games.crusader.workoutcrud.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
