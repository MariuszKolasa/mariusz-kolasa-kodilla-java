package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World{
    private final Set<Continent> world;

    {
        world = new HashSet<>();

    }

public void addContinent(Continent continent){
        world.add(continent);
}


    public Set<Continent> getContinents() {
        return world;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal worldPopulation;
        worldPopulation =world.stream()
               .flatMap(world->world.getCountrys().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopulation;
    }



}
