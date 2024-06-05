package controller;

import model.conexion;
import view.*;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionController {

    //vista en el cual muestre los datos
    private ConsoleView viewConsole;

    public ConexionController(ConsoleView viewConsole){
        this.viewConsole = viewConsole;
    }

    public void openConnection(){
        Connection connection = conexion.getConnection();
        if ( connection !=null){
            try{
                connection.close();
                viewConsole.showMessage("Conexion Establecida");
            } catch ( SQLException e){
                viewConsole.errorMessage("Error al conectar"+ e.getMessage());
            }
        }
    }

}
