package simpleframe;

import javax.swing.*;
import java.awt.*;

/**
 * Created by deepakkumar on 2018-04-10.
 * Adopted from Book: Core Java vol 1
 */
public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            SimpleFrame f1 = new SimpleFrame();
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f1.setVisible(true);
        });
    }
}

class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
