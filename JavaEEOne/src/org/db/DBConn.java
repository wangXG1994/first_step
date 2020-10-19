package org.db;

import java.sql.*;

public class DBConn {
    public static Connection connection;
//    public static void main(String[] args) {
//        Connection connection = null;
//        Statement statement = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");// 注册 JDBC 驱动
//            System.out.println("连接数据库...");// 打开链接
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/mbook?serverTimezone=GMT",
//                    "root","123");
//            System.out.println(" 实例化Statement对象...");
//            statement = connection.createStatement();// 执行查询
//            String sql = "SELECT id, name, password FROM login";
//            ResultSet rs = statement.executeQuery(sql);
//
//            // 展开结果集数据库
//            while(rs.next()){
//                // 通过字段检索
//                int id  = rs.getInt("id");
//                String name = rs.getString("name");
//                String url = rs.getString("password");
//
//                // 输出数据
//                System.out.print("ID: " + id);
//                System.out.print(", name: " + name);
//                System.out.print(", password: " + url);
//                System.out.print("\n");
//            }
//            // 完成后关闭
//            rs.close();
//            statement.close();
//            connection.close();
//        }catch(SQLException se){
//            // 处理 JDBC 错误
//            se.printStackTrace();
//        }catch(Exception e){
//            // 处理 Class.forName 错误
//            e.printStackTrace();
//        }finally{
//            // 关闭资源
//            try{
//                if(statement!=null) statement.close();
//            }catch(SQLException se2){
//            }// 什么都不做
//            try{
//                if(connection!=null) connection.close();
//            }catch(SQLException se){
//                se.printStackTrace();
//            }
//        }
//        System.out.println("Goodbye!");
//    }
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbook?serverTimezone=GMT");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mbook?serverTimezone=GMT",
                    "root","123");
            return connection;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void ClossConnection(){
        try {
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
