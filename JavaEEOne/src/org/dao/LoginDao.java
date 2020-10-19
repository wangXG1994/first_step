package org.dao;

import org.db.DBConn;
import org.model.Login;
import org.dao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
    Connection connection;
    public Login checkLogin(String name,String password){
        try {
            connection =DBConn.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from login where name=?"+"and password = ?;");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                Login login = new Login();
                login.setId(resultSet.getInt("id"));
                login.setName(resultSet.getString("name"));
                login.setPassword(resultSet.getString("password"));
                login.setRole(resultSet.getBoolean("role"));
                return login;
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            DBConn.ClossConnection();
        }
    }
}
