module ak.hirve.busfleetrepairmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens ak.hirve.busfleetrepairmanagement to javafx.fxml;
    exports ak.hirve.busfleetrepairmanagement;
}