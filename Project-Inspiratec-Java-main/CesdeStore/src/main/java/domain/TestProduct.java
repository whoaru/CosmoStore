package domain;

import interfaz.CategoryView;

public class TestProduct {

    public static void main(String[] args) {

        Category category = new Category();

        Product product = new Product();

        CategoryView categoryView = new CategoryView(category);

        categoryView.createCategory(category);










    }




}
