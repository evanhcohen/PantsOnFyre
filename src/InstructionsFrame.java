import javax.swing.*;

public class InstructionsFrame extends MainFrame
{
    private static JFrame frame;
    private static InstructionsPanel instructions;

    public InstructionsFrame()
    {
        // creates the frame
        frame = new JFrame("Pants on Fyre");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creates panel
        instructions = new InstructionsPanel();
        instructions.setPreferredSize(d);

        // add panel to the frame
        frame.getContentPane().add(instructions);
    }

    public static void changePanel(int x)
    {
        if (x == 2)
        {
            display(frame);
        }
        else
        {
            frame.setVisible(false);
        }
    }
}
