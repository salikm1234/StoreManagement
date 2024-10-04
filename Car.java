public class Car extends Rental {
    private boolean isElectric;
    private int numSeats;
    private String engine;
  
    /**
     * No-argument constructor for the Car class.
     * Initializes the Car with default values and calls the parent class's no-arg constructor.
     */
    public Car() {
      super(); // Calls the no-argument constructor of Rental
      this.isElectric = false; // default value
      this.numSeats = 4; // default value
      this.engine = "unknown"; // default value
    }
  
    /**
     * Parameterized constructor for the Car class.
     * Initializes the Car with the given values for year, modelName, fullyFueled, isElectric, numSeats, and engine.
     */
    public Car(int year, String modelName, boolean fullyFueled, boolean isElectric, int numSeats, String engine) {
      super(year, modelName, fullyFueled); // Calls the parameterized constructor of Rental
      this.isElectric = isElectric;
      this.numSeats = numSeats;
      this.engine = engine;
    }
  
  
    // Accessor (getter) and Mutator (setter) methods for Car-specific variables
    public boolean getIsElectric() {
      return isElectric;
    }
  
    public void setIsElectric(boolean isElectric) {
      this.isElectric = isElectric;
    }
  
    public int getNumSeats() {
      return numSeats;
    }
  
    public void setNumSeats(int numSeats) {
      this.numSeats = numSeats;
    }
  
    public String getEngine() {
      return engine;
    }
  
    public void setEngine(String engine) {
      this.engine = engine;
    }
  
    /**
     * Returns a string representation of the Car object, including inherited and subclass-specific variables.
     */
  
    public String toString() {
      return "Car [Year=" + getYear() + ", Model Name=" + getModelName() + ", Fully Fueled=" + getFullyFueled()
             + ", Is Electric=" + isElectric + ", Number of Seats=" + numSeats + ", Engine=" + engine + "]";
    }
  }
  