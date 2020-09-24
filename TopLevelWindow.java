import java.awt.*;
import javax.swing.*;
// Create a simple GUI window
public class TopLevelWindow {
   private static void createWindow() {
      //Create and set up the window.
      JFrame frame = new JFrame("Simple GUI");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel textLabel = new JLabel("haha get rekt i lied",SwingConstants.CENTER);
      textLabel.setPreferredSize(new Dimension(300, 100));
      frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      //Display the window.
      frame.setLocationRelativeTo(null);
      frame.pack();
      frame.setVisible(true);
   }
   public static void main(String[] args) {
      createWindow();
   }
} 