
import javax.swing.JFrame;
import java.awt.*;

public class Conteiner extends JFrame{
    public Conteiner() {
        add(new Fase());
        setTitle("TryAgain");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(true);
        setVisible(true);

    }
        public static void main (String [] args){

        new Conteiner();


        }




    }

