public class GameRunner {
    public static void main(String[] args) {
        GameMesseges messeges = new GameMesseges();
        GameProcessor gameProcessor = new GameProcessor();
        GameProcessValidator validator = new GameProcessValidator();
        boolean end = false;


        messeges.welcomeMessage();


        while (!end) {
            int rundsNumber = 0;

            String name;
            messeges.showMenu1();
            end=validator.endGameValidator();

            messeges.askForPlayerName();
            name = gameProcessor.scan();
            Player player = new Player(name);
            messeges.askForNumberOfRounds();
            rundsNumber = gameProcessor.scanInt();
            validator.roundsNumberValidator(rundsNumber);
            gameProcessor.startGame(rundsNumber);

            messeges.showNewGameConfirmationMessage();
            validator.newGameValidator();
        }


    }
}
