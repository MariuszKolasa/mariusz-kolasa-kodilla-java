public class Spock implements Figure {
    private final String name="Spock";
    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spock)) return false;

        Spock spock = (Spock) o;

        return name.equals(spock.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
