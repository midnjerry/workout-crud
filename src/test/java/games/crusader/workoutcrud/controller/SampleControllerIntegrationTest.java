package games.crusader.workoutcrud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import games.crusader.workoutcrud.model.Sample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class SampleControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @Test
    public void getSample_ReturnsSample() throws Exception {
        //arrange
        //act
        //assert
        MockHttpServletResponse result = mockMvc.perform(MockMvcRequestBuilders
        .get("/sample"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse();
        String json = result.getContentAsString();
        System.out.println(json);
        Sample output = mapper.readValue(json, Sample.class);
        assertEquals("Hello Trinity", output.getMessage());
    }

    @Test
    public void postSample_ReturnsSampleInput() throws Exception {
        String postBody = "{\"message\":\"Post Example\",\"name\":\"John Doe\",\"age\":3}";
        MockHttpServletResponse result = mockMvc.perform(MockMvcRequestBuilders
                .post("/sample")
                .content(postBody)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse();
        String json = result.getContentAsString();
        System.out.println(json);
        Sample output = mapper.readValue(json, Sample.class);
        assertEquals("Post Example", output.getMessage());
        System.out.println(output);

    }
}
