import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

        // step one make 1 frame
        JFrame frame = new JFrame("hi");
        frame.setSize(800,800);

        // step 2 make panel
        JPanel panel = new JPanel(new GridLayout(4,4,4,4));
        panel.setBackground(Color.lightGray);
        // 3 create component
        // adding an image
        // image must be in the same folder as the project or you
        // need to spedify the class path
        ImageIcon icon = new ImageIcon("Images/Cards/happy_emoji_face.jpeg");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);


        JLabel label = new JLabel("select a color from the color picker then press the button! \t Add a name in the text field");
        JButton button = new JButton("Push me");
        JTextField textField = new JTextField(5);


        JColorChooser color = new JColorChooser(Color.lightGray);

        // 4 add components to panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);
        // 5 add panel to the frame
        frame.add(panel);
        //6 Set frame visible
        frame.setVisible(true);


    }
}