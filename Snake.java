package snake.game;

import javax.swing.*;

public class Snake extends JFrame{

    Snake(){
        super("Snake Game");//calls the parent class constructor for title
        add(new Board()); 
        pack();
        
        setLocationRelativeTo(null);
//        setTitle("Snake Game");
        setResizable(false);
      
    }
    
    public static void main(String[] args){
        new Snake().setDefaultCloseOperation(Snake.EXIT_ON_CLOSE);
        new Snake().setVisible(true);
    }
}
