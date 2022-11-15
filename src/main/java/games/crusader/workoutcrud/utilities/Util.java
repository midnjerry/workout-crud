package games.crusader.workoutcrud.utilities;

import games.crusader.workoutcrud.model.Exercise;
import games.crusader.workoutcrud.model.ExerciseSet;
import games.crusader.workoutcrud.model.Workout;

import java.util.Arrays;
import java.util.List;

public class Util {

    static final List<Workout> dummyRecords;

    static {
        Exercise benchPress = new Exercise();
        benchPress.setName("Bench Press");
        benchPress.setImage("https://media0.giphy.com/media/QvXVzMT3oziRDud6df/giphy.gif");
        Exercise pushUp = new Exercise();
        pushUp.setName("Push up");
        pushUp.setImage("https://media.tenor.com/gI-8qCUEko8AAAAM/pushup.gif");
        Exercise squat = new Exercise();
        squat.setName("Squat");
        squat.setImage("https://img-aws.ehowcdn.com/750x428p/s3.amazonaws.com/photography.prod.demandstudios.com/6b3f5ce2-75fe-4ff2-b1b5-896fd85f5f0b.gif");

        ExerciseSet exerciseSet1 = new ExerciseSet();
        exerciseSet1.setExercise(benchPress);
        exerciseSet1.setReps(20);
        exerciseSet1.setWeight(220);
        exerciseSet1.setDuration(0);

        ExerciseSet exerciseSet2 = new ExerciseSet();
        exerciseSet2.setExercise(pushUp);
        exerciseSet2.setReps(20);
        exerciseSet2.setWeight(0);
        exerciseSet2.setDuration(120);

        ExerciseSet exerciseSet3 = new ExerciseSet();
        exerciseSet3.setExercise(squat);
        exerciseSet3.setReps(8);
        exerciseSet3.setWeight(350);
        exerciseSet3.setDuration(0);

        Workout workout1 = new Workout();
        workout1.setName("Chest Day");
        workout1.setRoutine(Arrays.asList(
                exerciseSet1,
                exerciseSet2
        ));

        Workout workout2 = new Workout();
        workout2.setName("Leg Day");
        workout2.setRoutine(Arrays.asList(
                exerciseSet3
        ));
        dummyRecords =  Arrays.asList(workout1, workout2);
    }
    public static List<Workout> getDummyRecords() {
       return dummyRecords;
    }
}
