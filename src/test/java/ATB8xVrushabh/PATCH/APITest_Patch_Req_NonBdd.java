package ATB8xVrushabh.PATCH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest_Patch_Req_NonBdd {

    String token = "ee1bb56c6e0fd30";
    String booking_id = "2673";
    String payload_put = "{\n" +
            "    \"firstname\" : \"Vrushabh\",\n" +
            "    \"lastname\" : \"Chimankar\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    @Description("Verify Put request using restful booker")
    @Test
    public void APITest_Put_Req() {


        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + booking_id);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload_put).log().all();

        //
        Response res = r.when().patch();

        //Validatable response
        ValidatableResponse var = res.then().log().all();
        var.statusCode(200);
    }
}
