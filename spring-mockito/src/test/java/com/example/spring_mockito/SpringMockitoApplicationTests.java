package com.example.spring_mockito;

import com.example.spring_mockito.model.Employee;
import com.example.spring_mockito.model.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringMockitoApplicationTests {


     private MockMvc mockMvc;

     @Autowired
     private WebApplicationContext context;

     ObjectMapper om =new ObjectMapper();

     @Before
    public void setUp(){
         mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
     }

     public void addEmployeeTest() throws Exception {
         Employee employee = new Employee();
         employee.setName("Rutuj");
         employee.setDept("IT");
         String jsonRequest= om.writeValueAsString(employee);
         MvcResult result = mockMvc.perform(post("/EmployeeService/addEmployee").content(jsonRequest).content(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
         String resultContent=result.getResponse().getContentAsString();
         Response response=om.readValue(resultContent, Response.class);
         Assert.assertTrue(response.isStatus() == Boolean.TRUE);
     }

    public void getEmployeesTest() throws Exception {


        MvcResult result = mockMvc.perform(get("/EmployeeService/getEmployees").content(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
        String resultContent=result.getResponse().getContentAsString();
        Response response=om.readValue(resultContent, Response.class);
        Assert.assertTrue(response.isStatus() == Boolean.TRUE);
    }


}
