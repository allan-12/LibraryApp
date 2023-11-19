package com.example.apijava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ApiJavaApplication {
    public static void main(String[] args) {
        // Informations de connexion à la base de données
        String url = "jdbc:postgresql://localhost:5432/library_management";
        String user = "prog_admin";
        String password = "123456";

        try {
            // Charger le driver
            System.out.println("Chargement du driver PostgreSQL...");
            Class.forName("org.postgresql.Driver");

            // Établir la connexion
            System.out.println("Établissement de la connexion à la base de données...");
            Connection connection = DriverManager.getConnection(url, user, password);

            // Fermer la connexion
            System.out.println("Fermeture de la connexion à la base de données...");
            connection.close();

            // Message de confirmation
            System.out.println("Connexion à la base de données réussie !");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
