package ATB8xVrushabh.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITest_005_BDDStyle {

    @Description("Verify Post Request TC - BDD Style")
    @Test
    public void test_POST_Req_BDDStyle(){

        //https://restful-booker.herokuapp.com/auth
        //Content-Type: application/json

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.
                given()
                   .baseUri("https://restful-booker.herokuapp.com")
                   .basePath("/auth")
                   .contentType(ContentType.JSON)
                   .body(payload).log().all()
                .when()
                   .post()
                .then()
                   .log().all();


    }

}
