public class Bike extends Rental {
    private int numWheels;
    private String type;
  
    /**
     * No-argument constructor for the Bike class.
     * Initializes the Bike with default values and calls the parent class's no-arg constructor.
     */
    public Bike() {
      super(); // Calls the no-argument constructor of Rental
      this.numWheels = 2; // default value for a standard bike
      this.type = "road"; // default type of bike
    }
  
    /**
     * Parameterized constructor for the Bike class.
     * Initializes the Bike with the given values for year, modelName, fullyFueled, numWheels, and type.
     */
    public Bike(int year, String modelName, boolean fullyFueled, int numWheels, String type) {
      super(year, modelName, fullyFueled); // Calls the parameterized constructor of Rental
      this.numWheels = numWheels;
      this.type = type;
    }
  
  
    // Accessor (getter) and Mutator (setter) methods for Bike-specific variables
    public int getNumWheels() {
      return numWheels;
    }
  
    public void setNumWheels(int numWheels) {
      this.numWheels = numWheels;
    }
  
    public String getType() {
      return type;
    }
  
    public void setType(String type) {
      this.type = type;
    }
  
    /**
     * Returns a string representation of the Bike object, including inherited and subclass-specific variables.
     */
  
    public String toString() {
      return "Bike [Year=" + getYear() + ", Model Name=" + getModelName() + ", Fully Fueled=" + getFullyFueled()
             + ", Number of Wheels=" + numWheels + ", Type=" + type + "]";
    }
  }
  