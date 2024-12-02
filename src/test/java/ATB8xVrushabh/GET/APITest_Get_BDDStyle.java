package ATB8xVrushabh.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITest_Get_BDDStyle {

    @Test
    public void test_Get_Request_POSITIVE(){

        String pincode = "500001";
        RestAssured
                .given()
                  .baseUri("https://api.zippopotam.us")
                  .basePath("/IN/" + pincode)
                .when()
                  .get()
                .then()
                  .log().all().statusCode(200);

    }
    @Test
    public void test_Get_Request_NEGATIVE(){

        String pincode = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
