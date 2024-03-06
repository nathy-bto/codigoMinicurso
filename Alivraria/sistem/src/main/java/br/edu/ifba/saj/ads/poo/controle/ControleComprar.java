package br.edu.ifba.saj.ads.poo.controle;

import java.io.File;

import br.edu.ifba.saj.ads.poo.classes.Livraria;
import br.edu.ifba.saj.ads.poo.classes.Livro;
import br.edu.ifba.saj.ads.poo.classes.Usuario;
import br.edu.ifba.saj.ads.poo.exceptions.LivroIndisponivelExcepetion;
import br.edu.ifba.saj.ads.poo.exceptions.SaldoInsuficienteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ControleComprar {
    
    @FXML
    private Button comprarButton;

    @FXML
    private Button alugarButton;

    @FXML
    private Button menuButton;

    @FXML
    private Button xButton;

    private Usuario usuario;
    private Livro livro;
    private Livraria livraria;


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
    private void initialize(){
        comprarButton.setOnAction(event -> {
            try {
                livraria.comprarLivro(usuario, livro);
            } catch (LivroIndisponivelExcepetion e) {
                // Tratar
            } catch (SaldoInsuficienteException e){
                //tratar
            }
        });
    }

    @FXML
    private void initialize2(){
        alugarButton.setOnAction(event -> {
            try {
                livraria.alugarLivro(usuario, livro, 0);
            } catch (SaldoInsuficienteException e){
                //tratar
            }
        });
    }



}
