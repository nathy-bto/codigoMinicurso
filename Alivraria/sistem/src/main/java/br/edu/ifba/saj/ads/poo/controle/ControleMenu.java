package br.edu.ifba.saj.ads.poo.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControleMenu {
    
    @FXML
    private Button listaDesejosButton;

    @FXML 
    private Button sairButton;

    @FXML
    private Button xButton;

    @FXML
    private void handleClickLista(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela6ListaDesejos.fxml"));
            Parent root = loader.load();

            //controlador tela 6 (lista de desejos)
            ControleListaDesejos controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleClickX(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela1Principal.fxml"));
            Parent root = loader.load();

            //controlador da tela 9 (menu)
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
    private void handleClickListaDesejos(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela6ListaDesejos.fxml"));
            Parent root = loader.load();

            //controlador da tela 6 (listaDesejos)
            ControleListaDesejos controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
