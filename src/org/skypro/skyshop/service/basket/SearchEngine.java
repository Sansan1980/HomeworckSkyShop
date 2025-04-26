package org.skypro.skyshop.service.basket;

import org.skypro.skyshop.product.Searchable;

import java.util.ArrayList;
import java.util.Arrays;
// Создать класс SearchEngine который по введеной строке будет искать (Создать метод поиска - search ) совпадающую последовательность
// под элементов символов строки   в общем массиве Searchable[]. Заполненый (Создать метод -add- заполнения массива "Поле
//Searchable[]" для поиска )  обьектами Продукт и Артикле. Размерность массива задавать в конструкторе класса SearchEngine.
// метод Search принимает в себя строку для поиска и отдает массив из пяти найденых элементов(придумать название) -это может быть локальная переменная метода

// Метод add()— добавляет  в массив поискового движка(Searchable[]) новый объект типа Searchable .тоесть он ищет обьекты в В массивах Product и Article


//Обратите внимание! Чтобы реализовать поиск по массиву Searchable , нужно перебрать весь массив(Searchable[]): брать у каждого элемента
//SearchTerm и искать по нему, используя встроенный метод строки contains
//. Найденные элементы нужно сразу определять в массив (новый массив с найдеными элементами "Название массива придумать самому").

// Если элементов больше 5, то можно прерывать цикл поиска с помощью ключевого слова break.
//. Массив результатов может содержать null -элементы, а также его не нужно сортировать или вставлять элементы специальным образом через индексы,
//
// достаточно вернуть 5 первых подходящих объектов Searchable

public class SearchEngine {
    private ProductBasket productBasket= new ProductBasket();
    private Searchable[] arrayOfAllElements;
   private   ArrayList<Searchable> resultArray = new ArrayList<>();

    public SearchEngine(int size) {
        this.arrayOfAllElements = new Searchable[size];
    }

    //Метод search— принимает в себя строку для поиска и возвращает 5
    // результатов поиска по массиву Searchable в виде массива из 5 элементов.
    public ArrayList<Searchable> search(String string) {
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
           // System.out.println(resultArray);
        }
        return Arrays.toString(resultArray[]);
    }
    //Метод add()— добавляет новый объект типа Searchable в массив поискового движка.
}
