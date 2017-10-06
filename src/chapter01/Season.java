package chapter01;

/**
 * Created by Carmen on 30-9-2017.
 */
public enum Season {

    WINTER("low") {
        public void printLeafcolor() { System.out.println("No leaves left!"); }
    },
    SPRING("medium") {
        public void printLeafcolor() { System.out.println("Light green"); }
    },
    SUMMER("high") {
        public void printLeafcolor() { System.out.println("Dark green"); }
    },
    FALL("medium") {
        public void printLeafcolor() { System.out.println("Orange, yellow and red"); }
    };

    private String temperature;

    Season(String temperature){
        this.temperature = temperature;
    }

    public abstract void printLeafcolor();

    // Example of an Enum class with State value and implemented methods
}
