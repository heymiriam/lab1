package Lab1;

public class Model {
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;
    private double inches;
    private long kilograms;



    public void Model(){

    }

    public void Model(String firstName, String lastName, int height, int weight, boolean canTravel, boolean smokes){
        this.firstName=firstName;
        this.lastName=lastName;
        this.weight=weight;
        this.height=height;

        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setTraveler(canTravel);
        setSmoker(smokes);

        }


    /**
     * Set the first name
     * @param firstName first name
     * @param lastName last name
     * @param height set height
     * @param weight set weight
     */
    public void Model(String firstName, String lastName,int height, int weight){
        this.firstName=firstName;
        this.lastName=lastName;
        this.height=height;
        this.weight=weight;
        this.canTravel=true;
        this.smokes=false;

        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setTraveler(true);
        setSmoker(false);
    }
    /**
     * Returns the first name
     * @return the first name
     */
    public String getFirstName(){
        return firstName;
    }

/**
 * Returns the last name
 * @return the last name
 */
    public String getLastName(){
    return lastName;
        }

/**
 * Returns the height
 * @return the height
 */
    public int getHeight(){
        return height;
        }

/**
 * Returns the weight
 * @return the weight
 */
    public double getWeight(){
        return weight;
        }

/**
 * Returns can travel
 * @return can travel
 */
        public boolean getCanTravel(){
        return canTravel;
}

/**
 * Returns don't smoke
 * @return don't smoke
 */
    public boolean getSmokes(){
    return smokes;
        }


/**
 * Set the first name
 * @param firstName first name
 */

    public void setFirstName(String firstName){
        System.out.println(firstName.length());
        if(firstName.length()>3 && firstName.length()<26){
            this.firstName=firstName;
        }else{
            System.out.println("First name should be more than 3 characters and less than 26 characters");
        }
    }


/**
 * Set the last name
 * @param lastName last name
 */

    public void setLastName(String lastName){
        System.out.println(lastName.length());
        if(lastName.length()>3 && lastName.length()<26){
            this.lastName=lastName;
        }else{
            System.out.println("Last name should be more than 3 characters and less than 26 characters");
        }
    }

    public void setTraveler(boolean canTravel){
            this.canTravel=canTravel;

    }

    public void setSmoker(boolean smokes){
            this.smokes=smokes;

    }


/**
 * Set the weight
 * @param weight weight
 */
    public void setWeight(double weight){
        public static weight() {
            if (weight > 80 && weight < 280) {
                this.weight=weight;
            } else {
                System.out.println("Weight should be more than 80lb and less than 280lb");
            }

        }



/**
 * Set the height
 * @param height height
 */

    public void setHeight(int height){
            if(weight>24 && weight<84){
                this.height=height;
            }else{
                System.out.println("Height should be more than 24ft and less than 84ft");
            }
    }


    /**
     * Set the weight in pounds
     * @param pounds pounds (lb)
     */
    public void setWeightInPounds(double pounds){
        this.pounds=weight;
        System.out.println(pounds + " lb");
    }
    /**
     * Returns the height in feet and inches
     * @return the height in feet and inches
     */
    public String getHeightInFeetAndInches(){
            System.out.println("5 feets");
            System.out.println("5 feet 1 inch");
            System.out.println("5 feet 6 inches");
    }

    public long getWeightKg(){
        long kilograms= weight;
        System.out.println(Math.round(kilograms));
        }

        public void setWeight(long kilograms){
        this.kilograms=kilograms;
        private kilograms= weight*0.454;
        }
    }

        public void setWeight(double pounds) {
        this.pounds=pounds;
        private pounds= kilograms*0.454;
        }

        public void setHeight(int feet, int inches){
        this.feet=feet;
        this.inches=inches;
    }

        public void setHeight(int inches){
        this.inches=inches;

    }

    //Constructor
    //Prints detail information about this Model
    public void printDetails(){
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Height: " + getHeightInches() + " inches”);
                    System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
            if(canTravel == true) {
                System.out.println("Does travel ");
            } else {
                System.out.println("Does not travel ");
            }
            if(smokes == true){
                System.out.println("Does smoke ");
            } else {
                System.out.println("Does not smoke ");
            }

    }
}
