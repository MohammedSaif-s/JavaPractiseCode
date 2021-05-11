package requestTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class Get_PostMethod 
{
	//@Test
	public void test_Get()
	{
		Response response = get("https://restcountries.eu/rest/v2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.asString());
	}
	
	//@Test
	public void testGet1()
	{
		baseURI = "https://restcountries.eu/rest/v2";
		given().
			get("/alpha/USA").
		then().
			statusCode(200).
			body("name", equalTo("United States of America"),
					"topLevelDomain", hasItem(".us"),
					"callingCodes", hasItem("1"),
					"altSpellings", hasItem("USA")).
			log().all();
	}
	
	@Test
	public void testPost()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		
//		map.put("name", "SAIF");
//		map.put("job", "tester");

		// require to add json.simple dependency in pom.xml
		
//		System.out.println(map);
		
		JSONObject request = new JSONObject();	// represents an immutable object value (an unordered collection of zero or more name/ pair values).	
		request.put("name", "SAIF");
		request.put("job", "Tester");
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).	//explicitly saying
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();
	}
}