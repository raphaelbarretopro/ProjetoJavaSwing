module Blonson {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    // Esta linha é crucial para permitir o acesso à sua classe principal
    //exports application;
    //opens application to javafx.fxml;

    exports controller;
    opens controller to javafx.fxml;

    exports model;
    opens model to javafx.fxml;
}