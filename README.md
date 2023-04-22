# HomeAppliances

We will create a superclass called "Electrodomestico" with the following characteristics:

Its attributes are base price, color, energy consumption (letters between A and F), and weight. Indicate that they can be inherited.
By default, the color will be white, energy consumption will be F, the base price is €100, and the weight is 5 kg. Use constants for this.
The available colors are white, black, red, blue, and gray. It doesn't matter if the name is in uppercase or lowercase.
The implemented constructors will be:
A default constructor.
A constructor with price and weight. The rest by default.
A constructor with all the attributes.

The implemented methods will be:

Get methods for all attributes.
checkEnergyConsumption(char letter): checks if the letter is correct, if it's not, it will use the default letter. It will be invoked when creating the object and won't be visible.
checkColor(String color): checks if the color is correct, if it's not, it will use the default color. It will be invoked when creating the object and won't be visible.
finalPrice(): increases the price according to energy consumption and size.

This is the price list:

We will create a subclass called "Lavadora" with the following characteristics:
Its attribute is load, in addition to the inherited attributes.
By default, the load is 5 kg. Use a constant for this.
The implemented constructors will be:
A default constructor.
A constructor with price and weight. The rest by default.
A constructor with load and the rest of the inherited attributes. Remember that you must call the parent class constructor.

The implemented methods will be:

Get method for the load.
finalPrice(): if it has a load greater than 30 kg, the price will increase by €50, otherwise, the price won't be increased. Call the parent method and add the necessary code. Remember that the conditions we have seen in the "Electrodomestico" class should also affect the price.

We will create a subclass called "Television" with the following characteristics:

Its attributes are resolution (in inches) and a TDT tuner (boolean), in addition to the inherited attributes.
By default, the resolution will be 20 inches, and the tuner will be false.
The implemented constructors will be:
A default constructor.
A constructor with price and weight. The rest by default.
A constructor with resolution, TDT tuner, and the rest of the inherited attributes.

The implemented methods will be:

Get methods for resolution and TDT tuner.
finalPrice(): if it has a resolution greater than 40 inches, the price will increase by 30%, and if it has a built-in TDT tuner, the price will increase by €50.

Now, create an executable class that does the following:

Create an array of 10 positions of "Electrodomesticos."
Assign an object of the previous classes with the values you want to each position.
Now, loop through this array and execute the finalPrice() method. You must show the price of each class, that is, the price of all TVs on one side, washing machines on another, and the sum of all "Electrodomesticos" (you can create "Electrodomestico" objects, but remember that "Television" and "Lavadora" are also "Electrodomesticos"). Remember the use of the instanceof operator.
For example, if we have an "Electrodomestico" with a final price of €300, a washing machine with €200, and a TV with €500, the final result will be €1000 (€300 + €200 + €500) for "Electrodomesticos," €200 for the washing machine
