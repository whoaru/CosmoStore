package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {



    private int categoryId;

    private String categoryName;

    Scanner sc = new Scanner(System.in);


    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }


    public Category(){

    }

    // Getter and Setter

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    // Métodos propios


    List<ArrayList<String>> categories = new ArrayList<>();

    public void createCategory(){

        ArrayList<String> category = new ArrayList<String>();

        System.out.println("Ingrese el ID");
        categoryId = sc.nextInt();
        String categoryIdS = categoryId+ "";
        category.add(categoryIdS);
        sc.nextLine();
        System.out.println("Ingrese el nombre de la categoria");
        categoryName = sc.nextLine();
        category.add(categoryName);
        categories.add(category);
    }


    public void printCategories(){

        for(ArrayList i: categories){
            System.out.println(i);
        }

    }







    /*
    String [][] categories = new String[5][2];

    public void createCategory(){

        String [] category = new String[2];

        System.out.println("Ingrese el ID");
        categoryId = sc.nextInt();
        category[0] = categoryId + "";
        sc.nextLine();
        System.out.println("Ingrese el nombre de la categoria");
        categoryName = sc.nextLine();
        category[1] = categoryName;
        System.out.println("Indique el numero de item a crear");
        int itemNumber = sc.nextInt();
        categories[itemNumber] = category;
    }

    public void listCategory(){
        System.out.println("Id: " +categoryId + "\n" +
                "Nombre Categoria: " + categoryName);
    }



    public void printCategories(){

        for(int i = 0; i < categories.length; i++ ){
            for(int j = 0; j < categories[i].length; j++)

            System.out.println(categories[i][j]);
        }
    }*/






}
