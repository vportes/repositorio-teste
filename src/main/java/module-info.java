module com.apptest.apptest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.apptest.apptest to javafx.fxml;
    exports com.apptest.apptest;
}