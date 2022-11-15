package games.crusader.workoutcrud;

import games.crusader.workoutcrud.model.Exercise;
import games.crusader.workoutcrud.model.ExerciseSet;
import games.crusader.workoutcrud.model.Workout;
import games.crusader.workoutcrud.repository.ExerciseRepository;
import games.crusader.workoutcrud.repository.ExerciseSetRepository;
import games.crusader.workoutcrud.repository.WorkoutRepository;
import games.crusader.workoutcrud.utilities.Util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WorkoutCrudApplicationTests {

	@Autowired
	WorkoutRepository workoutRepository;

	@Autowired
	ExerciseSetRepository setRepository;

	@Autowired
	ExerciseRepository exerciseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void save_CanSaveDummyData() {
		List<Workout> records = Util.getDummyRecords();

		Workout workout1 = records.get(0);

		ExerciseSet set1 = workout1.getRoutine().get(0);
		ExerciseSet set2 = workout1.getRoutine().get(1);

//		System.out.println(set1);
//		System.out.println(setRepository.save(set1));
//
//		System.out.println(set2);
//		System.out.println(setRepository.save(set2));

		System.out.println(workout1);
		System.out.println(workoutRepository.save(workout1));
	}

	@Test
	public void repository_worksAsExpected() {

	}


}
