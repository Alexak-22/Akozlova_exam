package tests;

import methods.Methods;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Two {

    static String id = "";

    @Test
    @DisplayName("Проверить наличие книги")

    void CheckBook() {

        Methods.getBookId("http://10.82.7.86:8085/books/{id}/stock", id);
    }
    //______________________________________

    @Test
    @DisplayName("Добавление комментария")

    void addDescription() {

        String newReview = new JSONObject()
                .put("rating", "3")
                .put("comment", "my first book")
                .put("reviewerName", "Alexa").toString();

        Methods.addDescription("http://10.82.7.86:8085/books/{id}/reviews", newReview, "9");
    }

}
