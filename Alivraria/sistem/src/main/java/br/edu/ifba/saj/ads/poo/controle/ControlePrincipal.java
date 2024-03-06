package br.edu.ifba.saj.ads.poo.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControlePrincipal {
    
    @FXML
    private TextField pesquisarTextField;

    @FXML
    private void handleTextField(){
        String texto = pesquisarTextField.getText();
    }

    @FXML
    private Button pesquisaButton;

    @FXML
    private void handleClickPesquisaView(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela8PesquisaView.fxml"));
            Parent root = loader.load();

            //controlador da tela 8 (list view)
            ControleListView controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button livrosButton;

    @FXML
    private void handleClickLivros(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela5Livros.fxml"));
            Parent root = loader.load();

            //controlador da tela 5 (livros)
            ControleLivros controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button categoriaButton;

    @FXML
    private void handleClickCategoria(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela7Categorias.fxml"));
            Parent root = loader.load();

            //controlador da tela 7 (categorias)
            ControleCategoria controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button listaDesejosButton;

    @FXML
    private void handleClickListaDesejos(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela6ListaDesejos.fxml"));
            Parent root = loader.load();

            //controlador da tela 6 (Lista Desejos)
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
    private Button irButton;

    @FXML
    private void handleClickIr(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tela3Comprar.fxml"));
            Parent root = loader.load();

            //controlador da tela 3 (comprar)
            ControleComprar controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private Button menuButton;

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
