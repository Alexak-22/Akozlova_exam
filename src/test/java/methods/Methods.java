package methods;

import io.restassured.http.ContentType;
import org.json.JSONObject;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class Methods {

    //_________________________________________________________

    public static void getAllBooksByFilter(String url, Map<String, String> filters) {

        String body = given()
                .params(filters)
                .when()
                .log().all()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        System.out.println(body);
    }


    //________________________________________________________

    public static void getBookId(String url, String id) {
        String body = given()
                .pathParam("id", id)
                .when()
                .log().all()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        System.out.println(body);
    }

    //______________________________________________________

    public static void getBookIsbn(String url, String isbn) {
        String body = given()
                .pathParam("isbn", isbn)
                .when()
                .log().all()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        System.out.println(body);
    }


    public static void addBook(String url, String newBook) {
        String body = given()
                .when()
                .header("X-API-Key", "bookstore-2026-secret")
                .contentType(ContentType.JSON)
                .body(newBook)
                .log().all()
                .get(url)
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .body()
                .asString();
        System.out.println(body);
    }

    public static void UpdateAll(String url, String updateBook, String id) {
        String body = given()
                .pathParam("id", id)
                .when()
                .header("X-API-Key", "bookstore-2026-secret")
                .contentType(ContentType.JSON)
                .body(updateBook)
                .log().all()
                .put(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        System.out.println(body);
    }

    public static void UpdateNotAll(String url, String updatedBook, String id) {
        String body = given()
                .pathParam("id", id)
                .when()
                .header("X-API-Key", "bookstore-2026-secret")
                .contentType(ContentType.JSON)
                .body(updatedBook)
                .log().all()
                .patch(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .asString();

        System.out.println(body);
    }

    public static void deleteBook(String url, String id) {
        String body = given()
                .pathParam("id", id)
                .when()
                .header("X-API-Key", "bookstore-2026-secret")
                .log().all()
                .delete(url)
                .then()
                .log().all()
                .statusCode(204)
                .extract()
                .asString();
    }

    public static void addDescription(String url, String newReview, String id) {
        String body = given()
                .pathParam("id", id)
                .when()
                .header("X-API-Key", "bookstore-2026-secret")
                .contentType(ContentType.JSON)
                .body(newReview)
                .log().all()
                .post(url)
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .body()
                .asString();
        System.out.println(body);

    }

    public static void getDescription(String url, String id) {
        String body = given()
                .pathParam("id", id)
                .when()
                .log().all()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        System.out.println(body);
    }

    public static JSONObject getBooksByISBN2(String url, String isbn) {
        String body = given()
                .pathParam("isbn", isbn)
                .when()
                .log().all()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        JSONObject book = new JSONObject(body);
        System.out.println(body);
        return book;
    }
}
