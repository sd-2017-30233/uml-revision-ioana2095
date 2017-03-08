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
public class DecoratorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Shape circle = new Circle();
      Shape ColorCircle = new ShapeDecorator(new Circle(),"red");
      Shape ColorRectangle = new ShapeDecorator(new Rectangle(),"green");
      Shape ColorSquare = new ShapeDecorator(new Square(),"gray");
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      ColorCircle.draw();

      System.out.println("\nRectangle of green border");
      ColorRectangle.draw();
      
      System.out.println("\nSquare of gray border");
      ColorSquare.draw();
    }
    
}
