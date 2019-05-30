package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countries=new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }
    public Set<Country> getCountrys() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        if (!continentName.equals(continent.continentName)) return false;
        return countries.equals(continent.countries);

    }

    @Override
    public int hashCode() {
        int result = continentName.hashCode();
        result = 31 * result + countries.hashCode();
        return result;
    }

    public void addCountry(Country country){
        countries.add(country);

    }
}
