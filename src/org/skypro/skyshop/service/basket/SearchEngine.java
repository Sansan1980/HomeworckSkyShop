package org.skypro.skyshop.service.basket;

import org.skypro.skyshop.product.Searchable;

public class SearchEngine {

    private static Searchable[] arrayOfAllElements;
    public SearchEngine(Searchable [] arrayOfAllElements) {
        this.arrayOfAllElements = arrayOfAllElements;
    }

    public static Searchable[] getArrayOfAllElements() {
        return arrayOfAllElements;
    }
//Метод search— принимает в себя строку для поиска и возвращает 5
    // результатов поиска по массиву Searchable в виде массива из 5 элементов.

    /**
     * Метод {@link #search(String)}  }— принимает в себя строку {@code (String string)} <br>для поиска.
     * <p>
     * Инициализирует массив {@code Searchable[] resultArray = new Searchable[5]}
     * с максимум 5 элементов.
     * </p>
     *
     * @param string входная строка данных
     * @return возвращает массив {@code Searchable[]} .
     */
    public Searchable[] search(String string) {
        Searchable[] resultArray = new Searchable[10];
        if (string == null || string.isBlank()) {
            return null; // пробросить ошибку
        }
        int count = 0;
        for (Searchable searchable : arrayOfAllElements) {
            if (searchable.searchTerm() != null && searchable.searchTerm().contains(string)) {
                resultArray[count] = searchable;
                count++;
                if (count >= 5) {
                    break;
                }
            }
        }
        return resultArray;
    }

    //Метод add()— добавляет новый объект типа Searchable в массив поискового движка.
    public void addNewItem(Searchable item) {
        Searchable[] localArray = new Searchable[arrayOfAllElements.length + 1];
        System.arraycopy(arrayOfAllElements, 0, localArray, 0, arrayOfAllElements.length);
        localArray[localArray.length-1] = item;
        arrayOfAllElements = localArray;

    }
}
