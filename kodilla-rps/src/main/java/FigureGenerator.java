import java.util.Random;

public class FigureGenerator {
    public static Figure generateFigure() {
        Random random = new Random();
        int r = random.nextInt(4);
        switch (r) {
            case (0):
                return new Rock();
            case (1):
                return new Paper();
            case (2):
                return new Scissors();
            case (3):
                return new Lizard();
        }
        return new Spock();
    }
}