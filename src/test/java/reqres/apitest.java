package reqres;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.*;
import io.restassured.*;
import model.*;

public class apitest
{
    @Test
    public void ceateAirlines()
    {
     Response response = RestAssured.given()
             .baseUri("https://reqres.in/api/users")
             .contentType(ContentType.JSON)
             .body("{\n" +
                     "    \"name\": \"morpheus\",\n" +
                     "    \"job\": \"leader\"\n" +
                     "}")
             .post();
        Assert.assertEquals(response.statusCode(),201);
    }

    @Test
    public void test2()
    {
        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httprequest = RestAssured.given();

        Response response = httprequest.get();

        System.out.println("Status received => " + response.statusCode());
        System.out.println("Response=>" + response.prettyPrint());
        Headers header = response.headers();
        for (Header h : header) {
             System.out.println(h.getName() +":"+h.getValue());
        }

        usersmodel users = response.as(usersmodel.class);

    }
}
