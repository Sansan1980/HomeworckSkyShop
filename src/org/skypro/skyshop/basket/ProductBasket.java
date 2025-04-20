package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private static int count = 0;
    // private ArrayList <Product> RepositoryProduct = new ArrayList<>(5);
    private static Product[] repositoryProduct = new Product[5];


//    Метод добавления продукта в корзину: метод принимает в себя продукт и ничего не возвращает.

    public static void addProduct(Product product) {
        if (count >= 5) {
            System.out.println(" Невозможно добавить продукт");
        } else {
            repositoryProduct[count] = product;
            count++;
            System.out.println("Добавлен новый продукт - " + product);
        }
    }
//Метод получения общей стоимости корзины: метод ничего не принимает и возвращает целое число.

    public static Integer summationTheTotalPraiceTheBasket() {
        Integer priceResult = 0;
        for (int i = 0; i < repositoryProduct.length; i++) {
            if (repositoryProduct[i] != null) {
                Product productResult = repositoryProduct[i];
                priceResult += productResult.getPrice();
            }
        }
        System.out.println("Общая стоимости корзины: " + priceResult);
        return priceResult;
    }

    public void setRepositoryProduct(Product[] repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    public static Product[] getRepositoryProduct() {
        return repositoryProduct;
    }


    //Метод, который печатает содержимое корзины: метод ничего не принимает и не возвращает, но печатает в консоль сообщение вида:
//<имя продукта>: <стоимость>
//<имя продукта>: <стоимость>
//<имя продукта>: <стоимость>
//Итого: <общая стоимость корзины>
//Если в корзине ничего нет, нужно напечатать фразу «в корзине пусто».
    public static void printPraiceBasket() {
        int indexСounter = 0;
        if (indexСounter <= repositoryProduct.length) {
            if (repositoryProduct[indexСounter] != null) {
                for (int i = 0; i < repositoryProduct.length; i++) {
                    indexСounter++;
                    if (repositoryProduct[i] != null) {
                        Product productnew = repositoryProduct[i];
                        System.out.print("Имя продукта =" + productnew.getName());
                        System.out.println(": Стоимость - " + productnew.getPrice());
                    }
                }
                summationTheTotalPraiceTheBasket();

            } else {
                System.out.println("в корзине пусто");
            }
        }
    }
}


//
//Метод, проверяющий продукт в корзине по имени: метод принимает в себя строку
// имени и возвращает boolean в зависимости от того, есть продукт в корзине или его нет.
//Метод очистки корзины: метод ничего не принимает и очищает массив,
// проставляя всем его элементам null
//.
//Обратите внимание!
//
//В качестве хранилища для объектов product используйте массив из пяти элементов, однако прямой доступ к этому массиву должен быть невозможен.
//Если в массиве не хватает места на следующий продукт, то метод добавления продукта должен выводить в консоль сообщение вида: «Невозможно добавить продукт».



