import javax.swing.JOptionPane;

import javafx.scene.Parent;

public class Demo3 {
   public static void main(String[] args) {
        JOptionPane.showMessageDialog(ParentComponent, null, message: "Hello world",
        title: "MyDialog",JOptionPane.ERROR_MESSAGE)
        JOptionPane.showMessageDialog(ParentComponent, null, message: "Hello world",
        title: "MyDialog",JOptionPane.INFORMATION_MESSAGE)
        JOptionPane.showMessageDialog(ParentComponent, null, message: "Hello world",
        title: "MyDialog",JOptionPane.PLAIN_MESSAGE)
        JOptionPane.showMessageDialog(ParentComponent, null, message: "Hello world",
        title: "MyDialog",JOptionPane.QUESTION_MESSAGE)
        JOptionPane.showMessageDialog(ParentComponent, null, message: "Hello world",
        title: "MyDialog",JOptionPane.WARNING_MESSAGE)
    }
}