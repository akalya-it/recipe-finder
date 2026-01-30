import java.util.Scanner; 
import java.util.ArrayList;
class Recipe 
{
private String name;
private ArrayList<String> ingredients; private String instructions;
public Recipe(String name, ArrayList<String> ingredients, String instructions) { this.name =    name;
this.ingredients = ingredients; this.instructions = instructions;
}
public String getName() { return name;
}
public ArrayList<String> getIngredients() { return ingredients;
}
public String getInstructions() { return instructions;
}
public boolean containsIngredients(ArrayList<String> userIngredients) { for (String ingredient : userIngredients) {
if (!ingredients.contains(ingredient)) { return false;
}
}
return true; // All ingredients matched
}
public void displayRecipe() { System.out.println("\nRecipe: " + name); System.out.println("Ingredients:");
for (String ingredient : ingredients) { System.out.println("- " + ingredient);
}
System.out.println("Instructions: " + instructions);
}
}
public class RecipeFinder {
public static ArrayList<Recipe> initializeRecipes() { ArrayList<Recipe> recipes = new ArrayList<>()
ArrayList<String> tomatoSoupIngredients = new ArrayList<>(); tomatoSoupIngredients.add("tomato"); tomatoSoupIngredients.add("onion"); tomatoSoupIngredients.add("salt"); tomatoSoupIngredients.add("water");
recipes.add(new Recipe("Tomato Soup", tomatoSoupIngredients, "Boil tomatoes and onions in water. Add salt to taste."));
ArrayList<String> cheeseSandwichIngredients = new ArrayList<>();
cheeseSandwichIngredients.add("bread"); cheeseSandwichIngredients.add("cheese"); cheeseSandwichIngredients.add("butter");
recipes.add(new Recipe("Cheese Sandwich", cheeseSandwichIngredients, "Place cheese between slices of bread, then toast with butter."));
ArrayList<String> pastaIngredients = new ArrayList<>(); pastaIngredients.add("pasta");
pastaIngredients.add("tomato sauce"); pastaIngredients.add("cheese");
recipes.add(new Recipe("Pasta", pastaIngredients, "Boil pasta and mix with tomato sauce. Add cheese on top."));
ArrayList<String> saladIngredients = new ArrayList<>(); saladIngredients.add("lettuce");
saladIngredients.add("tomato"); saladIngredients.add("cucumber"); saladIngredients.add("olive oil");
recipes.add(new Recipe("Salad", saladIngredients, "Mix the lettuce, tomato, and cucumber. Drizzle olive oil."));
return recipes;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Recipe> recipes = initializeRecipes(); // Load recipes System.out.print("Enter ingredients (comma separated): "); String input = scanner.nextLine();
String[] inputArray = input.split(",");
ArrayList<String> userIngredients = new ArrayList<>();
for (String ingredient : inputArray) {
userIngredients.add(ingredient.trim().toLowerCase()); // Convert to lower case for case-insensitive comparison
}
boolean recipeFound = false; for (Recipe recipe : recipes) {
if (recipe.containsIngredients(userIngredients)) { recipe.displayRecipe();
recipeFound = true;
}
}
if (!recipeFound) {
System.out.println("No recipes found with the given ingredients.");
}
scanner.close();
}
}
