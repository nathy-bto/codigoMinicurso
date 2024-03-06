package br.edu.ifba.saj.ads.poo.controle;

import java.io.File;

import br.edu.ifba.saj.ads.poo.classes.Livraria;
import br.edu.ifba.saj.ads.poo.classes.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ControleCadastro {
    
    @FXML
    private Button cadastrarImagemButton;

    @FXML
    private ImageView imageView;

    @FXML
    private Button cadastrarLivroButton;

    @FXML
    private Button xButton;
    
    @FXML
    private Button menuButton;

    @FXML 
    private TextField tituloTextField;

    @FXML 
    private TextField autorTextField;

    @FXML 
    private TextField categoriaTextField;

    @FXML 
    private TextField editoraTextField;

    @FXML 
    private TextField valorTextField;

    @FXML 
    private TextField aluguelTextField;

    private Livraria livraria;

    @FXML
    private void handleCadastrarImagem(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecionar imagem");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Imagens", "*.png", "*.jpg", "*.gif"));

        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            imageView.setImage(image);
        }
    }

    @FXML
    private void handleCadastrarLivro(){
        String titulo = tituloTextField.getText();
        String autor = autorTextField.getText();
        String categoria = categoriaTextField.getText();
        String editora = editoraTextField.getText();
        String valor = valorTextField.getText();
        String aluguel =  aluguelTextField.getText();

        try {
            livraria.adicionar(null);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

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
