/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessGui;

import javax.swing.JLabel;


/**
 *
 * @author Lenovo-
 */
public class LabelName extends JLabel {
    String name;
    int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    public LabelName(String name)
    { counter=-1;
        this.name=name;
    }

    public String getName1() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
