# Workout CRUD


Exercise
``` json
{
  name: String  
  image: String
}
```

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
