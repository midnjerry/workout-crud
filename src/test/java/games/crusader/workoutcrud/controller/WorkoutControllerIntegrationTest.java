package games.crusader.workoutcrud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
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

        String expected = openResourceFile("json/getAll_sampleOutput.json");
        String json = result.getContentAsString();
        assertEquals(expected, json);
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