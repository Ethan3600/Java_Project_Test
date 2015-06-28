import java.util.Random;

public class person{
	public int health;
	private int age;
	private String name;
	
	public person(int age, String name, int health) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		this.health = health;
	}
	
	public void salute(){
		System.out.println("My name is " + name + ". I am " + age + " years old, and I am ready to die in battle");
	}
	

	public int punch(person victim){
		Random randNum = new Random();
		int chance = randNum.nextInt(100);
		int attack = randNum.nextInt(50);
		//System.out.println(chance);
		if (chance < 50){
			System.out.println(name + " has missed");
		}
		else if (chance >= 50){
			System.out.println(name + " Attack: " + attack);
			victim.health = victim.health - attack;
			
		}
		System.out.println(victim.name + "'s" + " health level is " + victim.health);
		return health;
		
		
	}


	public String getName() {
		// TODO Auto-generated method stub
		System.out.println(name);
		return name;
	}
	
	public void death(){
		System.out.println(name + " has died in combat");
	}

	
	
}
