import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Final {

    static int knightAmount = 0;
    static int peasantAmount = 0;
    static int clericAmount = 0;
    static int mageAmount = 0;
    static int courtierAmount = 0;

    public static void main(String[] args) throws IOException {
        openScreen();
    }

    public static void openScreen() throws IOException {
        Scanner scan = new Scanner(System.in);
        int response = 0;
        System.out.println(
                "\tWelcome to the most incredible multi-party RPG known to man! \n \tThe one, the only, Medival Times! \n \tFor this is where you will embark on your \n \tquest to rid the kingdom of evil! \n");
        System.out.println("\tKeanu Reeves not included");
        System.out.println("\n");
        System.out.println("\tPlease input a number to Begin!");
        System.out.println("\n");
        System.out.println("\t 1. Create New Game \n\n\t 2. Validate Save File\n");
        System.out.println("\t 3. Reroll an existing hero  \n\n\t 4. Quit");
        System.out.println("\n");
        while (response < 1 || response > 4) {
            response = scan.nextInt();
        }
        if (response == 1){
            startGame();
        } else if (response ==2 ){
            // validate();
        }
    }

    public static void validate(String fileName) throws IOException {
        int textCount = 0;
        File file = new File (fileName + ".md");
        Scanner fileScan = new Scanner  (file);
        Scanner text = new Scanner(System.in);
        String valid;
        fileScan.useDelimiter(",|\\n");
        while (fileScan.hasNext()) {
            textCount++;
            valid = fileScan.next();
        }
        if (textCount == 29) {
            System.out.println("\n" + fileName + ".md IS valid! Input anything to go back to the menu.");
            String wait = text.next();
            openScreen();
        }
        System.out.println("\n" + fileName + ".md is NOT valid. Input anything to go back to the menu.");
            String wait = text.next();
            openScreen();
    }

    public static void startGame() throws IOException  {
        Scanner scan = new Scanner(System.in);
        PrintWriter write;
        String saveFileName;
        System.out.println("Name of the save file?");
        saveFileName = scan.nextLine();

        Heros one = new Heros(heroBuilder(1));
        Heros two = new Heros(heroBuilder(2));
        Heros three = new Heros(heroBuilder(3));
        Heros four = new Heros(heroBuilder(4));

        shuffleStats(1, one);
        shuffleStats(2, two);
        shuffleStats(3, three);
        shuffleStats(4, four);

        write = new PrintWriter(saveFileName + ".md");
        write.println(saveFileName + "\n" + one.heroDetails() + "\n" + two.heroDetails() + "\n" + three.heroDetails()
                + "\n" + four.heroDetails());
        write.flush();
        write.close();
        openScreen();


    }

    


    public static void shuffleStats(int heroNumber, Heros hero) {
        Scanner scan = new Scanner(System.in);
        boolean satisfiedWithStats = false;
        while(!satisfiedWithStats) {
            System.out.println("\n\n\n\nHero number " + heroNumber + " has: \nStrenght:" + hero.getStrength() +"\nToughness:" + hero.getToughness() +"\nIntellignce:" + hero.getIntelligence() +"\nMagic:" + hero.getMagic() +"\nInfluence:" + hero.getInfluence());
            System.out.println("Are you satisfied with those stats?\n Answer 'Yes' if you are!");
            String satisfied = scan.nextLine();
            if (satisfied.equals("Yes")||satisfied.equals("yes")) {
                satisfiedWithStats = true;
                System.out.println("What would you like to name this hero?");
                hero.nameCharacter(scan.nextLine());
            } else{
                hero.setTotalPoints(0);
                hero.randomizeCharacter(hero.getType());
            }
        }
    }

    public static String heroBuilder(int heroNumber) {
        Scanner scan = new Scanner(System.in);
        String type = null;
        boolean tripleOfHero = true;
        while(tripleOfHero){
            System.out.println("\nWould you like hero number " + heroNumber + " to be a: \nKnight \nPeasant \nCleric \nMage \nCourtier \nPlease capitalize the first letter and write each name verbatim");
            type = scan.nextLine();
            tripleOfHero = checkForTriples(type);
            if(tripleOfHero){
                System.out.println("\n\n\tEither your hero type is spelled incorrectly or you already have two of this type\n\tPlease pick an appropriate hero type!\n\n");
                scan.nextLine();
            }
        }
        return type;
    }

    public static boolean checkForTriples(String type) {
        if(type.equals("Knight")){
            knightAmount++;
            if(knightAmount > 2){
                knightAmount--;
                return true;
            }
            else return false;
        }

        if(type.equals("Cleric")){
            clericAmount++;
            if(clericAmount > 2){
                clericAmount--;
                return true;
            }
            else return false;
        }

        if(type.equals("Mage")){
            mageAmount++;
            if(mageAmount > 2){
                mageAmount--;
                return true;
            }
            else return false;
        }
        
        if(type.equals("Peasant")){
            peasantAmount++;
            if(peasantAmount > 2){
                peasantAmount--;
                return true;
            }
            else return false;
        }

        if(type.equals("Courtier")){
            courtierAmount++;
            if(courtierAmount > 2){
                courtierAmount--;
                return true;
            }
            else return false;
        }
        return true;
    }
}