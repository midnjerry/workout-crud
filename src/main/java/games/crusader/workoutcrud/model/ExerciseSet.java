package games.crusader.workoutcrud.model;

import javax.persistence.*;

@Entity
public class ExerciseSet {
    @Id
    @GeneratedValue
    private Long id;
    private Integer reps;
    private Integer weight;
    private Integer duration;
    @ManyToOne(
            cascade=CascadeType.ALL
    )
    private Exercise exercise;

    @ManyToOne(fetch = FetchType.EAGER)
    private Workout workout;

    public ExerciseSet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    @Override
    public String toString() {
        return "ExerciseSet{" +
                "id=" + id +
                ", reps=" + reps +
                ", weight=" + weight +
                ", duration=" + duration +
                ", exercise=" + exercise +
                ", workout=" + workout +
                '}';
    }
}
