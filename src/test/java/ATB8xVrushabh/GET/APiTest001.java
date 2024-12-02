package ATB8xVrushabh.GET;

import io.restassured.RestAssured;

public class APiTest001 {
    public static void main(String[] args) {

        //https://restful-booker.herokuapp.com/booking/1
       //Base uri :  https://restful-booker.herokuapp.com
      //BasePath :   /booking/1
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
