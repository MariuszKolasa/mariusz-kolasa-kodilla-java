public class Scissors  implements Figure {
    private final String name="Nożyce";
    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scissors)) return false;

        Scissors scissors = (Scissors) o;

        return name.equals(scissors.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
