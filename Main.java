package mrslayer02;

public class Main {
	
	
	//Sky Wars en Free
	public static double skyWarsFree(int nbGames, double winProbability){
		return nbGames * 25 * winProbability;
	}
	public static double skyWarsFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return skyWarsFree(nbGames, winProbability);
	}
	
	//Bropocalypse Free
	public static double bropocalypseFree(int nbGames, double winProbability){
		return nbGames * 5 * winProbability;
	}
	public static double bropocalypseFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return bropocalypseFree(nbGames, winProbability);
	}
	
	//De a coudre Free
	public static double deACoudreFree(int nbGames, double winProbability){
		return nbGames * 25 * winProbability;
	}
	public static double deACoudreFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return deACoudreFree(nbGames, winProbability);
	}
	
	//SplatCube Free
	public static double splatCubeFree(int nbGames, double winProbability){
		return nbGames * 6 * winProbability;
	}
	public static double splatCubeFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return splatCubeFree(nbGames, winProbability);
	}
	
	//UHC Fun Free
	public static double uhcFunFree(int nbGames, double winProbability, boolean team){
		if(team){
			return nbGames * 25 * winProbability;
		}
		else return nbGames * 50 * winProbability;
		
	}
	public static double uhcFunFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes, boolean team){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return uhcFunFree(nbGames, winProbability, team);
	}
	
	//Fight Cube Free
	public static double fightCubeFree(int nbGames, double winProbability){
		return nbGames * 7 * winProbability;
	}
	public static double fightCubeFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return fightCubeFree(nbGames, winProbability);
	}
	
	//Building Game Free
	public static double buildingGameFree(int nbGames, double winProbability){
		return nbGames * 25 * winProbability;
	}
	public static double buildingGameFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return buildingGameFree(nbGames, winProbability);
	}
	
	public static double survivalGameFree(int nbGames, double winProbability){
		return nbGames * 50 * winProbability;
	}
	public static double survivalGameFree(double gameTimeInMinutes, double winProbability, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return survivalGameFree(nbGames, winProbability);
	}
	
	public static double rushFree(int nbGames, double moyenneGainsGems){
		return (nbGames * moyenneGainsGems);
	}
	public static double rushFree(double gameTimeInMinutes, double moyenneGainsGems, double numberOfMinutes){
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return rushFree(nbGames, moyenneGainsGems);
	}
	
	
	// PARTIES ELITE
	
	public static double gainsElite(int nbGames, double moyenneGainsGems){
		return (nbGames * moyenneGainsGems) - (nbGames*100);
	}
	public static double gainsElite(double gameTimeInMinutes, double moyenneGainsGems, double numberOfMinutes){
		//know number of games
		int nbGames = 0;
		while(nbGames*gameTimeInMinutes < numberOfMinutes-gameTimeInMinutes){
			nbGames++;
		}
		return gainsElite(nbGames, moyenneGainsGems);
	}
	
	
	
	public static void main(String[] args){
		
		new GUI();
		
	}

}
