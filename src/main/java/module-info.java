module org.gmreyer.tetris {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.gmreyer.tetris to javafx.fxml;
    exports org.gmreyer.tetris;
}