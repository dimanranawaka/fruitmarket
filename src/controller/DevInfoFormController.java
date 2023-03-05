package controller;

import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DevInfoFormController {
    public void GotoFacebook(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/diman.dreed.9/"));
    }

    public void GotoLinkdein(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/diman-ranawaka-0810a61a2/"));
    }

    public void GotoGitHub(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://github.com/dimanranawaka"));
    }

    public void GoToTelegram(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://t.me/DREED_D"));
    }
}
