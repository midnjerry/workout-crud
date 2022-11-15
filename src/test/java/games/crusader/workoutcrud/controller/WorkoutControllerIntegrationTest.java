package games.crusader.workoutcrud.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import games.crusader.workoutcrud.model.Workout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WorkoutControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @Test
    public void getAll_returnsListOfWorkouts() throws Exception {
        //arrange
        //act
        //assert
        MockHttpServletResponse result = mockMvc.perform(MockMvcRequestBuilders
                        .get("/workouts"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse();

        String exampleJson = openResourceFile("json/getAll_sampleOutput.json");

        String json = result.getContentAsString();

        List<Workout> output = mapper.readValue(json, new TypeReference<List<Workout>>() {
        });

        // String formattedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(output);


        List<Workout> expected = mapper.readValue(exampleJson, new TypeReference<List<Workout>>() {
        });

        assertEquals(expected.get(0).getName(), output.get(0).getName());
        assertEquals(expected.get(1).getName(), output.get(1).getName());
    }

    private String openResourceFile(String filename) {
        try {
            URL resource = WorkoutControllerIntegrationTest.class.getClassLoader().getResource(filename);
            byte[] bytes = Files.readAllBytes(Paths.get(resource.toURI()));
            return new String(bytes);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}