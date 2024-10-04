public class Rental {
    private int year;
    private String modelName;
    private boolean fullyFueled;
  
    /**
     * No-argument constructor for the Rental class.
     * Initializes the Rental object with default values.
     */
    public Rental() {
      this(0, "base", true);
    }
  
    /**
     * Parameterized constructor for the Rental class.
     * Initializes the Rental object with the given values for year, modelName, and fullyFueled.
     */
    public Rental(int year, String modelName, boolean fullyFueled) {
      this.year = year;
      this.modelName = modelName;
      this.fullyFueled = fullyFueled;
    }
  
    // Accessor (getter) methods
    public int getYear() {
      return year;
    }
  
    public String getModelName() {
      return modelName;
    }
  
    public boolean getFullyFueled() {
      return fullyFueled;
    }
  
    // Mutator (setter) methods
    public void setYear(int year) {
      this.year = year;
    }
  
    public void setModelName(String modelName) {
      this.modelName = modelName;
    }
  
    public void setFullyFueled(boolean fullyFueled) {
      this.fullyFueled = fullyFueled;
    }
  
    /**
     * Returns a string representation of the Rental object.
     */
  
    public String toString() {
      return "Rental [Year=" + year + ", Model Name=" + modelName + ", Fully Fueled=" + fullyFueled + "]";
    }
  }
  