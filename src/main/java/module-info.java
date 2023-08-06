module com.apptest.apptest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.logging;

    opens com.vportes.apptest to javafx.fxml;
    exports com.vportes.apptest;
    exports com.vportes.apptest.controller;
    opens com.vportes.apptest.controller to javafx.fxml;
}