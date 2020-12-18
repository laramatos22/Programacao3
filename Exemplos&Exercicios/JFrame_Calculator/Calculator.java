package JFrame_Calculator;

//Program creates a GUI that resembles a calculator.
import javax.swing.JFrame;

public class Calculator
{
public static void main( String[] args )
{
   CalculatorFrame calculatorFrame = new CalculatorFrame(); 
   calculatorFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   calculatorFrame.setSize( 300, 300 ); // set frame size
   calculatorFrame.setVisible( true ); // display frame
} // end main
}  // end class Calculator
