package requestTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class NewTest
{
	
  @Test
  public void getTest() 
  {
	  baseURI = "http://localhost:3000";
	  given().
	  	get("/Students").then().statusCode(200).log().all();
  }
  
  @Test
  public void postTest()
  {
	  JSONObject req = new JSONObject();
	  req.put("firstName", "SAIF");
	  req.put("lastName", "Khan");
	  req.put("age", "24");
	  req.put("gender", "Male");
	  req.put("state", "TN");
	  req.put("city", "AMbur");
	  System.out.println(req.toJSONString());
	  
	  baseURI = "http://localhost:3000";
	  given().
	  	header("Content-Type", "application/JSON").
	  	contentType(ContentType.JSON).
	  	accept(ContentType.JSON).
	  	body(req.toJSONString()).
	  when().
	  	post("/Students").
	  		then().
	  		statusCode(201).
	  		log().all();
  }
}