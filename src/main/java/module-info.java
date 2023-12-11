module com.example.lat2mod6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lat2mod6 to javafx.fxml;
    exports com.example.lat2mod6;
}