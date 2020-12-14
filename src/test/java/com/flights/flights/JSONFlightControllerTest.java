package com.flights.flights;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JSONFlightController.class)
public class JSONFlightControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void test1() throws Exception {
            this.mvc.perform(
                    get("/flights/flight")
            ).andExpect(status().isOk())
            .andExpect(jsonPath("$.tickets[0].passenger.firstName", is("Some name")))
            .andExpect(jsonPath("$.departs", is("2017-04-21 14:34")));
    }

}
