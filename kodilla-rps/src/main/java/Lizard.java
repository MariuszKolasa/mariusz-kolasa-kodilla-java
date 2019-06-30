public class Lizard implements Figure {
    private final String name ="Jaszczurka";

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lizard)) return false;

        Lizard lizard = (Lizard) o;

        return name.equals(lizard.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
