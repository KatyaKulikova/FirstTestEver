public class Zoo {
    public static void main(String[] args) {

        // Define veriable
        Racoon myFavouriteRacoon;
        // Init the veriable with new object of racoon class
        myFavouriteRacoon = new Racoon();
        /* we are saying JAVA that we are creating the new object */
        myFavouriteRacoon.setAge(15);
        // we set age value
        myFavouriteRacoon.setName("Bilbo");
        // we set name value
        myFavouriteRacoon.setWeight(257.6);
        // we set weight value
        System.out.println("Age:\t" + myFavouriteRacoon.getAge(););
        System.out.println("Name:\t" + myFavouriteRacoon.getName(););
        System.out.println("Weight:\t" + myFavouriteRacoon.getWeight(););
    }
}
