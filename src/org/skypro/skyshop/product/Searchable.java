package org.skypro.skyshop.product;

public interface Searchable {
    /**
     * Метод получения search term (термина поиска) — метод, который будет
     * возвращать текст, по которому мы будем искать.
     */

    public String searchTerm();

    /**
     *   Метод получения типа контента, который мы нашли.
     *   Метод должен возвращать строку с названием типа контента.
     */

    public String extractionTheType();

    /**
     *Метод получения имени Searchable-объекта.
     */

    public String extractionName();

    /**
     *    Метод преобразования Searchable -объекта в строку (он не может называться toString
     *   , так как toString мы используем для вывода товаров в корзине).
     *   Выводит строку вида:  «имя Searchable-объекта — типSearchable-объекта»
     */

    public String getStringRepresentation();

    //. Стоит сделать этот метод интерфейса default и добавить реализацию,
    // которая будет выводить строку вида:
    // «имя Searchable-объекта — типSearchable-объекта».
}
