package com.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class Actions implements ActionListener, MouseListener {

    @Override
    public abstract void actionPerformed(ActionEvent ae);

    @Override
    public abstract void mouseClicked(MouseEvent me);

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

}
