package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetCountries() {
        //Given
        World world = new World();

        Continent continent1 = new Continent("continent1");
        Continent continent2 = new Continent("continent2");
        Country country1 = new Country("country1", new BigDecimal("12345678900"));
        Country country2 = new Country("country2", new BigDecimal("12345678900"));
        Country country3 = new Country("country3", new BigDecimal("12345678900"));
        Country country4 = new Country("country1", new BigDecimal("12345678900"));
        Country country5 = new Country("country5", new BigDecimal("12345678900"));
        Country country6 = new Country("country6", new BigDecimal("12345678900"));


        world.addContinent(continent1);
        world.addContinent(continent2);

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);
        continent1.addCountry(country5);
        continent2.addCountry(country6);




        //When
        long countries = world.getContinents().stream().flatMap(continents -> continents.getCountrys().stream()).count();
        //Then

        Assert.assertEquals(4,continent1.getCountrys().size());
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent continent1=new Continent("continent1");
        Continent continent2=new Continent("continent2");
        Country country1=new Country("country1",new BigDecimal("12345678900"));
        Country country2=new Country("country2",new BigDecimal("12345678900"));
        Country country3=new Country("country3",new BigDecimal("12345678900"));
        Country country4=new Country("country1",new BigDecimal("12345678900"));
        Country country5=new Country("country5",new BigDecimal("12345678900"));
        Country country6=new Country("country6",new BigDecimal("12345678900"));


        world.addContinent(continent1);
        world.addContinent(continent2);

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);
        continent1.addCountry(country5);
        continent2.addCountry(country6);





        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople;
        expectedPeople = new BigDecimal("61728394500");
        Assert.assertEquals(expectedPeople,totalPeople);
    }
}

