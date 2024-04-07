import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BookStoreAPITest {

    private static final String BASE_URL = "https://demoqa.com/BookStore/v1";

    @Test
    public void testGetBooks() {
        given()
                .when()
                .get(BASE_URL + "/Books")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .body("books", not(empty()));
    }
}
