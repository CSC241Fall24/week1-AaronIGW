public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        // Initialize id and level with appropriate values
        this.id = 1; // 1 represents Bulbasaur
        this.level = 1; // Initial level is set to 1
    }

    // setLevel method
    public void setLevel(int lv) {
        // Update the level
        this.level = lv;

        // Check for evolution conditions
        if (lv >= 16 && lv < 32) {
            this.id = 2; // 2 represents Ivysaur
        } else if (lv >= 32) {
            this.id = 3; // 3 represents Venusaur
        } else {
            this.id = 1; // Default to Bulbasaur if level is below 16
        }
    }

    // getLevel method
    public int getLevel() {
        return this.level;
    }

    // getName method
    public String getName() {
        // Return the name based on the current id
        switch (this.id) {
            case 1:
                return "Bulbasaur";
            case 2:
                return "Ivysaur";
            case 3:
                return "Venusaur";
            default:
                return "Unknown";
        }
    }

    // getID method
    public int getID() {
        return this.id;
    }

    // toString method
    @Override
    public String toString() {
        // Return a string representation of the Bulbasaur object
        return "Name: " + getName() + ", Level: " + level + ", ID: " + id;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // Compare this Bulbasaur object with another object
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bulbasaur other = (Bulbasaur) obj;
        return this.id == other.id && this.level == other.level;
    }

    // copy method
    public Bulbasaur copy() {
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur copy = new Bulbasaur();
        copy.id = this.id;
        copy.level = this.level;
        return copy;
    }
}
