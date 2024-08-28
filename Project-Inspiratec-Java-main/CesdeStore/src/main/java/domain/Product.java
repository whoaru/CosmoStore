package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {


    private int productId;
    private String productName;
    private String description;
    domain.Category category;
    private float cost;
    private float profit;
    private float price;
    private String state;

    Scanner sc = new Scanner(System.in);


    // Constructores

    public Product(){


    }

    public Product(int productId, String productName, String description, Category category, float cost, float profit, float price, String state) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.cost = cost;
        this.profit = profit;
        this.price = price;
        this.state = state;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    // Create categoria - metodo propio

    List<ArrayList<Object>> products = new ArrayList<>();
    public void createProduct(){


        ArrayList<Object> product = new ArrayList<Object>();

        System.out.println("Ingrese el id del producto");
        productId = sc.nextInt();
        product.add(productId);
        sc.nextLine();
        System.out.println("Ingrese el nombre del producto");
        productName = sc.nextLine();
        product.add(productName);
        System.out.println("Ingrese la descripcion");
        description = sc.nextLine();
        product.add(description);
        System.out.println("Seleccione una categoria");
        category.getCategoryName();
        product.add(category);
        System.out.println("Ingrese el costo del producto");
        cost = sc.nextFloat();
        product.add(cost);
        System.out.println("Ingrese el margen de ganancia");
        profit = sc.nextFloat();
        product.add(profit);
        sc.nextLine();
        System.out.println("Calculando Precio...");
        price = calculatePrice(cost, profit);
        product.add(price);
        System.out.println("Seleccione un estado");
        state = sc.nextLine();
        product.add(state);

        products.add(product);
    }

    public float calculatePrice(float cost, float profit){

        return cost/(1- (profit/100));
    }

    public void printProduct(){

        for(Object i: products){
            System.out.println(i);
        }


        /*

        System.out.println("Id " + productId + "\n" +
                "Nombre: " + productName + "\n" +
                "Descripcion" + description + "\n" +
                "Categoria " + category.getCategoryName() + "\n" +
                "costo" + cost + "\n" +
                "Ganancia "  + profit + "\n" +
                "Precio" + price + "\n" +
                "Estado" + state );*/


    }




}
