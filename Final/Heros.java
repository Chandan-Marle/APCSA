import java.util.Random;

public class Heros{
    private String characterType;
    private String name;
    private int strength, toughness, intelligence, magic, influence;
    Random rand = new Random();
    private int totalPoints = 0;


    public Heros(String charType){
        characterType = charType;
        randomizeCharacter(characterType);
    }

    public void randomizeCharacter(String characterType) {
    while (totalPoints < 8 || totalPoints>28){
        if(characterType.equals("Knight")){

            strength = rand.nextInt(3) + 7;
            toughness = rand.nextInt(6);
            intelligence = rand.nextInt(6);
            magic = rand.nextInt(6);
            influence = rand.nextInt(6);

        } else if(characterType.equals("Peasant")){

            strength = rand.nextInt(6);
            toughness = rand.nextInt(3) + 7;
            intelligence = rand.nextInt(6);
            magic = rand.nextInt(6);
            influence = rand.nextInt(6);

        } else if(characterType.equals("Cleric")){

            strength = rand.nextInt(3);
            toughness = rand.nextInt(6);
            intelligence = rand.nextInt(3) + 7;
            magic = rand.nextInt(6);
            influence = rand.nextInt(6);

        } else if(characterType.equals("Mage")){

            strength = rand.nextInt(6);
            toughness = rand.nextInt(6);
            intelligence = rand.nextInt(6);
            magic = rand.nextInt(3) + 7;
            influence = rand.nextInt(6);

        } else if(characterType.equals("Courtier")){

            strength = rand.nextInt(6);
            toughness = rand.nextInt(6);
            intelligence = rand.nextInt(6);
            magic = rand.nextInt(6);
            influence = rand.nextInt(3)+ 7;
        }
        totalPoints = strength + toughness + intelligence + magic + influence;
        }   
    }

    public void nameCharacter(String characterName){
        name = characterName;
    }

    public String getType(){
        return characterType;
    }

    public int getStrength(){
        return strength;
    }

    public int getToughness(){
        return toughness;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public int getMagic(){
        return magic;
    }

    public int getInfluence(){
        return influence;
    }

    public void setTotalPoints(int points){
        totalPoints = points;
    }
    

    public String heroDetails() {
        return name + "," + characterType + "," + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence;
    }
}