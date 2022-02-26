package com.design.pattern.objectStructure.bridge.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {
        // 구체화된 정보 구현체 쪽
        Class.forName("org.h2.Driver");

        // connection, DriverManager 등등은 추상화 쪽이다.
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {

            String sql = "select * from MEMBER";

            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
