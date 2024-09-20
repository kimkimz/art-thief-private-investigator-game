package nz.ac.auckland.se206.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import nz.ac.auckland.apiproxy.exceptions.ApiProxyException;
import nz.ac.auckland.se206.App;
import nz.ac.auckland.se206.TimeManager;

/**
 * The StartRoomController class manages the interaction within the starting room of the game. It
 * handles the initialization of sounds and timer when the game starts.
 */
public class StartRoomController {

  @FXML private Button startButton;

  private MediaPlayer player;
  private Media sound;

  /**
   * Initializes the start room view by playing the welcome sound when the room is loaded.
   *
   * @throws ApiProxyException if there is an error communicating with the API proxy
   * @throws URISyntaxException if there is an issue with the URI of the sound file
   */
  @FXML
  public void initialize() throws ApiProxyException, URISyntaxException {
    sound = new Media(App.class.getResource("/sounds/welcome.mp3").toURI().toString());
    player = new MediaPlayer(sound);
    player.play();
  }

  /**
   * Handles the action when the "Start" button is clicked. It plays an opening sound, starts the
   * game timer, and transitions the player to the next room.
   *
   * @param event the action event triggered by clicking the "Start" button
   * @throws ApiProxyException if there is an error communicating with the API proxy
   * @throws IOException if there is an I/O error while changing scenes
   * @throws URISyntaxException if there is an issue with the URI of the sound file
   */
  @FXML
  private void onStart(ActionEvent event)
      throws ApiProxyException, IOException, URISyntaxException {
    TimeManager timeManager = TimeManager.getInstance();
    timeManager.setInterval(60);
    timeManager.startTimer();
    sound = new Media(App.class.getResource("/sounds/opening_sound.mp3").toURI().toString());
    player = new MediaPlayer(sound);
    player.play();
    App.setRoot("room");
  }
}
