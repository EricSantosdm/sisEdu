module com.mycompany.sisedu {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.sisedu to javafx.fxml;
    exports com.mycompany.sisedu;
    requires hibernate.jpa;
}
