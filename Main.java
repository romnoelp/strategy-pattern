public class Main {
    public static void main(String[] args) {
        try {
            // Character implementations
            Character knight = new Knight();
            Character wizard = new Wizard();
            Character archer = new Archer();

            //
            System.out.println("Knight:");
            knight.attack();
            knight.defend();

            System.out.println("\nWizard:");
            wizard.attack();
            wizard.defend();

            System.out.println("\nArcher:");
            archer.attack();
            archer.defend();
        } catch (Exception e) {
            System.out.println("Unexpected error in game: " + e.getMessage());
        }
    }
}
