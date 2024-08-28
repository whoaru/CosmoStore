package repository;

import domain.Category;
import repository.database.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryRepository {


    public static void createCategory(Category category){
        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connect() ){

            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO category( category_name) VALUES (?)";
                ps = connect.prepareStatement(query);
                ps.setString(1, category.getCategoryName());
                ps.executeUpdate();
                System.out.println("Registro de libro Exitoso");

            }catch(SQLException e){
                System.out.println(e);
            }


        }catch(SQLException e){
            System.out.println(e);
        }
    }

    }






