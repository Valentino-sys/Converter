
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAPITest {

    @Test
    public void getStatusCodeTest() {
        given().when().get("https://api.nasa.gov/index.html").then().assertThat().statusCode(200);
    }

    @Test
    public void postStatusCodeTest() {
        Map<String, String> params = new HashMap<>();
        params.put("password", "Axa@Demo");
        params.put("username", "selenium_chrome");
        params.put("grant_type", "password");
        params.put("scope", "deltix.axa.user");
        given().header("Authorization", "Basic d2ViYXBwOg==").contentType(ContentType.URLENC).formParams(params)
                .post("https://app.tca.deltixuat.com/oauth/token").then().assertThat().statusCode(200);
    }

}
