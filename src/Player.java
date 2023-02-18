import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    private int x,y;
    private int dx,dy;
    private Image image;
    private int altura, largura;
    public Player(){
        this.x=100;
        this.y=100;
    }
    public void Load(){
        //Inserir imagem do player
        ImageIcon referencia=new ImageIcon("src\\imgs\\nave.png");
        image=referencia.getImage();
        altura=image.getHeight(null);
        largura=image.getWidth(null);
    }
    public void Update(){
        x+=dx;
        y+=dy;
    }

    public void keyProssed(KeyEvent tecla){
        int cod=tecla.getKeyCode();
        if(cod==KeyEvent.VK_UP){
            dy=-3;
        }if(cod==KeyEvent.VK_DOWN){
            dy=3;
        }if(cod==KeyEvent.VK_LEFT){
            dx=-3;
        }if(cod==KeyEvent.VK_RIGHT){
            dx=3;
        }
    }public void keyRelease(KeyEvent tecla){
        int cod=tecla.getKeyCode();
        if(cod==KeyEvent.VK_UP){
            dy=0;
        }if(cod==KeyEvent.VK_DOWN){
            dy=0;
        }if(cod==KeyEvent.VK_LEFT){
            dx=0;
        }if(cod==KeyEvent.VK_RIGHT){
            dx=0;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
}
