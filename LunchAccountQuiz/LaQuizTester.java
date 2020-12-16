public class LaQuizTester {
    public static void main(String[] args) {

        LaQuiz Student1 = new LaQuiz("Dwight Shrute", 20.00);

        System.out.println(Student1.getId());
        System.out.println(Student1.getStudentName());
        System.out.println(Student1.getBalance());
        System.out.println(Student1.checkIfGiveawayIsClaimed());
        Student1.buyMeal(10.00);
        System.out.println(Student1.lunchConformation());
        System.out.println(Student1.getBalance());
        Student1.buyMeal(50.00);
        System.out.println(Student1.lunchConformation());
        System.out.println(Student1.getBalance());
        Student1.increaseBalance(25.00);
        System.out.println(Student1.getBalance());
        Student1.buyMeal(50.00);
        System.out.println(Student1.lunchConformation());
        System.out.println(Student1.getBalance());
        
        LaQuiz Student2 = new LaQuiz("Micheal Scott");
        System.out.println(Student2.getId());
        System.out.println(Student2.getStudentName());
        System.out.println(Student2.getBalance());
        }
}
