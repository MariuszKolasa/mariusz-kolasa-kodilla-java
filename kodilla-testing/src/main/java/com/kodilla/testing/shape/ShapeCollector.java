package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
   private List <Shape> shapes= new ArrayList<>();


    public void addFigure(Shape shape){
        shapes.add(shape);

    }
    public int getShapesQuantity(){

       return  shapes.size();

    }

   public boolean removeFigure(Shape shape) {
       if (shapes.contains(shape)) {
           shapes.remove(shape);
           return true;
       } else {
           return false;
       }
   }
    public Shape getFigure(int i){
        Shape s=null;
        if(i>=0&&i<shapes.size()) {

            s = shapes.get(i);
        }
            return s;
    }


    public List<Shape> showFigures(){
        return shapes;
    }

}
