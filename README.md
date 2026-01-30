**Recipe Finder**

Overview

Recipe Finder is a simple Java console application that allows users to find recipes based on the ingredients they have. Users enter a list of ingredients, and the program searches through a predefined set of recipes to display all recipes that can be made with the given ingredients.

This project demonstrates object-oriented programming, ArrayLists, user input handling, and basic string operations in Java.

**Features**

Store multiple recipes with:

Recipe name

Ingredients list

**Instructions**

Search recipes by ingredients (case-insensitive).

Display full recipe details including ingredients and instructions.

Handles multiple recipes matching the given ingredients.

**How to Use**

Clone or download the repository.

Compile the Java files:

javac RecipeFinder.java


**Run the program:**

java RecipeFinder


Enter ingredients separated by commas when prompted, for example:

tomato, onion, salt


The program will display recipes that match the entered ingredients or a message if no recipes are found.

Example

Input:

tomato, onion, salt


Output:

Recipe: Tomato Soup
Ingredients:
- tomato
- onion
- salt
- water
Instructions: Boil tomatoes and onions in water. Add salt to taste.

**Project Structure**

Recipe.java – Defines the Recipe class with attributes, methods to check ingredients, and display recipes.

RecipeFinder.java – Main program that initializes recipes, takes user input, and finds matching recipes.

Skills Learned

Java programming and OOP concepts

Using ArrayLists to store and manipulate data

Handling user input using Scanner

Iterating and filtering data based on conditions

Displaying structured output to the console

Future Improvements

Allow partial matches or missing ingredients

Add a GUI for better user experience

Store recipes in a file or database for easy management

Include recipe categories (e.g., breakfast, lunch, dessert)
