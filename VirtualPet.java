/*
	Text based Tamagotchi
	By Emmanuel Adefuye 20/03/2019
*/
import java.util.Scanner;
public class VirtualPet
{
	//Declare petAttributes
		//Age, Name, Happiness
	//petRunAway boolean false
	//while petRunAway is false
		//increase Age
		//player interaction
			//feed, pet, nothing
		//display Happiness
			//if Happiness <= -3 
				//petRunAway is true, display petRunAway
			//else petRunAway is false
	//Print how old the pet is and feeling
	public static void main(String[] args)
	{
		System.out.print("\nGive your pet a name: ");
		Scanner petName = new Scanner(System.in);
		String name = petName.next();
		int age = 0;
		int cleanliness = 2;
		int happiness =0;
		int hunger = 0;
		String hungerString="";
		String cleanString="";
		String happyString="";
		boolean petRunAway = false;
		

		while(petRunAway == false)
		{
			Scanner input = new Scanner(System.in);
			age += 1;
			System.out.println(name+" is "+age+" days old!\n(1) Feed\n(2) Clean\n(3) Play");
			System.out.println("\nSelect an action:");
			int interact = input.nextInt();

				
				if(interact == 1)
				{
					happiness+=1;
					if(happiness >=1 && happiness<=2){happyString = "Happy";}
					if(happiness ==3){happyString = "Very Happy";}
					if(happiness >=4){happyString = "Super-Mega-Ultra Happy";}
					if(happiness <0){happyString = "Sad";}

					hunger-=1;
					if(hunger >=1 && hunger <=2){hungerString = "Hungry";}
					if(hunger ==3){hungerString = "Starving";}
					if(hunger >=4){hungerString = "Borderline Dead (Calling PETA)";}
					else if(hunger <=0){hungerString = "Full";}

					cleanliness-=1;
					if(cleanliness ==1){cleanString = "Messy";}
					if(cleanliness == 0){cleanString = "Dirty";}
					if(cleanliness < 0){cleanString = "Disgusting!";}
					else if(cleanliness >=2){cleanString = "Clean";}

					System.out.println("\n--------------"+name+"'s Current Status--------------"+"\n");
				}
				if(interact == 2)
				{
					happiness-=1;
					if(happiness >=1 && happiness<=2){happyString = "Happy";}
					if(happiness ==3){happyString = "Very Happy";}
					if(happiness >=4){happyString = "Super-Mega-Ultra Happy";}
					if(happiness <0){happyString = "Sad";}

					hunger+=1;
					if(hunger >=1 && hunger <=2){hungerString = "Hungry";}
					if(hunger ==3){hungerString = "Starving";}
					if(hunger >=4){hungerString = "Borderline Dead (Calling PETA)";}
					else if(hunger <=0){hungerString = "Full";}

					cleanliness+=1;
					if(cleanliness ==1){cleanString = "Messy";}
					if(cleanliness == 0){cleanString = "Dirty";}
					if(cleanliness < 0){cleanString = "Disgusting!";}
					else if(cleanliness >=2){cleanString = "Clean";}

					System.out.println("\n--------------"+name+"'s Current Status--------------"+"\n");
				}
				if(interact == 3)
				{
					happiness+=1;
					if(happiness >=1 && happiness<=2){happyString = "Happy";}
					if(happiness ==3){happyString = "Very Happy";}
					if(happiness >=4){happyString = "Super-Mega-Ultra Happy";}
					if(happiness <0){happyString = "Sad";}

					hunger+=1;
					if(hunger >=1 && hunger <=2){hungerString = "Hungry";}
					if(hunger ==3){hungerString = "Starving";}
					if(hunger >=4){hungerString = "Borderline Dead (Calling PETA)";}
					else if(hunger <=0){hungerString = "Full";}

					cleanliness-=1;
					if(cleanliness ==1){cleanString = "Messy";}
					if(cleanliness == 0){cleanString = "Dirty";}
					if(cleanliness < 0){cleanString = "Disgusting!";}
					else if(cleanliness >=2){cleanString = "Clean";}

					System.out.println("\n--------------"+name+"'s Current Status--------------"+"\n");
				}
			
			System.out.println("Hunger Level: "+hungerString+"\nCleanliness: "+cleanString+"\nHappiness: "+happyString);
			System.out.println("\n------------------------------------------------"+"\n");
			if(hunger >=3 || happiness <= -1 || cleanliness <0)
			{
				petRunAway = true;
			}	
		}//end while loop
		if(petRunAway == true)
		{
			System.out.println(name+" ran away...you didn't care for it well enough");
		}
	}//end main

}//end class
