public class Paper implements Figure {
    private final String name="Papier";
    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paper)) return false;

        Paper paper = (Paper) o;

        return name.equals(paper.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
