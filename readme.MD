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

## Resources
[Jpa @OneToMany Best Practices](https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/)

