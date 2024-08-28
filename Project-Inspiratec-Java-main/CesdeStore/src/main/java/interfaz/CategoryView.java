package interfaz;

import Service.CategoryService;
import Service.CategoryServiceInterface;
import domain.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryView {

    Scanner sc = new Scanner(System.in);

    private Category category;


    public CategoryView(Category category){
        this.category = category;
    }
    public void createCategory(Category category){

        CategoryServiceInterface categoryService = new CategoryService(category);

        System.out.println("Ingrese el ID");
        int categoryId = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de la categoria");
        String categoryName = sc.nextLine();

        category.setCategoryId(categoryId);
        category.setCategoryName(categoryName);

        categoryService.createCategory(category);

    }








}
