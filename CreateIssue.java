package Week2Assignment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssue {
	public void createIssue() {
		RestAssured.baseURI="https://api-training.atlassian.net/rest/api/2/issue/";

		RequestSpecification input=RestAssured.given().log().all().auth()
		.preemptive()
		.basic("hari.radhakrishnan@testleaf.com", "AI8Tpl0kK7smlLRFmvtY1E9B")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "    \"project\":\r\n"
				+ "                {\r\n"
				+ "                    \"key\": \"JUL\"\r\n"
				+ "                },\r\n"
				+ "    \"summary\": \"create issue in RA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "                    \"name\": \"Bug\"\r\n"
				+ "                }\r\n"
				+ "    }\r\n"
				+ "}");
		Response res=input.post();
		res.then().log().all();
		System.out.println(res.prettyPrint());
		int statusCode=res.getStatusCode();
		System.out.println("Status Code:" +statusCode);


			}

}
