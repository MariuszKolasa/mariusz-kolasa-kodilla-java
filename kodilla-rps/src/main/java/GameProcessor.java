import java.util.InputMismatchException;
import java.util.Scanner;

public class GameProcessor {
    private Scanner scanner = new Scanner(System.in);
    private GameMessages messages = new GameMessages();
    private GameProcessValidator validator = new GameProcessValidator();
    private Player player;

    GameProcessor(Player player) {
        this.player = player;
    }

    GameProcessor() {
    }

    String scan() {
        return scanner.nextLine();
    }
    Integer scanInt() throws InputMismatchException{


        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }else{
            System.out.println("Podaj liczbę rund do rozegrania!")  ;
            scanner.nextLine();
            return scanner.nextInt();
        }

    }


	void startGame(Integer roundsNumber) {
        int result=0;
        int playerScore=0;
        int computerScore=0;
        String verifiedInput;
        Figure computerFigure;
        Figure playerFigure;

        for (int i = 0; i < roundsNumber;i++) {


            messages.showMenu2();

            String input=scan();
            scan();
            verifiedInput = validator.inputValidator(input);
                if (verifiedInput.equals("x")) {
                GameRunner.end=validator.endGameValidator();
                break;
                } else if (verifiedInput.equals("n")) {
                validator.newGameValidator();
                }

                playerFigure = getFigure(verifiedInput);



            computerFigure= new FigureGenerator().generateFigure();
            validator.resultValidator(playerFigure,computerFigure);

            if(validator.resultValidator(playerFigure,computerFigure)>0){
                playerScore++;
            }else if (validator.resultValidator(playerFigure,computerFigure)<0){
                computerScore++;
            }
            result=result+validator.resultValidator(playerFigure,computerFigure);
            messages.showRoundResult(playerFigure,computerFigure);
        }
        if(result==0){
            messages.showDrawMessage(player.getPlayer(),playerScore,computerScore);
        }else if(result<0){
            messages.showComputerWinsMessage(player.getPlayer(),playerScore,computerScore);
        }else{
            messages.showPlayerWinsMessage(player.getPlayer(),playerScore,computerScore);
        }
        messages.showEndGameMessage();
    }




    private Figure getFigure( String input)  {

            switch (input) {
                case ("1"):
                    return new Rock();
                case ("2"):
                    return new Paper();
                case ("3"):
                    return new Scissors();
                case ("4"):
                    return new Lizard();
                case ("5"):
                    return new Spock();
                default:
                    return null;
            }


    }


}
