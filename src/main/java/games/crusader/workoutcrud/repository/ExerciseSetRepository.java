package games.crusader.workoutcrud.repository;

import games.crusader.workoutcrud.model.ExerciseSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseSetRepository extends JpaRepository<ExerciseSet, Integer> {
}
