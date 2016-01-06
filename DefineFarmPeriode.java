package mrslayer02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DefineFarmPeriode extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> periodeChoice = new JComboBox<String>();
	private JTextField valeur = new JTextField();
	private JButton ok = new JButton("Valider");
	
	public static int choice = 0; // 0=nb de parties ; 1 = tps en heures
	public static double value = 0;

	public DefineFarmPeriode() {
		
		this.setTitle("Définir période de farm");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(500, 130);
		this.setLocationRelativeTo(null); 
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		
		periodeChoice.addItem("Nombre de parties");
		periodeChoice.addItem("Temps en heures");
		this.getContentPane().add(periodeChoice, BorderLayout.NORTH);
		
		JPanel container = new JPanel();
		container.setLayout(new GridLayout(1,2));
		
		JTextField label = new JTextField();
		label.setText("Valeur : ");
		label.setEditable(false);
		
		valeur.setText("0");
		valeur.setEditable(true);
		
		container.add(label);
		container.add(valeur);
		this.getContentPane().add(container, BorderLayout.CENTER);
		
		ok.addActionListener(this);
		this.getContentPane().add(ok, BorderLayout.SOUTH);
		
		
		
		this.setVisible(true);
		
	}
	
	private void saveData(){
		
		choice = periodeChoice.getSelectedIndex();
		try{
			value = Double.parseDouble(valeur.getText());
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "La valeur saisie n'est pas un nombre !", "Erreur !", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(choice == 0 && Math.round(value) != value){
			JOptionPane.showMessageDialog(null, "La valeur saisie n'est pas un entier !", "Erreur !", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(value < 0){
			JOptionPane.showMessageDialog(null, "La valeur saisie doit être positive !", "Erreur !", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		dispose();
		GUI.showProbabilitiesFree();
		GUI.calculGems();
		GUI.showProbabilitiesElite();
		GUI.calculGemsElite();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ok){
			saveData();
		}
		
	}

}
