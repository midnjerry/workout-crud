package games.crusader.workoutcrud.controller;

import games.crusader.workoutcrud.model.Sample;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping()
    public Sample getSample(){
        Sample sample = new Sample("Hello Trinity", "John Doe");
        return sample;
    }

    @PostMapping
    public Sample postSample(@RequestBody Sample sample){
        Sample output = new Sample(sample.getMessage(), sample.getName());
        output.setAge(sample.getAge());
        return output;
    }
}
