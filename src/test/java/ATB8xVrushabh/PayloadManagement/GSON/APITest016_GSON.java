package ATB8xVrushabh.PayloadManagement.GSON;

import ATB8xVrushabh.PayloadManagement.Booking;
import ATB8xVrushabh.PayloadManagement.BookingDates;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.*;
import org.testng.Assert;

public class APITest016_GSON {



    @Test
    public void test_Positive() {

        RequestSpecification requestSpecification;
        ValidatableResponse validatableResponse;
        // Step1 - POST
        // URL -> Base URI + base Path
        // HEADER
        // BODY
        // Auth - NO


        // Step 2
        // prepare the Payload ( Object -> JSON String)
        // send the request

        //Step 3
        // Validate Response ( JSON String -> Object)
        // FirstName,
        // Status Code
        // Time Response

        //Object
        Booking booking = new Booking();
        booking.setFirstname("Vrushabh");
        booking.setLastname("Chimankar");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast");


        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingDates(bookingdates);


        System.out.println(booking);

//        ObjectMapper objectMapper = new ObjectMapper();
//        String JsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
//        System.out.println(JsonString);

        //Class object to JSON String ===> Serialization

        Gson gson = new Gson();
        String jsonString = gson.toJson(booking);
       System.out.println(jsonString);

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonString).log().all();

        Response response = requestSpecification.when().post();
        Assert.assertEquals(response.statusCode(), 200);

        String jsonResponseString  = response.asString();


        // Case1 - extract(), jsonPath().getString() - Response is small


        // Case 2- Response -> Compex JSON  - Huge JSON

        // JSON String -Class Object  - DeSerialization

        BookingResponse bookingResponse = gson.fromJson(jsonResponseString, BookingResponse.class);
        assertThat(bookingResponse.getBookingid()).isNotZero().isNotNull();

       assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("Vrushabh").isNotNull().isNotEmpty();







    }

}
