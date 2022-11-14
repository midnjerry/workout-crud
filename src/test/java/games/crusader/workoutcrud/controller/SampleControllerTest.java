package games.crusader.workoutcrud.controller;

import games.crusader.workoutcrud.model.Sample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class SampleControllerTest {

    @Autowired
    private SampleController sampleController;

    @BeforeEach
    public void setup(){
        sampleController = new SampleController();
    }

    @Test
    public void getSample_returnsSampleWithHelloWorldData(){
        Sample expected = new Sample("Hello Trinity", "John Doe");
        Sample actual = sampleController.getSample();
        assertEquals(expected.getMessage(), actual.getMessage());
        assertEquals(expected.getName(), actual.getName());
    }

    @Test
    public void postSample_returnsSameSampleProvided(){
//        Sample input = new Sample("Hello Trinity", "John Doe", 30);
        Sample input = Sample.builder()
                .message("Hello Trinity")
                .name("John Doe")
                .age(30).build();
        Sample output = sampleController.postSample(input);
        assertEquals(input, output);
    }

}