module hai.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens hai.demo2 to javafx.fxml;
    exports hai.demo2;
}