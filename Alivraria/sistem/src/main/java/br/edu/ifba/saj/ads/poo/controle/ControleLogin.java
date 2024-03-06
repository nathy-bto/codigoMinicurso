package br.edu.ifba.saj.ads.poo.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControleLogin {
    
    @FXML
    private Button botaoEntrar;

    @FXML
    private Button botaoCadastrarLivro;

    @FXML
    private Button sairButton;

    @FXML
    private void handleClickEntrar(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela10Entrar.fxml"));
            Parent root = loader.load();

            //obtendo o controlador da tela 10 (entrar)
            ControleEntrar controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleClickCadastrarLivro(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela5Livros.fxml"));
            Parent root = loader.load();

            //obtendo o controlador da tela 5 (livros)
            ControleEntrar controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleClickSair(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela1Principal.fxml"));
            Parent root = loader.load();

            //obtendo o controlador da tela 1 (principal)
            ControlePrincipal controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
