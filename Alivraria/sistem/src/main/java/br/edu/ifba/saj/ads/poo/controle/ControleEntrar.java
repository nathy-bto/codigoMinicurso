package br.edu.ifba.saj.ads.poo.controle;

import br.edu.ifba.saj.ads.poo.classes.Usuario;
import br.edu.ifba.saj.ads.poo.exceptions.EmailInvalidoException;
import br.edu.ifba.saj.ads.poo.exceptions.SenhaFracaExcepion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControleEntrar {
    
    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField senhaTextField;

    @FXML
    private Button entrarButton;

    @FXML
    private Button xbutton;

    private Stage stage;
    public void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    private void handleClickEntrar(ActionEvent event){
        String nome = nomeTextField.getText();
        String email = emailTextField.getText();
        String senha = senhaTextField.getText();

        try { 
            Usuario usuario = new Usuario(email, senha, 0);
            //salvar em akgum lugar
        } catch (SenhaFracaExcepion | EmailInvalidoException ex) {
            // tratar
        }

        stage.close(); //fechando a janela atual e volta para a tela 1
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
}
