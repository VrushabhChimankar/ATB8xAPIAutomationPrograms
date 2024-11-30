package ATB8xVrushabh;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITest_Get_Request {

    @Test
    public void APITC_Get_Req(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then()
                .log().all();
    }




}

