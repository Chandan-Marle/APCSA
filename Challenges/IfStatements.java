public class IfStatements{

    public static void main(String[] args){

        int x = 3;
        int y = 4;

        boolean isAwesomeDay = true;
        boolean shouldWork = x < y;

        String name = "Alex";

        if (shouldWork && isAwesomeDay) { //expression
            // run when shouldWork is true - evaluates to true
        }

        if (shouldWork || isAwesomeDay) { //expression
            // either is true
        }

        if (!shouldWork) { //not shouldWork
            
        }

        // code smell - anti-pattern
        if (shouldWork == true) {
            // NEVER DO THIS
        }

        if (x > y && shouldWork) {
            
        }
    }
}
