package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class HardCodedExamples {
   String baseURI =RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";
   String token="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODQ2ODA2NjIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NDcyMzg2MiwidXNlcklkIjoiNTM4OSJ9.0SbV_PZYkIbueMY9WieFMMG-YQXuYv9_a1OlGVmKegQ ";
@Test
   public void createEmployee(){
       //prepare the request
      RequestSpecification preparedRequest= given().header("Content-Type","application/json").
              header("Authorization",token).body("{\n" +
              "  \"emp_firstname\": \"Jennifer\",\n" +
              "  \"emp_lastname\": \"Kerolus\",\n" +
              "  \"emp_middle_name\": \"Peter\",\n" +
              "  \"emp_gender\": \"F\",\n" +
              "  \"emp_birthday\": \"1987-10-21\",\n" +
              "  \"emp_status\": \"Married\",\n" +
              "  \"emp_job_title\": \"Engineer\"\n" +
              "}");
       //hitting the endpoint/send the request
   Response response =  preparedRequest.when().post("/createEmployee.php");
       //verifying the assertions
      response.then().assertThat().statusCode(201);
      response.prettyPrint();
   response.then().assertThat().body("Employee.emp_firstname", equalTo("Jennifer"));
   System.out.println("My tset case is passed");
   response.then().assertThat().statusCode(201);
   //we are capturing employee id
   }
}
