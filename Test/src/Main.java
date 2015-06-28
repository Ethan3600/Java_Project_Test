
public class Main {

	public static void main(String[] args) {
		person Ethan = new person(21, "Ethan", 100);
		person Greg = new person(21, "Greg", 100);
		System.out.println(Ethan.health + "  " + Greg.health);
		Ethan.salute();
		Greg.salute();
		while(Greg.health > 0 && Ethan.health > 0){
			//Ethan.punch(Greg);
			int currentHealth = Greg.health;
			if(Greg.health > 0 || Ethan.health > 0){
				Ethan.punch(Greg);
				System.out.println(Ethan.health + "  " + Greg.health);
				if(Greg.health == currentHealth){
					Greg.punch(Ethan);
				} else {
					continue;
				}
			
			} 
			
			}
		if (Greg.health <= 0){
			Greg.death();
		}
		
		else if (Ethan.health <= 0){
			Ethan.death();
		}

	}

}
