package com.isep;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.*;

import java.io.File;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label welcomeText;
    public Button entrerLobby;
    public Button boutonAcces;
    public Button quitter;
    public ImageView imgScooby;
    public VBox boiteBouton;
    public Spinner nbAllie;
    public AnchorPane contenu;
    public AnchorPane ancreBtnLobby;
    public static int nbJoueur;

    @FXML
    protected void lobby()
        {
            contenu.setVisible(true);
            contenu.setDisable(false);

            boiteBouton.setVisible(true);
            boiteBouton.setDisable(false);

            ancreBtnLobby.setVisible(false);
            ancreBtnLobby.setDisable(true);

            quitter.setDisable(true);
            quitter.setVisible(false);

            final int initialValue = 1;
            SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4, initialValue);
            nbAllie.setValueFactory(valueFactory);
        }
    @FXML
    protected void onHelloButtonClick()
    {
        //System.out.print(nbAllie.getValue());
        nbJoueur = (int) nbAllie.getValue();
        welcomeText.setText("Bienvenu dans ce jeu ;] !!");

        boiteBouton.setVisible(false);
        boiteBouton.setDisable(true);

        quitter.setDisable(false);
        quitter.setVisible(true);

        quitter.setVisible(true);
        //musique();
        String uriString = new File("D:\\Cours\\Isep\\A1\\Algorithmique\\isep\\src\\main\\resources\\com\\isep\\music\\drillScooby.mp3").toURI().toString();
        MediaPlayer player = new MediaPlayer( new Media(uriString));
        player.play();
    }
    @FXML
    protected void quitter()
        {
            welcomeText.setText("Vous êtes de retour");

            lobby();

            quitter.setVisible(false);
            quitter.setDisable(true);
        }

    protected void musique()
        {

        }
}