package ATB8xVrushabh.PayloadManagement;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITest015_PayloadMap {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    //{
    //            "firstname" : "Jim",
    //                "lastname" : "Brown",
    //                "totalprice" : 111,
    //                "depositpaid" : true,
    //                "bookingdates" : {
    //            "checkin" : "2018-01-01",
    //                    "checkout" : "2019-01-01"
    //        },
    //            "additionalneeds" : "Breakfast"
    //        }

    @Test
    public void test_Post_req(){


        //JSON -> Hashmap

        Map<String, Object> jsonMapString = new LinkedHashMap<>();
        jsonMapString.put("firstname", "Jim");
        jsonMapString.put("lastname", "Brown");
        jsonMapString.put("totalprice", "111");
        jsonMapString.put("depositpaid", "true");


        Map<String, Object> booking_Dates = new LinkedHashMap<>();
        booking_Dates.put("checkin", "2018-01-01");
        booking_Dates.put("checkout", "2019-01-01");

        jsonMapString.put("bookingdates", booking_Dates);
        jsonMapString.put("additionalneeds", "Breakfast");


        System.out.println(jsonMapString);

        //https://restful-booker.herokuapp.com/booking

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonMapString).log().all();

        Response response = requestSpecification.when().post();

       validatableResponse = response.then().log().all();

       Integer booking_id = response.then().extract().path("bookingid");
       validatableResponse.statusCode(200);
        System.out.println("Your booking id is: " + booking_id);

    }



}
