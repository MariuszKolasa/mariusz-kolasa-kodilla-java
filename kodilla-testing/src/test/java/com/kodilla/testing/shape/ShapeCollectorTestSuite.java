package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

import java.util.LinkedList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape circle1 = new Circle("circle1", 2);
        ShapeCollector shapes = new ShapeCollector();


        //When
        shapes.addFigure(circle1);

        //Then
        Assert.assertEquals(1, shapes.getShapesQuantity());
    }

    @Test
    public void testRemoveShapeNotExisting() {
        //Given
        Shape theShape = new Circle("circle1", 2);
        ShapeCollector shapes = new ShapeCollector();
        //When
        boolean result = shapes.removeFigure(theShape);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape theShape = new Circle("circle1", 2);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(theShape);

        //When
        boolean result = shapes.removeFigure(theShape);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapes.getShapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape theShape = new Circle("circle1", 2);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(theShape);

        //When
        Shape retrievedShape = shapes.getFigure(0);

        //Then
        Assert.assertEquals(theShape, retrievedShape);
    }
    @Test
    public void testGetFigureForIndexBiggerOrEvenListSize() {
        //Given
        Shape theShape = new Circle("circle1", 2);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(theShape);

        //When
        Shape retrievedShape = shapes.getFigure(1);

        //Then
        Assert.assertNull( retrievedShape);
    }
    @Test
    public void testGetFigureForNegativeIndex() {
        //Given
        Shape theShape = new Circle("circle1", 2);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(theShape);

        //When
        Shape retrievedShape = shapes.getFigure(-1);

        //Then
        Assert.assertNull( retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape theShape = new Circle("circle1", 2);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(theShape);

        //When
        List expectedList = new LinkedList<>();
        expectedList.add(theShape);

        //Then
        Assert.assertEquals(expectedList, shapes.showFigures());
    }
}
