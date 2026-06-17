package com.bikram.designpattern;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserService {

    public void insertUser(String name) {
        try {
            Connection conn = DBConnection.INSTANCE.getConnection();

            String sql = "INSERT INTO users(name) VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);

            ps.executeUpdate();

            System.out.println("User inserted: " + name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}