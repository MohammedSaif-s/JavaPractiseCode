package requestTest;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class LocalAPITest 
{
	//@Test
	public void getTest()
	{
		baseURI = "http://localhost:3000";
		given().
			get("/Students").
		then().
			statusCode(200);		
	}
	
	//@Test
	public void postTest()
	{
		JSONObject request = new JSONObject();
		request.put("lastName", "KUMAR");
		request.put("firstName", "SYAM");
		request.put("gender", "MALE");
		request.put("state", "ANDHRA PRADESH");
		request.put("subjectId", "4");
		
		baseURI = "http://localhost:3000";
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/Students").
		then().
			statusCode(201);
	}
	
	//@Test
	public void post_Test()
	{
		JSONObject request1 = new JSONObject();
		request1.put("name", "Performance Tester");
		
		baseURI = "http://localhost:3000";
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request1.toJSONString()).
		when().
			post("/Subjects").
			then().statusCode(201);
	}
	
	//@Test
	public void putTest()
	{
		JSONObject request2 = new JSONObject();
		request2.put("lastName", "GANGIPOGU");
		request2.put("firstName", "SYAM");
		request2.put("gender", "MALE");
		request2.put("state", "ANDHRA PRADESH");
		request2.put("subjectId", "4");
		
		baseURI = "http://localhost:3000";
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request2.toJSONString()).
		when().
			put("/Students/4").
		then().
			statusCode(200);
	}
	
	//@Test
	public void patchTest()
	{
		JSONObject request3 = new JSONObject();
		request3.put("lastName", "KUMAR");
		request3.put("firstName", "SYAM");
		
		baseURI = "http://localhost:3000";
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request3.toJSONString()).
		when().
			patch("/Students/4").
		then().
			statusCode(200);
	}
	
	@Test
	public void deleteTest()
	{
		baseURI = "http://localhost:3000";		
		when().
			delete("/Subjects/4").
		then().statusCode(200);
	}
}