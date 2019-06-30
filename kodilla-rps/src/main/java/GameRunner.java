public class GameRunner {
    public static void main(String[] args) {
        GameMessages messages = new GameMessages();
        GameProcessor game= new GameProcessor();
        GameProcessValidator validator = new GameProcessValidator();
        boolean end = false;


        messages.welcomeMessage();


        while (!end) {
            int roundsNumber;

            String name;
            messages.showMenu1();
           if(validator.endGameValidator()){
              end=true;
           }

            messages.askForPlayerName();
            name = game.scan();
            Player player = new Player(name);
            GameProcessor gameProcessor = new GameProcessor(player);

            messages.askForNumberOfRounds();
            roundsNumber = gameProcessor.scanInt();
            validator.roundsNumberValidator(roundsNumber);
            gameProcessor.startGame(roundsNumber);
            validator.newGameValidator();


        }


    }
}
