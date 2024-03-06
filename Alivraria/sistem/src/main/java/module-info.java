module br.edu.ifba.saj.ads.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.ifba.saj.ads.poo to javafx.fxml;
    exports br.edu.ifba.saj.ads.poo.classes;
    exports br.edu.ifba.saj.ads.poo.controle;
    exports br.edu.ifba.saj.ads.poo.exceptions;
}
