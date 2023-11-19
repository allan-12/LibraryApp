package com.example.apijava.connection;

import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    @Bean
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                Config.URL,
                Config.USERNAME,
                Config.PASSWORD
        );
    }
}
