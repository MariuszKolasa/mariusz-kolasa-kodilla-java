import java.util.Scanner;

public class GameProcessor {
    Scanner scanner = new Scanner(System.in);
    GameMesseges messeges = new GameMesseges();
    GameProcessValidator validator = new GameProcessValidator();
    Player player=new Player();



    public String scan() {
        return scanner.nextLine();
    }
    public Integer scanInt() {
        return scanner.nextInt();
    }


	public void startGame(Integer roundsNumber) {
        int result=0;
        int playerScore=0;
        int computerScore=0;

        for (int i = 0; i < roundsNumber;i++) {
            int round=0;
            round++;
            Figure playerFigure;
            Figure computerFigure;


            messeges.showMenu2();

            validator.endGameValidator();
            playerFigure=getFigure();
            computerFigure=FigureGenerator.generateFigure();
            if(validator.resultValidator(playerFigure,computerFigure)>0){
                playerScore++;
            }else if (validator.resultValidator(playerFigure,computerFigure)<0){
                computerScore++;
            } else{
                playerScore++;
                computerScore++;
            }
            result=result+validator.resultValidator(playerFigure,computerFigure);

        }
        messeges.showScores(playerScore,computerScore);
        if(result==0){
            messeges.showDrawMessage(player.getPlayer(),playerScore,computerScore);
        }else if(result<0){
            messeges.showComputerWinsMessage(player.getPlayer(),playerScore,computerScore);
        }else{
            messeges.showPlayerWinsMessage(player.getPlayer(),playerScore,computerScore);
        }

	}
    public Figure getFigure() {


        GameProcessor gameProcessor= new GameProcessor();
        int input=gameProcessor.scanInt();
        switch (input) {
            case (1):
                return new Paper();
            case (2):
                return new Rock();
            case (3):
                return  new Scissors();
            case (4):
                return new Lizard();
            case  (5):
                return  new Spock();


        }
        GameMesseges messeges =new GameMesseges();
        messeges.showIncorrectMenuInputMessege();
        return getFigure();

    }


}
