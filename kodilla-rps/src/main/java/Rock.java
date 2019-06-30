public class Rock implements Figure {
    public final String name="Kamień";
    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rock)) return false;

        Rock rock = (Rock) o;

        return name.equals(rock.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
