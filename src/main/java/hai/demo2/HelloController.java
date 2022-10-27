package hai.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import uet.oop.bomberman.SimpleAudioPlayer;
import uet.oop.bomberman.gui.Frame;
import uet.oop.bomberman.menu.PressStart;
import uet.oop.bomberman.menu.start2;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    public void startbuttonclicked() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        start2 dr = new start2();
        dr.show();
        dr.getContentPane().addMouseListener(new PressStart());
        SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer();
        audioPlayer.play();
        new Frame();
    }

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void Submit(ActionEvent e){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
    }

}