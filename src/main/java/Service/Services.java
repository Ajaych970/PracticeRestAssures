package Service;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Services {

    String baseUri="https://restful-booker.herokuapp.com";
    String basePath="/booking";

    RequestSpecification requestSpecification = RestAssured.given();

    public void getAllProduct(){
        Response response = requestSpecification.baseUri(baseUri)
                                                .basePath(basePath)
                                                .contentType(ContentType.JSON).get();

        System.out.println(response.asString());

    }


    public void getProductById(){
        Response response = requestSpecification.baseUri(baseUri)
                                                .basePath("/booking/1")
                                                .contentType(ContentType.JSON).get();

        System.out.println(response.asString());
    }

    public void getProductByIdTwo(){
        Response response = requestSpecification.baseUri(baseUri)
                                                .basePath("/booking/2")
                                                .contentType(ContentType.JSON).get();

        System.out.println(response.asString());
    }


}
