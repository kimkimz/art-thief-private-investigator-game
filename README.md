# Guess Who's the Thief- Interactive Mystery Game

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaFX](https://img.shields.io/badge/javafx-%23FF0000.svg?style=for-the-badge&logo=javafx&logoColor=white)

**Guess Who's the Thief** is an interactive, AI-driven mystery game that challenges players to uncover clues, interrogate suspects, and solve a high-stakes art theft case. This project combines gameplay with AI-powered dialogue and voice interaction, creating an engaging experience for players.

## Team Collaboration

| Team Member     | GitHub                                          |
| --------------- | ----------------------------------------------- |
| Johnson Zhang   | [@ZingZing001](https://github.com/ZingZing001)  |
| Kimberly Zhu    | [@kimkimz](https://github.com/kimkimz)          |
| Nicky Tian      | [@Nicky8566](https://github.com/nicky8566)      |

## Key Features
- **AI-Powered Dialogue**: Uses OpenAI's Chat Completions to provide unique, interactive feedback based on the player's choices.
- **Timer Management**: Real-time countdown timers across scenes to keep the gameplay exciting and synchronized.
- **Interactive Cutscenes**: Smooth transitions between dialogues with auto-skip functionality.
- **Sound Integration**: Custom MP3 playback for sound effects during gameplay and cutscenes.

## Gameplay Controls
- **Movement**: Mouse and keyboard interactions to select suspects and submit answers.
- **Key Bindings**:
  - **Skip Cutscene**: `Enter` key skips current dialogue.
  - **Submit Answer**: Press the `Submit` button or hit `Enter` to confirm your guess.
  - **Interact**: Click on suspects or clues to investigate them.

## To setup the API to access Chat Completions and TTS

- add in the root of the project (i.e., the same level where `pom.xml` is located) a file named `apiproxy.config`
- put inside the credentials that you received from no-reply@digitaledu.ac.nz (put the quotes "")

  ```
  email: "UPI@aucklanduni.ac.nz"
  apiKey: "YOUR_KEY"
  ```
  These are your credentials to invoke the APIs. 

  The token credits are charged as follows:
  - 1 token credit per 1 character for Googlel "Standard" Text-to-Speech. 
  - 4 token credit per 1 character for Google "WaveNet" and "Neural2" Text-to-Speech.
  - 1 token credit per 1 character for OpenAI Text-to-Text.
  - 1 token credit per 1 token for OpenAI Chat Completions (as determined by OpenAI, charging both input and output tokens).


## Free TTS

There is a free TTS service available for testing purposes. You will see this in the `nz.ac.auckland.se206.speech.FreeTextToSpeech` class. The voice here is not as good as the Google and OpenAI TTS services, but it is free and can be used for testing purposes.

You will see an example of this in the `ChatController` class. 



## To setup codestyle's API

- add in the root of the project (i.e., the same level where `pom.xml` is located) a file named `codestyle.config`
- put inside the credentials that you received from gradestyle@digitaledu.ac.nz (put the quotes "")

  ```
  email: "UPI@aucklanduni.ac.nz"
  accessToken: "YOUR_KEY"
  ```

 these are your credentials to invoke gradestyle

## To run the game

`./mvnw clean javafx:run`

## To debug the game

`./mvnw clean javafx:run@debug` then in VS Code "Run & Debug", then run "Debug JavaFX"

## To run codestyle

`./mvnw clean compile exec:java@style`