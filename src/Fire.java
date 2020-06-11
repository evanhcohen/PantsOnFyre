import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Fire extends JComponent {
    //instance variables
    private int locX;
    private int locY;
    private int width;
    private int height;
    private Image img;

    public Fire(int x, int y)
    {
        locX = x;
        locY = y;
        width = 80;
        height = 30;
    }

    //accessors
    public int leftBoundX()
    {
        return locX;
    }
    public int rightBoundX()
    {
        return locX + width;
    }
    public int topY()
    {
        return locY;
    }
    public int bottomY()
    {
        return locY + height;
    }

    public void drawImg()
    {
        try {
            img = ImageIO.read(getClass().getResource("images/fire.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Image getImg()
    {
        return img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }



}
