package hai.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import uet.oop.bomberman.sound.SimpleAudioPlayer;
import uet.oop.bomberman.gui.Frame;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    public void startbuttonclicked() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer();
        audioPlayer.play();
        new Frame();
    }
}

