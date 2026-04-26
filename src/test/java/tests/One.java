package tests;

import methods.Methods;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class One {
    static String id = "";

    @Test
    @DisplayName("Добавить новую книгу")
    void addBook() {
        String newBook = new JSONObject()
                .put("isbn", "978-6792564891")
                .put("title", "my_book")
                .put("author", "Alexa")
                .put("genre", "Horror")
                .put("year", "2026")
                .put("price", "4999")
                .put("stock", "8")
                .put("pages", "800").toString();
        Methods.addBook("http://10.82.7.86:8085/books/", newBook);
        JSONObject() Object book = Methods.getBooksByISBN2("http://10.82.7.86:8085/books/isbn/{isbn}", "978-6792564891");
        id = book.get("id").toString();
    }

    //__________________________
    @Test
    @DisplayName("Получить книгу по id")
    void getBookById() {
        Methods.getBookId("http://10.82.7.86:8085/books/{id}", "86");

    }

    //_____________________________
    @Test
    @DisplayName("Частично обновить книгу")

    void UpdateNotAll() {
        String updatedBook = new JSONObject()
                .put("price", "500").toString();

        Methods.UpdateNotAll("http://10.82.7.86:8085/books/{id}", updatedBook, id);
    }

    //_____________________________
    @Test
    @DisplayName("Проверить наличие книги")

    void CheckBook() {

        Methods.getBookId("http://10.82.7.86:8085/books/{id}/stock", id);
    }

    //___________________________________
        @Test
    @DisplayName("Удалить книгу")

    void deleteBook() {
        Methods.deleteBook("http://10.82.7.86:8085/books/{id}", "86");
    }
}
