/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_system;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AJEET
 */
public class College_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Index_Page().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Index_Page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
