package com.saki.javase9.chapter17.text;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.io.IOException;
import java.net.URL;

public class JBrowser extends JEditorPane implements HyperlinkListener {

    public JBrowser(String url) {
        setEditable(false);
        addHyperlinkListener(this);

        try {
            setPage(new URL(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hyperlinkUpdate(HyperlinkEvent event) {
        HyperlinkEvent.EventType type = event.getEventType();

        if (type == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                setPage(event.getURL());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "cannot follow link: "
                        + event.getURL().toExternalForm(), "Loding error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My first Browser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.add(new JScrollPane(new JBrowser("https://example.com")));
        frame.setVisible(true);
    }
}
