import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HumanInterface implements ActionListener {
    Human human;

    public HumanInterface(Human human){
        duckGame();
        this.human = human;
    }

    private void duckGame(){
        JFrame frame = new JFrame("DuckGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton feedButton = new JButton("feed");
        feedButton.setPreferredSize(new Dimension(300,150));
        frame.setPreferredSize(new Dimension(400,300));

        JPanel contentPane = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contentPane.add(feedButton);
        frame.setContentPane(contentPane);

        feedButton.addActionListener(this);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        human.throwBread();
    }
}
