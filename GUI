package mrslayer02;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -4136724188683686990L;
	
	private JMenuBar menubar = new JMenuBar();
	private JButton data = new JButton("Entrer données (Parties Free)");
	private JButton dataElite = new JButton("Entrer données (Parties Élite)");
	private JButton defineFarm = new JButton("Définir Période de Farm");
	private JButton help = new JButton("Aide");
	
	
	private static JTextField[] tableauFree;
	private static JTextField[] tableauElite;

	public GUI() {
		
		this.setTitle("Farmez efficacement sur le FantaBobWorld !");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setIconImage(new ImageIcon("./images/prgmIcon.JPG").getImage());
		
		data.addActionListener(this);
		dataElite.addActionListener(this);
		defineFarm.addActionListener(this);
		help.addActionListener(this);
		
		JTextField credits = new JTextField();
		credits.setText("                                                                                           Gems Calculator, par MrSlayer02, © 2016, MrSlayer02");
		credits.setFont(new Font("Arial", Font.BOLD, 14));
		credits.setEditable(false);
		credits.setBorder(null);
		credits.setBackground(null);
		
		menubar.add(data);
		menubar.add(dataElite);
		menubar.add(defineFarm);
		menubar.add(help);
		menubar.add(credits);
		this.getContentPane().add(menubar, BorderLayout.NORTH);
		
		JPanel tableau = new JPanel();
		tableau.setLayout(new GridLayout(2,1));
		
		JPanel partiesFree = new JPanel();
		partiesFree.setLayout(new GridLayout(10, 4));
		tableauFree = new JTextField[40];
		for(int i=0;i<tableauFree.length;i++){
			tableauFree[i] = new JTextField();
			tableauFree[i].setEditable(false);
		}
		
		tableauFree[0].setText("Nom du jeu");
		tableauFree[0].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauFree[1].setText("Probabilité de victoire");
		tableauFree[1].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauFree[2].setText("Gems en x parties");
		tableauFree[2].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauFree[3].setText("Gems en x heures de farm");
		tableauFree[3].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauFree[4].setText("SkyWars");
		tableauFree[4].setFont(new Font("Arial", 0, 14));
		
		tableauFree[8].setText("Bropocalypse");
		tableauFree[8].setFont(new Font("Arial", 0, 14));
		
		tableauFree[12].setText("Dé à coudre");
		tableauFree[12].setFont(new Font("Arial", 0, 14));
		
		tableauFree[16].setText("SplatCube");
		tableauFree[16].setFont(new Font("Arial", 0, 14));
		
		tableauFree[20].setText("UHC Fun");
		tableauFree[20].setFont(new Font("Arial", 0, 14));
		
		tableauFree[24].setText("Fight Cube");
		tableauFree[24].setFont(new Font("Arial", 0, 14));
		
		tableauFree[28].setText("Building Games");
		tableauFree[28].setFont(new Font("Arial", 0, 14));
		
		tableauFree[32].setText("Survival Games");
		tableauFree[32].setFont(new Font("Arial", 0, 14));
		
		tableauFree[36].setText("Méga-Rush");
		tableauFree[36].setFont(new Font("Arial", 0, 14));
		
		for(int i=0; i<tableauFree.length; i++){
			partiesFree.add(tableauFree[i]);
		}
		
		
		
		
		
		
		JTextField partiesFreeTitle = new JTextField();
		partiesFreeTitle.setText("                                                                        Parties FREE");
		partiesFreeTitle.setEditable(false);
		partiesFreeTitle.setFont(new Font("Arial", Font.BOLD, 30));
		

		JPanel gestionCentre = new JPanel();
		gestionCentre.setLayout(new BorderLayout());
		gestionCentre.add(partiesFreeTitle, BorderLayout.NORTH);
		gestionCentre.add(partiesFree);
		
		tableau.add(gestionCentre);
		
		
		
		JPanel gestionElite = new JPanel();
		gestionElite.setLayout(new BorderLayout());
		
		JTextField partiesEliteTitle = new JTextField();
		partiesEliteTitle.setText("                                                                        Parties ELITE");
		partiesEliteTitle.setEditable(false);
		partiesEliteTitle.setFont(new Font("Arial", Font.BOLD, 30));
		
		gestionElite.add(partiesEliteTitle, BorderLayout.NORTH);
		
		JPanel partiesElite = new JPanel();
		partiesElite.setLayout(new GridLayout(9, 4));
		
		tableauElite = new JTextField[36];
		for(int i=0; i<tableauElite.length; i++){
			tableauElite[i] = new JTextField();
			tableauElite[i].setEditable(false);
		}
		
		tableauElite[0].setText("Nom du jeu");
		tableauElite[0].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauElite[1].setText("Moyenne gems / partie");
		tableauElite[1].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauElite[2].setText("Gems en x parties");
		tableauElite[2].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauElite[3].setText("Gems en x heures de farm");
		tableauElite[3].setFont(new Font("Arial", Font.BOLD, 14));
		
		tableauElite[4].setText("SkyWars");
		tableauElite[4].setFont(new Font("Arial", 0, 14));
		
		tableauElite[8].setText("Bropocalypse");
		tableauElite[8].setFont(new Font("Arial", 0, 14));
		
		tableauElite[12].setText("Dé à coudre");
		tableauElite[12].setFont(new Font("Arial", 0, 14));
		
		tableauElite[16].setText("SplatCube");
		tableauElite[16].setFont(new Font("Arial", 0, 14));
		
		tableauElite[20].setText("UHC Fun");
		tableauElite[20].setFont(new Font("Arial", 0, 14));
		
		tableauElite[24].setText("Fight Cube");
		tableauElite[24].setFont(new Font("Arial", 0, 14));
		
		tableauElite[28].setText("Building Games");
		tableauElite[28].setFont(new Font("Arial", 0, 14));
		
		tableauElite[32].setText("Survival Games");
		tableauElite[32].setFont(new Font("Arial", 0, 14));
		
		
		
		for(int i=0;i<tableauElite.length;i++){
			partiesElite.add(tableauElite[i]);
		}
		gestionElite.add(partiesElite);
		tableau.add(gestionElite);
		this.getContentPane().add(tableau, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
	
	public static void showProbabilitiesFree(){
		
		tableauFree[5].setText(Double.toString(DataEntry.skyWarsProbability));
		tableauFree[9].setText(Double.toString(DataEntry.bropocalypseProbability));
		tableauFree[13].setText(Double.toString(DataEntry.dacProbability));
		tableauFree[17].setText(Double.toString(DataEntry.splatCubeProbability));
		tableauFree[21].setText(Double.toString(DataEntry.uhcFunProbability));
		tableauFree[25].setText(Double.toString(DataEntry.fightCubeProbability));
		tableauFree[29].setText(Double.toString(DataEntry.buildGameProbability));
		tableauFree[33].setText(Double.toString(DataEntry.survivalGamesProbability));

		
	}
	
	public static void showProbabilitiesElite(){
		
		tableauElite[5].setText(Double.toString(DataEntryElite.skyWarsGems));
		tableauElite[9].setText(Double.toString(DataEntryElite.bropocalypseGems));
		tableauElite[13].setText(Double.toString(DataEntryElite.dacGems));
		tableauElite[17].setText(Double.toString(DataEntryElite.splatCubeGems));
		tableauElite[21].setText(Double.toString(DataEntryElite.uhcFunGems));
		tableauElite[25].setText(Double.toString(DataEntryElite.fightCubeGems));
		tableauElite[29].setText(Double.toString(DataEntryElite.buildGameGems));
		tableauElite[33].setText(Double.toString(DataEntryElite.survivalGamesGems));
		
	}
	
	public static void calculGems(){ // calcul gems free
		
		if(DefineFarmPeriode.choice == 0){ //nombre de parties
			
			tableauFree[2].setText("Gems en " + (int)DefineFarmPeriode.value + " parties");
			
			tableauFree[6].setText(Integer.toString((int)Math.floor(Main.skyWarsFree(((int)DefineFarmPeriode.value), DataEntry.skyWarsProbability))));
			tableauFree[10].setText(Integer.toString((int)Math.floor(Main.bropocalypseFree(((int)DefineFarmPeriode.value), DataEntry.bropocalypseProbability))));
			tableauFree[14].setText(Integer.toString((int)Math.floor(Main.deACoudreFree(((int)DefineFarmPeriode.value), DataEntry.dacProbability))));
			tableauFree[18].setText(Integer.toString((int)Math.floor(Main.splatCubeFree(((int)DefineFarmPeriode.value), DataEntry.splatCubeProbability))));
			tableauFree[22].setText(Integer.toString((int)Math.floor(Main.uhcFunFree(((int)DefineFarmPeriode.value), DataEntry.uhcFunProbability, false))));
			tableauFree[26].setText(Integer.toString((int)Math.floor(Main.fightCubeFree(((int)DefineFarmPeriode.value), DataEntry.fightCubeProbability))));
			tableauFree[30].setText(Integer.toString((int)Math.floor(Main.buildingGameFree(((int)DefineFarmPeriode.value), DataEntry.buildGameProbability))));
			tableauFree[34].setText(Integer.toString((int)Math.floor(Main.survivalGameFree(((int)DefineFarmPeriode.value), DataEntry.survivalGamesProbability))));
			tableauFree[38].setText(Integer.toString((int)Math.floor(Main.rushFree(((int)DefineFarmPeriode.value), DataEntry.rushMoyenneGems))));
			
		}
		else if(DefineFarmPeriode.choice == 1){
			
			if(DataEntry.skyWarsGameTime == 0 || DataEntry.bropocalypseGameTime == 0 || DataEntry.dacGameTime == 0 || DataEntry.splatCubeGameTime == 0 || DataEntry.uhcFunGameTime == 0 || DataEntry.fightCubeGameTime == 0 || DataEntry.buildGameGameTime == 0 || DataEntry.survivalGamesGameTime == 0 || DataEntry.rushGameTime == 0){
				JOptionPane.showMessageDialog(null, "Le temps d'une partie ne peut pas être nul", "Erreur !", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			tableauFree[3].setText("Gems en " + (int)DefineFarmPeriode.value + " heures de farm");
			double farmMinutes = (DefineFarmPeriode.value * 60);
			
			tableauFree[7].setText(Integer.toString((int)Math.floor(Main.skyWarsFree(DataEntry.skyWarsGameTime, DataEntry.skyWarsProbability, farmMinutes))));
			tableauFree[11].setText(Integer.toString((int)Math.floor(Main.bropocalypseFree(DataEntry.bropocalypseGameTime, DataEntry.bropocalypseProbability, farmMinutes))));
			tableauFree[15].setText(Integer.toString((int)Math.floor(Main.deACoudreFree(DataEntry.dacGameTime, DataEntry.dacProbability, farmMinutes))));
			tableauFree[19].setText(Integer.toString((int)Math.floor(Main.splatCubeFree(DataEntry.splatCubeGameTime, DataEntry.splatCubeProbability, farmMinutes))));
			tableauFree[23].setText(Integer.toString((int)Math.floor(Main.uhcFunFree(DataEntry.uhcFunGameTime, DataEntry.uhcFunProbability, farmMinutes, false))));
			tableauFree[27].setText(Integer.toString((int)Math.floor(Main.fightCubeFree(DataEntry.fightCubeGameTime, DataEntry.fightCubeProbability, farmMinutes))));
			tableauFree[31].setText(Integer.toString((int)Math.floor(Main.buildingGameFree(DataEntry.buildGameGameTime, DataEntry.buildGameProbability,farmMinutes))));
			tableauFree[35].setText(Integer.toString((int)Math.floor(Main.survivalGameFree(DataEntry.survivalGamesGameTime, DataEntry.survivalGamesProbability, farmMinutes))));
			tableauFree[39].setText(Integer.toString((int)Math.floor(Main.rushFree(DataEntry.rushGameTime, DataEntry.rushMoyenneGems, farmMinutes))));
			
		}
		
	}
	
	public static void calculGemsElite(){
		
		if(DefineFarmPeriode.choice == 0){ //nombre de parties
			
			tableauElite[2].setText("Gems en " + (int)DefineFarmPeriode.value + " parties");
			
			tableauElite[6].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.skyWarsGems))));
			tableauElite[10].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.bropocalypseGems))));
			tableauElite[14].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.dacGems))));
			tableauElite[18].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.splatCubeGems))));
			tableauElite[22].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.uhcFunGems))));
			tableauElite[26].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.fightCubeGems))));
			tableauElite[30].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.buildGameGems))));
			tableauElite[34].setText(Integer.toString((int)Math.floor(Main.gainsElite(((int)DefineFarmPeriode.value), DataEntryElite.survivalGamesGems))));
			
		}
		else if(DefineFarmPeriode.choice == 1){
			
			if(DataEntryElite.skyWarsGameTime == 0 || DataEntryElite.bropocalypseGameTime == 0 || DataEntryElite.dacGameTime == 0 || DataEntryElite.splatCubeGameTime == 0 || DataEntryElite.uhcFunGameTime == 0 || DataEntryElite.fightCubeGameTime == 0 || DataEntryElite.buildGameGameTime == 0 || DataEntryElite.survivalGamesGameTime == 0){
				JOptionPane.showMessageDialog(null, "Le temps d'une partie ne peut pas être nul", "Erreur !", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			tableauElite[3].setText("Gems en " + (int)DefineFarmPeriode.value + " heures de farm");
			double farmMinutes = (DefineFarmPeriode.value * 60);
			
			tableauElite[7].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.skyWarsGameTime, DataEntryElite.skyWarsGems, farmMinutes))));
			tableauElite[11].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.bropocalypseGameTime, DataEntryElite.bropocalypseGems, farmMinutes))));
			tableauElite[15].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.dacGameTime, DataEntryElite.dacGems, farmMinutes))));
			tableauElite[19].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.splatCubeGameTime, DataEntryElite.splatCubeGems, farmMinutes))));
			tableauElite[23].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.uhcFunGameTime, DataEntryElite.uhcFunGems, farmMinutes))));
			tableauElite[27].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.fightCubeGameTime, DataEntryElite.fightCubeGems, farmMinutes))));
			tableauElite[31].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.buildGameGameTime, DataEntryElite.buildGameGems,farmMinutes))));
			tableauElite[35].setText(Integer.toString((int)Math.floor(Main.gainsElite(DataEntryElite.survivalGamesGameTime, DataEntryElite.survivalGamesGems, farmMinutes))));
	
			
		}
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == data){
			new DataEntry();
			showProbabilitiesFree();
		}
		else{
			if(arg0.getSource() == defineFarm){
				new DefineFarmPeriode();
			}
			else{
				if(arg0.getSource() == dataElite){
					new DataEntryElite();
				}
			}
		}
		
	}

}


