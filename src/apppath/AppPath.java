/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppath;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DarkShrub
 */
public class AppPath extends JFrame implements KeyListener{

    JLabel path=new JLabel("Path: ");
    JLabel keys=new JLabel("Keys: ");
    public int ports()
    {
    Socket soket=new Socket();
    
        
            return soket.getPort();
                    
   
    }
    public AppPath()throws IOException
    {
        
        String apath = new File(".").getCanonicalPath();
        path.setText(apath+"  "+ports());
    setSize(300, 300);
        path.setSize(100, 20);
        keys.setSize(200, 30);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        add(path);
        add(keys);
        addKeyListener(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        
       new AppPath();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
            keys.setText(keys.getText()+KeyEvent.getKeyText(e.getKeyCode()));
            if (e.getKeyCode()==KeyEvent.VK_F1) {
                JOptionPane.showMessageDialog(null, "f1 algılandı");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
            //keys.setText(keys.getText()+KeyEvent.getKeyText(e.getKeyCode()));
    }
    
}
