import java.util.InputMismatchException;
import java.util.Scanner;

public class GameProcessor {
    Scanner scanner = new Scanner(System.in);
    GameMessages messages = new GameMessages();
    GameProcessValidator validator = new GameProcessValidator();
    Player player;

    public GameProcessor(Player player) {
        this.player = player;
    }

    public GameProcessor() {
    }

    public String scan() {
        return scanner.nextLine();
    }
    public Integer scanInt() throws InputMismatchException{


        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }else{
            System.out.println("Podaj liczbę rund do rozegrania!")  ;
            scanner.hasNextInt();
            return scanner.nextInt();
        }

    }


	public void startGame(Integer roundsNumber) {
        int result=0;
        int playerScore=0;
        int computerScore=0;

        for (int i = 0; i < roundsNumber;i++) {
            Figure playerFigure;
            Figure computerFigure;
            messages.showMenu2();
            validator.endGameValidator();
            validator.newGameValidator();
            playerFigure=getFigure();
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
    public Figure getFigure() {
        int input=scanner.nextInt();
        switch (input) {
            case (1):
                return new Rock();
            case (2):
                return new Paper();
            case (3):
                return  new Scissors();
            case (4):
                return new Lizard();
            case (5):
                return  new Spock();
        }
        messages.showIncorrectMenuInputMessege();
        return getFigure();

    }


}
