public class LaQuiz {

    double amountSpent;
    static int id;
    static int giveawayParticipants = 0;
    String studentName;
    int lunchesBought;
    double balance;
    boolean giveawayClaimed = false;
    boolean buyLunchConformation = false;

    // Create the sudent with a balance

    public LaQuiz(String name, double preExistingBalance) {
        id++;
        studentName = name;        
        increaseBalance(preExistingBalance);
    }

    // Create a student without a prexisting balance

    public LaQuiz(String name) {
        id = id + 1;
        studentName = name;
    }

    // Check if student is elligible for the 20 dollar giveaway

    public void increaseBalance(double amountAddedToBalance) {
        balance = balance + amountAddedToBalance;
        if ((giveawayParticipants < 100) && (giveawayClaimed == false)) {
            balance = balance + 20.00;
            giveawayParticipants = giveawayParticipants + 1;
            giveawayClaimed = true;
        }
    }

    // Checks if giveaway is claimed and if the student is still elligible 

    public String checkIfGiveawayIsClaimed(){
        if(giveawayClaimed){
            return ("You have claimed your 20 dollars from our giveaway!") ;
        } else if(!(giveawayClaimed)&& (giveawayParticipants < 100)){
            return ("YOu are elligible for out 20 dollar giveaway.\n Please put money into your account to claim your prize!");
        }
        return ("YOu are no longer elligible for our giveaway!");
    }

    public String getId() {
        if (id < 10) {
            return ("0000" + id);
        } else if (id < 100) {
            return ("000" + id);
        } else if (id < 1000) {
            return ("00" + id);
        } else if (id < 10000) {
            return ("0" + id);
        }
        return Integer.toString(id);
    }
    
    public double getBalance() {
        return balance;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    //  Check if meal is affordable, buy meal, and add a tally to amount of meals bought

    public void buyMeal(double mealPrice) {
        if (mealPrice <= balance) {
            balance = balance - mealPrice;
            amountSpent = amountSpent + mealPrice;
            lunchesBought = lunchesBought + 1;
            buyLunchConformation = true;
        } else { 
            buyLunchConformation = false;
        }
    }


    public String lunchConformation() {
        if (buyLunchConformation) {
            return "Your last lunch request was approved";
        }
        return "Your last lunch request was denied";
    }
}