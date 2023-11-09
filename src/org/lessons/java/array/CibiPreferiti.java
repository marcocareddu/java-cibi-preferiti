package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
//		Array Declaration
		String[] favoriteFood = {"la pizza", "il sushi", "il panino", "la pasta", "l'hamburger", "il cinese"};
		
//		Medium position calc
		int mediumFoodPosition = (favoriteFood.length)/2;

		
		
//		Print results
		System.out.println("La classifica contiene " + favoriteFood.length + " elementi.");
		System.out.println("Il mio cibo preferito è " + favoriteFood[0]);
		System.out.println("Il cibo che mi piace di meno della classifica è " + favoriteFood[favoriteFood.length-1]);
		
		if((favoriteFood.length %2) == 0) {
			System.out.println("I cibi a metà della classifica sono " + favoriteFood[mediumFoodPosition] + " e " + favoriteFood[mediumFoodPosition - 1]);
		} else {
			System.out.println("Il cibo a metà della classifica è " + mediumFoodPosition);
		}
	}
}
