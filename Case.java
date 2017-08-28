
public class Case {

	String texture;
	Zone zone;
	boolean travers;
	
	public enum Zone {
		Neutre (0),
		Mur (1),
		Cellule (2),
		Douches (3),
		Biblioth�que (4),
		SalleDeSport (5),
		Cantine (6),
		Cuisine (7,1);
		
		int nb;
		int autor=0;
		
		Zone(int nb) {this.nb=nb;}
		Zone(int nb,int autorisation) {this.nb=nb;this.autor=autorisation;}
		
		public void vrfZone(int droit){//V�rification du droit du joueur � �tre dans la zone
			if(droit<autor){
				System.out.print("Alerte");
			}
			
		}
		
	}
	
	
	
	
	public Case(String texture, Zone zone, boolean travers){
		this.texture = texture;
		this.zone = zone;
		this.travers = travers;
	}
	
}
