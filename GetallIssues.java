package Week2Assignment;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetallIssues {

		@Test
		public void getAllissue(){
	RestAssured.baseURI="https://api-training.atlassian.net/rest/api/2/search?jql=project='JUL'";
		RequestSpecification input=RestAssured.given()
				.auth()
				.preemptive()
				.basic("hari.radhakrishnan@testleaf.com", "AI8Tpl0kK7smlLRFmvtY1E9B")
				.accept(ContentType.JSON);
		Response res=input.get();
	res.prettyPrint();	
	System.out.println(res.statusCode());
			
	}

}
