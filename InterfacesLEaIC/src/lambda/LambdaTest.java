package lambda;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

/**
 * Created by deepakkumar on 2017-08-27.
 */
public class LambdaTest {
    public static void main(String[] args){
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted by length:");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
        {System.out.println("The time is "+ new Date());
        Toolkit.getDefaultToolkit().beep();});
        t.start();

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
