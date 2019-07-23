import java.util.Scanner;

public class GameProcessValidator {

    private GameMessages message = new GameMessages();
    private Scanner scanner =new Scanner(System.in);
    private String scan;
     void roundsNumberValidator(int roundsNumber){
        if(roundsNumber <=0)  message.showIncorrectRoundsInput();
    }

    boolean endGameValidator() {


                message.showQuitConfirmationMessage();
                scan=scanner.nextLine();

                if (scan.equals("t")) {

                  return true;
                } else  if(!scan.equals("n")){
                    message.incorrectEndOfGameInput();
                   return endGameValidator();
                }
                return false;
    }
    String inputValidator(String scan) {
        if (scan.equals("x") || scan.equals("n") || scan.equals("1")
                || scan.equals("2") || scan.equals("3") || scan.equals("4") || scan.equals("5")) {
            System.out.println("wybrano: " +scan);
            return scan;
        } else {
            message.showIncorrectMenuInputMessege();

            return inputValidator(scanner.nextLine());

        }

    }
     void newGameValidator() {
        message.showNewGameConfirmationMessage();
        scan=scanner.nextLine();

            if (scan.equals("t")) {
                message.askForNumberOfRounds();
                int roundsNumber = new GameProcessor().scanInt();
                scanner.next();
                roundsNumberValidator(roundsNumber);
                new GameProcessor().startGame(roundsNumber);

            } else if (!scan.equals("n") ) {
                message.incorrectEndOfGameInput();
                newGameValidator();

            }
     }


     int resultValidator(Figure playerFigure,Figure computerFigure) {
        Figure rock=new Rock();
        Figure paper=new Paper();
        Figure scissors=new Scissors();
        Figure lizard=new Lizard();
        Figure spock=new Spock();
        int result;
        if(playerFigure.equals(computerFigure)){
            result = 0;
        } else if ((playerFigure.equals(rock)&&computerFigure.equals(paper))||
                (playerFigure.equals(rock)&&computerFigure.equals(spock))) {
            result = -1;
        }else if ((playerFigure.equals(paper)&&computerFigure.equals(scissors))||
                (playerFigure.equals(paper)&&computerFigure.equals(lizard))) {
            result = -1;
        }else if ((playerFigure.equals(scissors)&&computerFigure.equals(rock))||
                (playerFigure.equals(scissors)&&computerFigure.equals(spock))){
            result = -1;
        }else if ((playerFigure.equals(lizard)&&computerFigure.equals(rock))||
                (playerFigure.equals(lizard)&&computerFigure.equals(scissors))){
            result =-1;
        }else if ((playerFigure.equals(spock)&&computerFigure.equals(paper))||
                (playerFigure.equals(spock)&&computerFigure.equals(lizard))){
            result = -1;
        }else{
            result =1;
        }

        return result;
    }
}
