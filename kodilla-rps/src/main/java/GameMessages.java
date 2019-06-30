public class GameMessages {


    public void welcomeMessage(){

        System.out.println("Zagrajmy w \"Rock-paper-scissors-lizard-Spock\"!\n ");
    }
    public void askForPlayerName() {
        System.out.println("Proszę, podaj mi swje imię:");
    }
    public void askForNumberOfRounds(){
        System.out.println("Ile rund rozgrywamy?");
    }

    public void showIncorrectRoundsInput() {
        System.out.println("Podaj liczbę rund większą od zera ;)");
    }

    public void showMenu1() {
        System.out.println("Zasady gry:");
        System.out.println("Kamień zgniata jaszczurkę." +
                "\n Kamień zgniata nożyce" +
                "\n Nożyce tną papier" +
                "\n Papier przykrywa kamień" +
                "\n" + "Jaszczurka zatruwa Spocka" +
                "\n" + "Spock łamie nożyce" +
                "\n" + "Nożyce ranią jaszczurkę" +
                "\n" + "Jaszczurka zjada papier" +
                "\n" + "Papier udowadnia błąd Spocka" +
                "\n" + "Spock kruszy kamień" +
                "\n");
        System.out.println("'x' - wyj\u015bcie z gry; 'dowolny klawisz' - zacznij now\u0105 gr\u0119;");

    }
        public void showMenu2() {
        System.out.println("\n Menu:" +
                "\n" + "'1' - wybierz \"kamień\"" +
                "\n" + "'2' - wybierz \"papier\"" +
                "\n" + "'3' - wybierz \"nożyce\"" +
                "\n" + "'4' - wybierz \"jaszczurkę\"" +
                "\n" + "'5' - wybierz \"Spocka\""+
                "\n" +
                "\n" + "'x' - wyjście z gry; 'n' - zacznij nową grę;");
    }

    public void showQuitConfirmationMessage() {
        System.out.println("Czy wyść z gry?(T/N)");
    }

    public void showNewGameConfirmationMessage() {
        System.out.println("Rozpocząć nową grę? Aktualny stan gry nie zostanie zachowany. (T/N)");
    }

    public void showIncorrectMenuInputMessege(){
        System.out.println("'1', '2', '3', '4', '5', 'n' or 'x' ...wybierz ponownie: ");
    }

    public void showPlayerWinsMessage(String playerName,Integer playerScore, Integer computerScore){
        System.out.println(playerName +" wygrywa! "+ playerName+" wygrał(a): "+playerScore+ " rund, Komputer wygrał: "+computerScore+" rund ");
    }

    public void showComputerWinsMessage(String playerName,Integer playerScore, Integer computerScore){
        System.out.println("Komputer wygrywa. "+ playerName+"wygrał(a): "+playerScore+ "rund, Komputer wygrał: "+computerScore+" rund ");
        }

    public void showDrawMessage(String playerName,Integer playerScore, Integer computerScore){
        System.out.println("Remis! " + playerName+"wygrał(a): "+playerScore+ "rund, Komputer wygrał: "+computerScore+" rund ");
        }

    public void showEndGameMessage() {
        System.out.println("-------------------------------------------------" +
                "\nKoniec gry!" +
                "\n-------------------------------------------------");
        System.out.println("\n'n' - Nowa Gra; 'x' - Zakończ;");
    }

    public void showRoundResult(Figure userFigure, Figure computerFigure){
        System.out.println(String.format(" TY:     %s  ------ vs ------ %s    :Komputer ", userFigure.getName(), computerFigure.getName()));
    }

    public void incorrectEndOfGameInput(){
        System.out.println("'t' lub 'n' ...wybierz ponownie: ");
    }
}

