package tests;

import methods.Methods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Three {
    @Test
    @DisplayName("Получить все книги с фильтрацией")

    void getAllBooksByFilter1() {
        Map<String, String> filters = new HashMap<>();
        filters.put("genre", "Classic");
        Methods.getAllBooksByFilter("http://10.82.7.86:8085/books", filters);

    }
    //__________________________

    @Test
    @DisplayName("Получить все книги с фильтрацией")

    void getAllBooksByFilter2() {
        Map<String, String> filters = new HashMap<>();
        filters.put("pages", "180");
        Methods.getAllBooksByFilter("http://10.82.7.86:8085/books", filters);

    }

    //______________________________

    @Test
    @DisplayName("Получить все книги с фильтрацией")

    void getAllBooksByFilter3() {
        Map<String, String> filters = new HashMap<>();
        filters.put("minPrice", "380");
        filters.put("maxPrice", "800");
        Methods.getAllBooksByFilter("http://10.82.7.86:8085/books", filters);

    }
}
