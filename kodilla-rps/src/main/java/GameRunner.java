public class GameRunner {
    static boolean end=false;
    public static void main(String[] args) {
        GameMessages messages = new GameMessages();
        GameProcessor game= new GameProcessor();
        GameProcessValidator validator = new GameProcessValidator();



        messages.welcomeMessage();


        while (!end) {
            int roundsNumber;
            String name;

            messages.showMenu1();



           if(game.scan().equals("x")){
              end= validator.endGameValidator();
              if(end)break;
           }

            messages.askForPlayerName();
            name = game.scan();
            Player player = new Player(name);
            GameProcessor gameProcessor = new GameProcessor(player);

            messages.askForNumberOfRounds();
            roundsNumber = gameProcessor.scanInt();
            validator.roundsNumberValidator(roundsNumber);
            gameProcessor.startGame(roundsNumber);

            if(game.scan().equals("x")) {
               end= validator.endGameValidator();
               if(end) break;
            }else if (game.scan().equals("n")){
                validator.newGameValidator();
                break;
            }


        }


    }
}
