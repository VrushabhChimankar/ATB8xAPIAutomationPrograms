package ATB8xVrushabh.PayloadManagement;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest016_POJO {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;


    @Test
    public void test_POST_req(){


        //POJO Class --> JSON


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


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(booking).log().all();

        Response response = requestSpecification.when().post();

        Integer bookingId = response.then().extract().path("bookingid");

        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        System.out.println("Your Booking Id is -> " +  bookingId);










    }




}
