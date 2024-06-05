package org.example.week5;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {

    public Connection databaseLink;

    public Connection getConnection()

    {
        String databaseName="SAMPLE";
        String databaseUser="root";
        String databasePassword="707070";
        String url="jdbc:mysql://127.0.0.1:3306/" + databaseName;

        try{
            databaseLink= DriverManager.getConnection(url,databaseUser,databasePassword);
        }
        catch (Exception e)
        {
             e.printStackTrace();
        }

        return databaseLink;
    }


}
