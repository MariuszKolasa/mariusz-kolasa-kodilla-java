package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test usuwacza liczb nieparzystych: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test usuwacza liczb nieparzystych: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //When
        ArrayList<Integer> numbers = null;
        ArrayList<Integer> emptyList=new ArrayList<>();
        //Then
        System.out.println("testuję dla  pustego zbioru " );
        Assert.assertEquals(emptyList,oddNumbersExterminator.exterminate(numbers));
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers=new ArrayList<>();
        for(Integer i=0; i<10; i++){
            numbers.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList=new ArrayList<>();
        resultList.add(0);
        resultList.add(2);
        resultList.add(4);
        resultList.add(6);
        resultList.add(8);
        //Then
        System.out.println("testuję dla nie pustego zbioru " );
        Assert.assertEquals(resultList, oddNumbersExterminator.exterminate(numbers));

}}
