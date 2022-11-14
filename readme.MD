# Workout CRUD

Exercise
```
{
  name: String  
  image: String
}
```

ExerciseSet
```
{
  reps: Integer
  weight: Integer
  duration: Integer
  exercise: Exercise
}
```

Workout

```
{
  name: String,
  routine: List<ExerciseSet>
}
```
