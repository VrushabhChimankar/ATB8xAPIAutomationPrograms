package ATB8xVrushabh;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest_GetRequest_NonBDD {

    static  RequestSpecification rs = RestAssured.given();

    @Description("TC1 - NonBDD Positive Get Request")
    @Test
    public void test_Get_Req_NonBDD_Positive(){

        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/500001");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);

    }

    @Description("TC2 - NonBDD Negative Get Request")
    @Test
    public void test_Get_Req_NonBDD_Negative(){

        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/-1");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(404);

    }
}
