package ATB8xVrushabh.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest_006_NonBDDStyle {

    @Description("Verify Post Request TC - Non BDD Style")
    @Test

    public void test_POST_Req_NonBDDStyle(){

        //https://restful-booker.herokuapp.com/auth
        //Content-Type: application/json

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/auth");
        rs.contentType(ContentType.JSON);
        rs.body(payload).log().all();
        rs.when().post();
        rs.then().log().all();
    }

}
