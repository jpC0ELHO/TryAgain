import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Fase extends JPanel implements ActionListener {
    private Image fundo;
    private Player player;
    private Timer timer;


    public Fase(){

        setDoubleBuffered(true);
        setFocusable(true);
        
        ImageIcon referencia=new ImageIcon("src\\imgs\\blackground.png");
        fundo= referencia.getImage();

        player=new Player();
        player.Load();


        addKeyListener(new TecladoAdapter());

        timer=new Timer(5,this);
        timer.start();
    }
    public void paint(Graphics g){
        Graphics2D graficos=(Graphics2D) g;
        graficos.drawImage(fundo,0,0,null);
        graficos.drawImage(player.getImage(),player.getX(),player.getY(),this);
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.Update();
        repaint();
    }

    private class TecladoAdapter extends KeyAdapter{


        @Override
        public void keyPressed(KeyEvent pre){
            player.keyProssed(pre);
        }

        @Override
        public void keyReleased(KeyEvent pre){
            player.keyRelease(pre);
        }
    }
}
