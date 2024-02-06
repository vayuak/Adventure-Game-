import java.util.Scanner;

public class EnhancedAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You're in a futuristic city...");
        System.out.println("To your left, a high-tech lab; right, an ancient library; ahead, a cyberpunk marketplace.");
        System.out.println("Where to? (left/right/straight)");

        String choice = scanner.nextLine();

        switch (choice.toLowerCase()) {
            case "left":
                exploreHighTechLab();
                break;
            case "right":
                exploreAncientLibrary();
                break;
            case "straight":
                visitCyberpunkMarket();
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public static void exploreHighTechLab() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enter the high-tech lab...");
        System.out.println("Find gadgets, cutting-edge tech.");
        System.out.println("Experiment with a new gadget? (yes/no)");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            experimentWithGadget();
        } else {
            System.out.println("You decide not to experiment. Game Over!");
        }
    }

    public static void experimentWithGadget() {
        System.out.println("You experiment with a gadget...");
        System.out.println("Discover hidden features, gain special abilities!");
        System.out.println("Congratulations, you unlocked powers and won!");
    }

    public static void exploreAncientLibrary() {
        System.out.println("Step into the ancient library...");
        System.out.println("Find ancient scrolls, mysterious texts.");
        System.out.println("Decipher secret code, unveil forgotten prophecy!");
        System.out.println("Congratulations, you decoded the prophecy and won!");
    }

    public static void visitCyberpunkMarket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Explore the cyberpunk marketplace...");
        System.out.println("Spot an AI-powered phone booth.");
        System.out.println("AI challenges you to a virtual sports game. Accept? (yes/no)");
        
        String answer = scanner.nextLine();
        
        if (answer.equalsIgnoreCase("yes")) {
            playVirtualSportsGame();
        } else {
            System.out.println("You decline the challenge. Game Over!");
        }
    }

    public static void playVirtualSportsGame() {
        System.out.println("Accept the AI's challenge...");
        System.out.println("In a thrilling virtual sports match, emerge victorious!");
        System.out.println("Congratulations, you won the game and emerged triumphant!");
    }
}