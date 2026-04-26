package tests;

//import jdk.jfr.internal.LongMap;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import methods.Methods;

import java.util.HashMap;
import java.util.Map;

import static groovy.xml.Entity.not;
import static io.restassured.RestAssured.given;

public class Tests {
    //______________________________________________________

//    @Test
//    @DisplayName("Получить все книги с фильтрацией")
//
//    void getAllBooksByFilter() {
//        Map<String, String> filters = new HashMap<>();
//        filters.put("minPrice", "400");
//        filters.put("maxPrice", "800");
//        Methods.getAllBooksByFilter("http://10.82.7.86:8085/books", filters);
//
//    }

    //_______________________________________________________
//    @Test
//    @DisplayName("Получить книгу по id")
//    void getBookById() {
//        Methods.getBookId("http://10.82.7.86:8085/books/{id}", "86");
//
//    }

    //________________________________________________________

//    @Test
//    @DisplayName("Получить книгу по isbn")
//    void getBookByIsbn() {
//        Methods.getBookIsbn("http://10.82.7.86:8085/books/isbn/{isbn}", "978-TEST-1777101606423");
//
//    }
//_____________________________________________________________
//    @Test
//    @DisplayName("Добавить новую книгу")
//    void addBook() {
//        String newBook = new JSONObject()
//                .put("isbn", "978-6792564891")
//                .put("title", "my_book")
//                .put("author", "Alexa")
//                .put("genre", "Horror")
//                .put("year", "2026")
//                .put("price", "4999")
//                .put("stock", "8")
//                .put("pages", "800").toString();
//        Methods.addBook("http://10.82.7.86:8085/books/", newBook);
//    }

    //_________________________________

//    @Test
//    @DisplayName("Полностью обновить книгу")
//    void UpdateAll() {
//        String updateBook = new JSONObject()
//                .put("isbn", "978-8792564891")
//                .put("title", "my_new_book")
//                .put("author", "Alexa")
//                .put("genre", "Horror")
//                .put("year", "2026")
//                .put("price", "4999")
//                .put("stock", "8")
//                .put("pages", "800").toString();
//        Methods.UpdateAll("http://10.82.7.86:8085/books/", updateBook, "86");
//    }

    //_____________________________________________

//    @Test
//    @DisplayName("Частично обновить книгу")
//
//    void UpdateNotAll() {
//        String updatedBook = new JSONObject()
//                .put("title", "New Book")
//                .put("author", "Me")
//                .put("genre", "Fiction")
//                .put("year", "2027")
//                .put("price", "800").toString();
//
//        Methods.UpdateNotAll("http://10.82.7.86:8085/books/{id}", updatedBook, "86");
//    }

    //______________________________________________

//    @Test
//    @DisplayName("Удалить книгу")
//
//    void deleteBook() {
//        Methods.deleteBook("http://10.82.7.86:8085/books/{id}", "86");
//    }


    //______________________________________________
//    @Test
//    @DisplayName("Проверить наличие книги на складе")
//
//    void checkBook() {
//        Methods.getBookId("http://10.82.7.86:8085/books/{id}/stock", "86");
//    }


    //__________________________________________
//    @Test
//    @DisplayName("Добавление комментария")
//
//    void addDescription() {
//
//        String newReview = new JSONObject()
//                .put("rating", "3")
//                .put("comment", "my first book")
//                .put("reviewerName", "Alexa").toString();
//
//        Methods.addDescription("http://10.82.7.86:8085/books/{id}/reviews", newReview, "9");
//    }

    //__________________________________________
//    @Test
//    @DisplayName("Получить отзывы на книгу")
//
//    void getDescription() {
//        Methods.getDescription("http://10.82.7.86:8085/books/{id}/reviews", "9");
//    }

}
