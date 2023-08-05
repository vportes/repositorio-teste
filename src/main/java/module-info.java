module com.apptest.apptest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.logging;

    opens com.apptest.apptest to javafx.fxml;
    exports com.apptest.apptest;
}