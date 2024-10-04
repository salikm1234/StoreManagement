public class Boat extends Rental {
    private boolean hasMotor;
    private String sailType;
  
    /**
     * No-argument constructor for the Boat class.
     * Initializes the Boat with default values and calls the parent class's no-arg constructor.
     */
    public Boat() {
      super(); // Calls the no-argument constructor of Rental
      this.hasMotor = false; // default value
      this.sailType = "none"; // default value
    }
  
    /**
     * Parameterized constructor for the Boat class.
     * Initializes the Boat with the given values for year, modelName, fullyFueled, hasMotor, and sailType.
     */
    public Boat(int year, String modelName, boolean fullyFueled, boolean hasMotor, String sailType) {
      super(year, modelName, fullyFueled); // Calls the parameterized constructor of Rental
      this.hasMotor = hasMotor;
      this.sailType = sailType;
    }
  
    // Accessor (getter) and Mutator (setter) methods for Boat-specific variables
    public boolean getHasMotor() {
      return hasMotor;
    }
  
    public void setHasMotor(boolean hasMotor) {
      this.hasMotor = hasMotor;
    }
  
    public String getSailType() {
      return sailType;
    }
  
    public void setSailType(String sailType) {
      this.sailType = sailType;
    }
  
    /**
     * Returns a string representation of the Boat object, including inherited and subclass-specific variables.
     */
  
    public String toString() {
      return "Boat [Year=" + getYear() + ", Model Name=" + getModelName() + ", Fully Fueled=" + getFullyFueled()
             + ", Has Motor=" + hasMotor + ", Sail Type=" + sailType + "]";
    }
  }
  