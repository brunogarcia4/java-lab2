module org.example.week5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.week5 to javafx.fxml;
    exports org.example.week5;
}