package br.com.pedroenju.controller;

import br.com.pedroenju.model.Idade;
import br.com.pedroenju.view.TelaIdade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerIdade implements ActionListener {

    private TelaIdade view;

    public ControllerIdade() {

        this.view = new TelaIdade();
        Idade model = new Idade();
        this.view.setIdade(model);
        this.view.addAL(this);
        this.view.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.view != null) {
            Idade model = this.view.getIdade();
            model.getIdade();
            this.view.setIdade(model);
        }
    }

}
