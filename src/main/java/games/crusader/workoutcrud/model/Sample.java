package games.crusader.workoutcrud.model;

import lombok.*;

import java.util.Objects;

// @Getter  // Lombok
// @Setter  // Lombok
// @ToString  // Lombok
// @EqualsAndHashCode // Lombok
// @RequiredArgsConstructor

@Data // Getter, Setter, ToStrip, EqualsAndHashCode, RequiredArgsConstructor
@AllArgsConstructor // Lombok
@NoArgsConstructor
@Builder
// @NoArgsConstructor // Lombok
public class Sample {
    private String message;
    private String name;

    private Integer age;

    public Sample(String message, String name){
        this.message = message;
        this.name = name;
    }
}
