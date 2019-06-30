import java.util.Scanner;

public class GameProcessValidator {

   GameMesseges messeges= new GameMesseges();
   Scanner scanner =new Scanner(System.in);
   int roundsNumber;
    public void roundsNumberValidator(int roundsNumber){
        if(roundsNumber <=0)  new GameMesseges().showIncorrectRoundsInput();
    }
    public boolean endGameValidator() {
        boolean end=false;
        switch (scanner.nextLine()) {
            case("x"):
                messeges.showQuitConfirmationMessage();
                if (scanner.nextLine().equals("t")) {

                    end = true;
                } else if (scanner.nextLine().equals("n")) {
                    end = false;
                }
            case("n"):
                messeges.showNewGameConfirmationMessage();
                newGameValidator();

        }
        return end;

    }
    
    
    public void newGameValidator() {
        if (scanner.nextLine()!="t"&&scanner.nextLine()!="n"){
            messeges.incorrectEndOfGameInput();
        }else if (scanner.nextLine().equals("t")) {
            new GameProcessor().startGame(roundsNumber);
        }
    }

    public int resultValidator(Figure playerFigure,Figure computerFigure) {
        Figure rock=new Rock();
        Figure paper=new Paper();
        Figure scissors=new Scissors();
        Figure lizard=new Lizard();
        Figure spock=new Spock();
        int result;
        if(playerFigure.equals(computerFigure)){
            result = 0;
        } else if (playerFigure.equals(rock)&&computerFigure.equals(paper)||
                playerFigure.equals(rock)&&computerFigure.equals(spock)) {
            result = -1;
        }else if (playerFigure.equals(paper)&&computerFigure.equals(scissors)||
                playerFigure.equals(paper)&&computerFigure.equals(lizard)) {
            result = -1;
        }else if (playerFigure.equals(scissors)&&computerFigure.equals(rock)||
                playerFigure.equals(scissors)&&computerFigure.equals(spock)){
            result = -1;
        }else if (playerFigure.equals(lizard)&&computerFigure.equals(rock)||
                playerFigure.equals(lizard)&&computerFigure.equals(scissors)){
            result = -1;
        }else if (playerFigure.equals(spock)&&computerFigure.equals(paper)||
                playerFigure.equals(spock)&&computerFigure.equals(lizard)){
            result = -1;
        }else {
            result=1;
        }
        return result;
    }
}
