package org.example.week5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

                    public class controller {
                        @FXML
                        public Label Id;
                        public Label name;
                        public Label age;
                        public void connectBtn(ActionEvent actionEvent)
                        {
                            DatabaseConnectivity connect = new DatabaseConnectivity();
                            Connection connectDb=connect.getConnection();

                            if(connectDb!=null) {
                                String connectQuery="select id, name, age from IdNameAge";

                                try {
                                    Statement stmt=connectDb.createStatement();
                                    ResultSet queryOutput=stmt.executeQuery(connectQuery);
                                    while(queryOutput.next()){
                                       Id.setText(queryOutput.getString("id"));
                                        name.setText(queryOutput.getString("name"));
                                        age.setText(queryOutput.getString("age"));
                                    }

                                }
                                catch(Exception e){
                                    e.printStackTrace();
                                }}
                            else {
                                System.out.println("Error connecting to the Database");
                            }
                        }
                    }


