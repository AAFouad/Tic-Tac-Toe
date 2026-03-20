import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

    JPanel mainPanel;
    JPanel winPanel;

    JButton[][] button = new JButton[3][3];

    ImageIcon iconX = new ImageIcon("X.png");
    ImageIcon iconO = new ImageIcon("O.png");

    int turn = 0;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new GridBagLayout());

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(450,450));
        mainPanel.setLayout(new GridLayout(3,3));
        mainPanel.setBackground(Color.gray);

        winPanel = new JPanel();




        for ( int i = 0; i < 3; i++){
            for ( int j = 0; j < 3; j++) {

                final int row = i;
                final int col = j;

                button[i][j] = new JButton();
                mainPanel.add(button[i][j]);

                button[i][j].addActionListener(e -> {

                    JButton clicked = (JButton) e.getSource();
                    if (turn % 2 == 0) {
                        clicked.setIcon(iconX);
                        Game.cells[row][col] = 1;
                    } else {
                        clicked.setIcon(iconO);
                        Game.cells[row][col] = -1;
                    }

                    Game.WinChecker();

                    turn++;
                    clicked.setEnabled(false);

                });
            }
        }



        this.add(mainPanel);
        this.setVisible(true);
    }

}