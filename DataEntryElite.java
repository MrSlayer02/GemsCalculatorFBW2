package mrslayer02;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DataEntryElite extends JFrame implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;

	private JButton ok = new JButton("Valider");
	
	private JTextField skyWars2 = new JTextField();
	private JTextField skyWars3 = new JTextField();
	private JTextField bropo2 = new JTextField();
	private JTextField bropo3 = new JTextField();
	private JTextField dac2 = new JTextField();
	private JTextField dac3 = new JTextField();
	private JTextField splat2 = new JTextField();
	private JTextField splat3 = new JTextField();
	private JTextField uhc2 = new JTextField();
	private JTextField uhc3 = new JTextField();
	private JTextField fight2 = new JTextField();
	private JTextField fight3 = new JTextField();
	private JTextField build2 = new JTextField();
	private JTextField build3 = new JTextField();
	private JTextField survival2 = new JTextField();
	private JTextField survival3 = new JTextField();
	

	
	public static double skyWarsGems = 0;
	public static double bropocalypseGems = 0;
	public static double dacGems = 0;
	public static double splatCubeGems = 0;
	public static double uhcFunGems = 0;
	public static double fightCubeGems = 0;
	public static double buildGameGems = 0;
	public static double survivalGamesGems = 0;
	
	public static double skyWarsGameTime = 1;
	public static double bropocalypseGameTime = 1;
	public static double dacGameTime = 1;
	public static double splatCubeGameTime = 1;
	public static double uhcFunGameTime = 1;
	public static double fightCubeGameTime = 1;
	public static double buildGameGameTime = 1;
	public static double survivalGamesGameTime = 1;

	public DataEntryElite() {
		
		this.setTitle("Entrer données (Parties Elite)");
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setIconImage(new ImageIcon("./images/prgmIcon.JPG").getImage());
		
		GridLayout manager = new GridLayout();
		manager.setColumns(1);
		manager.setRows(25);
		this.setLayout(manager);
		
		JTextField skyWarsTitle = new JTextField();
		skyWarsTitle.setText("                SkyWars");
		skyWarsTitle.setEditable(false);
		skyWarsTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(skyWarsTitle);
		
		JPanel skyWars = new JPanel();
		skyWars.setLayout(new GridLayout(1, 2));
		
		JTextField skyWars1 = new JTextField();
		skyWars1.setText("Moyenne de gains en gems");
		skyWars1.setFont(new Font("Arial", 0, 12));
		skyWars1.setEditable(false);
		skyWars.add(skyWars1);
		
		skyWars2.setText("0");
		skyWars2.setFont(new Font("Arial", Font.ITALIC, 14));
		skyWars2.setEditable(true);
		skyWars.add(skyWars2);
		
		this.getContentPane().add(skyWars);
		
		JPanel skyWarsB = new JPanel();
		skyWarsB.setLayout(new GridLayout(1, 2));
		
		JTextField skyWarsB1 = new JTextField();
		skyWarsB1.setText("Temps moyen d'une partie (en minutes)");
		skyWarsB1.setFont(new Font("Arial", 0, 12));
		skyWarsB1.setEditable(false);
		skyWarsB.add(skyWarsB1);
		
		skyWars3.setText("1");
		skyWars3.setFont(new Font("Arial", Font.ITALIC, 14));
		skyWars3.setEditable(true);
		skyWarsB.add(skyWars3);
		
		this.getContentPane().add(skyWarsB);
		
		JTextField bropoTitle = new JTextField();
		bropoTitle.setText("                Bropocalypse");
		bropoTitle.setEditable(false);
		bropoTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(bropoTitle);
		
		JPanel bropocalypse = new JPanel();
		bropocalypse.setLayout(new GridLayout(1, 2));
		
		JTextField bropo1 = new JTextField();
		bropo1.setText("Moyenne de gains en gems");
		bropo1.setFont(new Font("Arial", 0, 12));
		bropo1.setEditable(false);
		bropocalypse.add(bropo1);
		
		bropo2.setText("0");
		bropo2.setFont(new Font("Arial", Font.ITALIC, 14));
		bropo2.setEditable(true);
		bropocalypse.add(bropo2);
		
		this.getContentPane().add(bropocalypse);
		
		JPanel bropocalypseB = new JPanel();
		bropocalypseB.setLayout(new GridLayout(1, 2));
		
		JTextField bropoB1 = new JTextField();
		bropoB1.setText("Temps moyen d'une partie (en minutes)");
		bropoB1.setFont(new Font("Arial", 0, 12));
		bropoB1.setEditable(false);
		bropocalypseB.add(bropoB1);
		
		bropo3.setText("1");
		bropo3.setFont(new Font("Arial", Font.ITALIC, 14));
		bropo3.setEditable(true);
		bropocalypseB.add(bropo3);
		
		this.getContentPane().add(bropocalypseB);
		
		
		JTextField dacTitle = new JTextField();
		dacTitle.setText("                Dé À Coudre");
		dacTitle.setEditable(false);
		dacTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(dacTitle);
		
		JPanel dAC = new JPanel();
		dAC.setLayout(new GridLayout(1, 2));
		
		JTextField dac1 = new JTextField();
		dac1.setText("Moyenne de gains en gems");
		dac1.setFont(new Font("Arial", 0, 12));
		dac1.setEditable(false);
		dAC.add(dac1);
		
		dac2.setText("0");
		dac2.setFont(new Font("Arial", Font.ITALIC, 14));
		dac2.setEditable(true);
		dAC.add(dac2);
		
		this.getContentPane().add(dAC);
		
		JPanel dacB = new JPanel();
		dacB.setLayout(new GridLayout(1, 2));
		
		JTextField dacB1 = new JTextField();
		dacB1.setText("Temps moyen d'une partie (en minutes)");
		dacB1.setFont(new Font("Arial", 0, 12));
		dacB1.setEditable(false);
		dacB.add(dacB1);
		
		dac3.setText("1");
		dac3.setFont(new Font("Arial", Font.ITALIC, 14));
		dac3.setEditable(true);
		dacB.add(dac3);
		
		this.getContentPane().add(dacB);
		
		JTextField splatTitle = new JTextField();
		splatTitle.setText("                SplatCube");
		splatTitle.setEditable(false);
		splatTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(splatTitle);
		
		JPanel splatCube = new JPanel();
		splatCube.setLayout(new GridLayout(1, 2));
		
		JTextField splat1 = new JTextField();
		splat1.setText("Moyenne de gains en gems");
		splat1.setFont(new Font("Arial", 0, 12));
		splat1.setEditable(false);
		splatCube.add(splat1);
		
		splat2.setText("0");
		splat2.setFont(new Font("Arial", Font.ITALIC, 14));
		splat2.setEditable(true);
		splatCube.add(splat2);
		
		this.getContentPane().add(splatCube);
		
		JPanel splatCubeB = new JPanel();
		splatCubeB.setLayout(new GridLayout(1, 2));
		
		JTextField splatB1 = new JTextField();
		splatB1.setText("Temps moyen d'une partie (en minutes)");
		splatB1.setFont(new Font("Arial", 0, 12));
		splatB1.setEditable(false);
		splatCubeB.add(splatB1);
		
		splat3.setText("1");
		splat3.setFont(new Font("Arial", Font.ITALIC, 14));
		splat3.setEditable(true);
		splatCubeB.add(splat3);
		
		this.getContentPane().add(splatCubeB);
		
		JTextField uhcTitle = new JTextField();
		uhcTitle.setText("                UHC Fun");
		uhcTitle.setEditable(false);
		uhcTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(uhcTitle);
		
		JPanel uhcFun = new JPanel();
		uhcFun.setLayout(new GridLayout(1, 2));
		
		JTextField uhc1 = new JTextField();
		uhc1.setText("Moyenne de gains en gems");
		uhc1.setFont(new Font("Arial", 0, 12));
		uhc1.setEditable(false);
		uhcFun.add(uhc1);
		
		uhc2.setText("0");
		uhc2.setFont(new Font("Arial", Font.ITALIC, 14));
		uhc2.setEditable(true);
		uhcFun.add(uhc2);
		
		this.getContentPane().add(uhcFun);
		
		JPanel uhcFunB = new JPanel();
		uhcFunB.setLayout(new GridLayout(1, 2));
		
		JTextField uhcB1 = new JTextField();
		uhcB1.setText("Temps moyen d'une partie (en minutes)");
		uhcB1.setFont(new Font("Arial", 0, 12));
		uhcB1.setEditable(false);
		uhcFunB.add(uhcB1);
		
		uhc3.setText("1");
		uhc3.setFont(new Font("Arial", Font.ITALIC, 14));
		uhc3.setEditable(true);
		uhcFunB.add(uhc3);
		
		this.getContentPane().add(uhcFunB);
		
		JTextField fightTitle = new JTextField();
		fightTitle.setText("                Fight Cube");
		fightTitle.setEditable(false);
		fightTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(fightTitle);
		
		JPanel fightCube = new JPanel();
		fightCube.setLayout(new GridLayout(1, 2));
		
		JTextField fight1 = new JTextField();
		fight1.setText("Moyenne de gains en gems");
		fight1.setFont(new Font("Arial", 0, 12));
		fight1.setEditable(false);
		fightCube.add(fight1);
		
		fight2.setText("0");
		fight2.setFont(new Font("Arial", Font.ITALIC, 14));
		fight2.setEditable(true);
		fightCube.add(fight2);
		
		this.getContentPane().add(fightCube);
		
		JPanel fightCubeB = new JPanel();
		fightCubeB.setLayout(new GridLayout(1, 2));
		
		JTextField fightB1 = new JTextField();
		fightB1.setText("Temps moyen d'une partie (en minutes)");
		fightB1.setFont(new Font("Arial", 0, 12));
		fightB1.setEditable(false);
		fightCubeB.add(fightB1);
		
		fight3.setText("1");
		fight3.setFont(new Font("Arial", Font.ITALIC, 14));
		fight3.setEditable(true);
		fightCubeB.add(fight3);
		
		this.getContentPane().add(fightCubeB);
		
		
		JTextField buildTitle = new JTextField();
		buildTitle.setText("                Building Games");
		buildTitle.setEditable(false);
		buildTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(buildTitle);
		
		JPanel buildingGame = new JPanel();
		buildingGame.setLayout(new GridLayout(1, 2));
		
		JTextField build1 = new JTextField();
		build1.setText("Moyenne de gains en gems");
		build1.setFont(new Font("Arial", 0, 12));
		build1.setEditable(false);
		buildingGame.add(build1);
		
		build2.setText("0");
		build2.setFont(new Font("Arial", Font.ITALIC, 14));
		build2.setEditable(true);
		buildingGame.add(build2);
		
		this.getContentPane().add(buildingGame);
		
		JPanel buildingGameB = new JPanel();
		buildingGameB.setLayout(new GridLayout(1, 2));
		
		JTextField buildB1 = new JTextField();
		buildB1.setText("Temps moyen d'une partie (en minutes)");
		buildB1.setFont(new Font("Arial", 0, 12));
		buildB1.setEditable(false);
		buildingGameB.add(buildB1);
		
		build3.setText("1");
		build3.setFont(new Font("Arial", Font.ITALIC, 14));
		build3.setEditable(true);
		buildingGameB.add(build3);
		
		this.getContentPane().add(buildingGameB);
		
		JTextField survivalTitle = new JTextField();
		survivalTitle.setText("                Survival Games");
		survivalTitle.setEditable(false);
		survivalTitle.setFont(new Font("Arial", Font.BOLD, 14));
		this.getContentPane().add(survivalTitle);
		
		JPanel survivalGame = new JPanel();
		survivalGame.setLayout(new GridLayout(1, 2));
		
		JTextField survival1 = new JTextField();
		survival1.setText("Moyenne de gains en gems");
		survival1.setFont(new Font("Arial", 0, 12));
		survival1.setEditable(false);
		survivalGame.add(survival1);
		
		survival2.setText("0");
		survival2.setFont(new Font("Arial", Font.ITALIC, 14));
		survival2.setEditable(true);
		survivalGame.add(survival2);
		
		this.getContentPane().add(survivalGame);
		
		JPanel survivalGameB = new JPanel();
		survivalGameB.setLayout(new GridLayout(1, 2));
		
		JTextField survivalB1 = new JTextField();
		survivalB1.setText("Temps moyen d'une partie (en minutes)");
		survivalB1.setFont(new Font("Arial", 0, 12));
		survivalB1.setEditable(false);
		survivalGameB.add(survivalB1);
		
		survival3.setText("1");
		survival3.setFont(new Font("Arial", Font.ITALIC, 14));
		survival3.setEditable(true);
		survivalGameB.add(survival3);
		
		this.getContentPane().add(survivalGameB);
		

		
		ok.addActionListener(this);
		this.getContentPane().add(ok);
		
		
		
		
		
		
		
		
		this.setVisible(true);
		
	}
	
	private void error(String gameName){
		JOptionPane.showMessageDialog(null, "La valeur entrée pour " + gameName + " n'est pas valide !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
		return;
	}
	
	private void saveData(){
		
		try{
			skyWarsGems = Double.parseDouble(skyWars2.getText());
			if(skyWarsGems < 0){
				error("SkyWars");
				return;
			}
		}
		catch(NumberFormatException e){
			error("SkyWars");
			return;
		}
		
		try{
			bropocalypseGems = Double.parseDouble(bropo2.getText());
			if(bropocalypseGems < 0){
				error("Bropocalypse");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Bropocalypse");
			return;
		}
		
		try{
			dacGems = Double.parseDouble(dac2.getText());
			if(dacGems < 0){
				error("Dé à coudre");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Dé à coudre");
			return;
		}
		
		try{
			splatCubeGems = Double.parseDouble(splat2.getText());
			if(splatCubeGems < 0 ){
				error("SplatCube");
				return;
			}
		}
		catch(NumberFormatException e){
			error("SplatCube");
			return;
		}
		
		try{
			uhcFunGems = Double.parseDouble(uhc2.getText());
			if(uhcFunGems < 0){
				error("UHC Fun");
				return;
			}
		}
		catch(NumberFormatException e){
			error("UHC Fun");
			return;
		}
		
		try{
			fightCubeGems = Double.parseDouble(fight2.getText());
			if(fightCubeGems < 0){
				error("Fight Cube");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Fight Cube");
			return;
		}
		
		try{
			buildGameGems = Double.parseDouble(build2.getText());
			if(buildGameGems < 0){
				error("Building Games");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Building Games");
			return;
		}
		
		try{
			survivalGamesGems = Double.parseDouble(survival2.getText());
			if(survivalGamesGems < 0){
				error("Survival Games");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Survival Games");
			return;
		}
		
		
		
		try{
			skyWarsGameTime = Double.parseDouble(skyWars3.getText());
			if(skyWarsGameTime < 0){
				error("SkyWars");
				return;
			}
		}
		catch(NumberFormatException e){
			error("SkyWars");
			return;
		}
		
		try{
			bropocalypseGameTime = Double.parseDouble(bropo3.getText());
			if(bropocalypseGameTime < 0){
				error("Bropocalypse");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Bropocalypse");
			return;
		}
		
		try{
			dacGameTime = Double.parseDouble(dac3.getText());
			if(dacGameTime < 0){
				error("Dé à coudre");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Dé à coudre");
			return;
		}
		
		try{
			splatCubeGameTime = Double.parseDouble(splat3.getText());
			if(splatCubeGameTime < 0 ){
				error("SplatCube");
				return;
			}
		}
		catch(NumberFormatException e){
			error("SplatCube");
			return;
		}
		
		try{
			uhcFunGameTime = Double.parseDouble(uhc3.getText());
			if(uhcFunGameTime < 0){
				error("UHC Fun");
				return;
			}
		}
		catch(NumberFormatException e){
			error("UHC Fun");
			return;
		}
		
		try{
			fightCubeGameTime = Double.parseDouble(fight3.getText());
			if(fightCubeGameTime < 0){
				error("Fight Cube");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Fight Cube");
			return;
		}
		
		try{
			buildGameGameTime = Double.parseDouble(build3.getText());
			if(buildGameGameTime < 0){
				error("Building Games");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Building Games");
			return;
		}
		
		try{
			survivalGamesGameTime = Double.parseDouble(survival3.getText());
			if(survivalGamesGameTime < 0){
				error("Survival Games");
				return;
			}
		}
		catch(NumberFormatException e){
			error("Survival Games");
			return;
		}
		
		dispose();
		GUI.showProbabilitiesElite();
		GUI.calculGemsElite();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == ok){
			saveData();
		}
		
	}

}
