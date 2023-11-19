
import java.util.Random;         // imports go here
import java.util.Scanner;

public class Hammurabi {
    int bushels = 2800;
    int acresOwned = 1000;
    int numberOfAcresToBuy;
    int numberOfAcresToSell;
    int grainToFeedPeople;
    int acresToPlant;
    int bushelsPerPerson = 20;

    // must save in a file named Hammurabi.java
    Random rand = new Random();  // this is an instance variable
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // required in every Java program
        new Hammurabi().playGame();
    }

    void playGame() {
        // declare local variables here: grain, population, etc.
        // statements go after the declations
    }

    public int plagueDeaths(int i) {
        Random rand = new Random();
        if (rand.nextInt(100) < 15) {
            return i / 2;

        }

        return 0;
    }

    public int starvationDeaths(int i, int i1) {

        //int starvati,onDeaths(int population, int bushelsFedToPeople)
        int noOfDeaths = (i - (i1 / bushelsPerPerson));
        if (noOfDeaths < 0) {
            noOfDeaths = 0;
        }
        return noOfDeaths;
    }

    public Boolean uprising(double i, double i1) {
        double percentuprising = (i1 / i) * 100;
        if (percentuprising > 45) {
            return true;
        } else {
            return false;
        }
    }

    public int immigrants(int i, int i1, int i2) {
        return (20 * i1 + i2) / (100 * i) + 1;
    }


    public int harvest(int acresplanted) {
        Random random = new Random();
        // +1 will move it from 0-5 to 1-6 range
        int yield = random.nextInt(6)+1;
        System.out.println(yield);
        int harvest =  acresplanted * yield;
        System.out.println(acresplanted);
        return harvest;
    }

    public int newCostOfLand() {

        Random random = new Random();
        int costPerAcre = random.nextInt(23- 17 + 1) + 17;
        System.out.println(costPerAcre);
        return costPerAcre;
    }



    public int grainEatenByRats(int bushels) {

        Random random = new Random();
        if (random.nextInt(100) < 40) {
            int r1 = random.nextInt(30 - 10 + 1) + 10;
            int r2 = bushels * r1 / 100;
            return r2;
        }
        return 0;
    }
}