package br.edu.ifba.saj.ads.poo.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControleCategoria {
    
    @FXML
    private Button acaoButton;

    @FXML
    private Button aventuraButton;

    @FXML
    private Button romanceButton;

    @FXML
    private Button menuButton;

    @FXML
    private Button xButton;

    @FXML
    private Button lupaButton;

        @FXML
    private void handleClickX(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela1Principal.fxml"));
            Parent root = loader.load();

            //controlador da tela 1 (principal)
            ControlePrincipal controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleClickMenu(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela9Menu.fxml"));
            Parent root = loader.load();

            //controlador da tela 9 (menu)
            ControleMenu controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
