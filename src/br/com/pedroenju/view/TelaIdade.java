package br.com.pedroenju.view;

import br.com.pedroenju.model.Idade;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaIdade extends JFrame implements ActionListener {

    private Idade idade;

    private JTextField txtAnoAtual, txtAnoNasc, txtIdade;
    private JButton btnCalcular;

    public TelaIdade() throws HeadlessException {
        super("Tela de calcular Idade");
        screenCreate();
        config();
    }

    private void screenCreate() {
        this.setLayout(new GridLayout(0, 2));

        this.txtAnoAtual = new JTextField();
        this.txtAnoNasc = new JTextField();
        this.txtIdade = new JTextField();
        this.txtIdade.setEditable(false);

        Dimension dField = new Dimension(200, 30);
        this.txtAnoAtual.setPreferredSize(dField);
        this.txtAnoNasc.setPreferredSize(dField);
        this.txtIdade.setPreferredSize(dField);

        this.btnCalcular = new JButton("Calcular");
        this.btnCalcular.addActionListener(this);

        this.add(new JLabel("Ano Atual.:"));
        this.add(this.txtAnoAtual);
        this.add(new JLabel("Ano Nascimento.:"));
        this.add(this.txtAnoNasc);
        this.add(new JLabel("Idade.:"));
        this.add(this.txtIdade);
        this.add(this.btnCalcular);

    }

    private void config() {
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void addAL(ActionListener al) {
        this.btnCalcular.addActionListener(al);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Idade getIdade() {
        this.idade.setAnoAtual(Integer.parseInt(this.txtAnoAtual.getText()));
        this.idade.setAnoNasc(Integer.parseInt(this.txtAnoNasc.getText()));
        return idade;
    }

    public void setIdade(Idade model) {
        if ((model.getAnoAtual() - model.getAnoNasc() > 0)) {
            System.out.println("ENTROU!!!");
            this.txtIdade.setText(Integer.toString(this.idade.getIdade()));
        }
        this.idade = model;
    }

}
