package org.skypro.skyshop.service.basket;

import org.skypro.skyshop.product.Searchable;

import java.util.ArrayList;

public class SearchEngine {
    private Searchable[] arrayOfAllElements;
    ArrayList<Searchable> resultArray = new ArrayList<>();

    //Метод search— принимает в себя строку для поиска и возвращает 5
    // результатов поиска по массиву Searchable в виде массива из 5 элементов.
    public String search(String string) {
        if (string == null || string.isEmpty() || string.isBlank()) {
            return null; // пробросить ошибку
        } else {
            for (Searchable searchable : arrayOfAllElements) {
                if (searchable != null && searchable.searchTerm().contains(string)) {
                    resultArray.add(searchable);
                    if (resultArray.size() >= 5) {
                        break;
                    }
                }
            }
        }
        return null;
    }
    //Метод add()— добавляет новый объект типа Searchable в массив поискового движка.
}
