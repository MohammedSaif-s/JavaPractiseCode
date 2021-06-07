package requestTest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class SampleTest 
{
	@Test
	public void test1()
	{		
		baseURI = "http://localhost:3000";
		given().
			//get("/Students?id=4").
		delete("/Students/4").
		then().	
			statusCode(200).log().all();
	}
	
	//@Test
	public void getTest()
	{
		Response response = get("http://localhost:3000/Students");
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.asString());
		System.out.println(response.getHeader("Content-Type"));		

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	//@Test
	public void postTest()
	{		
		JSONObject obj = new JSONObject();
		obj.put("firstName", "Mohammed");
		obj.put("laststName", "Khan");
		
		baseURI = "http://localhost:3000";
		given().
		header("Content-type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
		when().
			patch("/Students/4").
		then().statusCode(200).log().all();
		}
}