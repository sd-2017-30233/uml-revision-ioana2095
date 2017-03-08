/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatterndemo;

/**
 *
 * @author Ioana
 */
public class ShapeDecorator implements Shape {
    private Shape decoratedShape;
    private String color;

   public ShapeDecorator(Shape decoratedShape,String color){
      this.decoratedShape = decoratedShape;
      this.color=color;
   }
    @Override
   public void draw(){
      decoratedShape.draw();
      setBorder(decoratedShape,color);
      
   }
   private void setBorder(Shape decoratedShape,String color){
      System.out.println("Border Color: "+ color);
   }
    
}
