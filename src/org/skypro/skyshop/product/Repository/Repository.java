package org.skypro.skyshop.product.Repository;

import org.skypro.skyshop.product.Searchable;

public class Repository {
    private int count = 0;
    private  Searchable[] repository = new Searchable[20];

    public Searchable[] getRepository() {
        return repository;
    }

    public void addRepository(Searchable item) {
        if (item != null) {
            repository[count] = item;
            count++;
        }
    }
}
