package ku.cs.duckdealer.warehouse_manager.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPaneController {

    private MainController mainCtrl;
    private FlowPane mainPane;
    @FXML
    private Menu loginStatus;
    @FXML
    private FlowPane leftPane, rightPane;

    @FXML
    public void login() {
        this.mainCtrl.login();
    }

    @FXML
    public void logout() {
        this.mainCtrl.logout();
    }

    public FlowPane getMainPane() {
        return mainPane;
    }

    public void setMainPane(FlowPane mainPane) {
        this.mainPane = mainPane;
    }

    public FlowPane getLeftPane() {
        return leftPane;
    }

    public FlowPane getRightPane() {
        return rightPane;
    }

    public Menu getLoginStatus() {
        return loginStatus;
    }

    public void setMainCtrl(MainController mainCtrl) {
        this.mainCtrl = mainCtrl;
    }
}
