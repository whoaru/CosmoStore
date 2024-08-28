package repository.database;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connect() ){


        }catch(SQLException e){
            System.out.println(e);
        }
    }


}
