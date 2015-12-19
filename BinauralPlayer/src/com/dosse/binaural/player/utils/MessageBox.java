/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dosse.binaural.player.utils;

import com.dosse.binaural.player.Main;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 * simple message box, nothing interesting
 *
 * @author dosse
 */
public class MessageBox extends javax.swing.JDialog {
    //icons

    private ImageIcon info = new ImageIcon(getClass().getResource("/com/dosse/binaural/player/utils/i.png"));
    private ImageIcon error = new ImageIcon(getClass().getResource("/com/dosse/binaural/player/utils/x.png"));
    //constants
    public static final int ERROR_MESSAGE = 0, INFORMATION_MESSAGE = 1;

    /**
     * Creates new form MessageBox
     */
    public MessageBox(java.awt.Frame parent, boolean modal, int icon, String message, String title, Point location) {
        super(parent, modal);
        initComponents();
        this.message.setText(message);
        this.title.setText(title);
        setTitle(title);
        this.message.setIcon(icon == ERROR_MESSAGE ? error : icon == INFORMATION_MESSAGE ? info : null);
        setLocation(location.x - getWidth() / 2, location.y - getHeight() / 2);
        if (!Main.DISABLE_TRANSLUCENCY) {
            setOpacity(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        buttonBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        titleBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        mainPanel.setBackground(new java.awt.Color(245, 245, 245));

        buttonBar.setBackground(Main.brightButtonBar);

        jLabel2.setBackground(Main.brightButton_normal);
        jLabel2.setFont(Main.reg.deriveFont(14.0f));
        jLabel2.setForeground(Main.darkText);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/dosse/binaural/player/utils/MessageBox"); // NOI18N
        jLabel2.setText(bundle.getString("MessageBox.jLabel2.text")); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout buttonBarLayout = new javax.swing.GroupLayout(buttonBar);
        buttonBar.setLayout(buttonBarLayout);
        buttonBarLayout.setHorizontalGroup(
            buttonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonBarLayout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonBarLayout.setVerticalGroup(
            buttonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleBar.setBackground(Main.brightTitleBar_focused);
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });

        title.setFont(Main.bold.deriveFont(13.0f));
        title.setForeground(Main.darkText);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText(bundle.getString("MessageBox.title.text")); // NOI18N

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        message.setFont(Main.reg.deriveFont(14.0f));
        message.setForeground(Main.darkText);
        message.setText(bundle.getString("MessageBox.message.text")); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(message, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(mainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (Main.DISABLE_TRANSLUCENCY) {
            dispose();
            return;
        }
        setOpacity(1);
        for (float i = 1; i >= 0; i -= 0.1) {
            setOpacity(i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
        }
        setOpacity(0);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
    private int dragStartX, dragStartY;
    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        dragStartX = evt.getX();
        dragStartY = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        setLocation(evt.getXOnScreen() - dragStartX, evt.getYOnScreen() - dragStartY);
    }//GEN-LAST:event_titleBarMouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        jLabel2.setBackground(Main.brightButton_pressed);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        jLabel2.setBackground(Main.brightButton_normal);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (Main.DISABLE_TRANSLUCENCY) {
            return;
        }
        new Thread() {
            public void run() {
                for (float i = 0; i <= 1; i += 0.1) {
                    setOpacity(i);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                    }
                }
                setOpacity(1);
            }
        }.start();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        titleBar.setBackground(Main.brightTitleBar_focused);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        titleBar.setBackground(Main.brightTitleBar_unfocused);
    }//GEN-LAST:event_formWindowLostFocus
//2 "entry points"

    public static void error(String message, String title) {
        final MessageBox dialog = new MessageBox(new javax.swing.JFrame(), true, ERROR_MESSAGE, "<html>" + message + "</html>", "<html>" + title + "</html>", new Point(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog.setVisible(true);
            }
        });
    }

    public static void info(String message, String title) {
        final MessageBox dialog = new MessageBox(new javax.swing.JFrame(), true, INFORMATION_MESSAGE, "<html>" + message + "</html>", "<html>" + title + "</html>", new Point(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonBar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel message;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}