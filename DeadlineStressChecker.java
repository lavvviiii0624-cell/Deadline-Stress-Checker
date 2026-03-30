import java.util.Scanner;

class DeadlineStressChecker {

    int daysLeft;
    int workDone;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days left for deadline: ");
        daysLeft = sc.nextInt();

        System.out.print("Enter work completed (percentage): ");
        workDone = sc.nextInt();
    }

    void analyzeStress() {

        System.out.println("\n--- Stress Analysis Report ---");

        if(daysLeft > 5 && workDone >= 50) {
            System.out.println("Stress Level: LOW ✅");
            System.out.println("Status: You are on track.");
        }
        else if(daysLeft <= 5 && workDone >= 50) {
            System.out.println("Stress Level: MEDIUM ⚠");
            System.out.println("Status: Work consistently.");
        }
        else {
            System.out.println("Stress Level: HIGH ❗");
            System.out.println("Status: Focus immediately on assignment!");
        }
    }

    public static void main(String[] args) {
        DeadlineStressChecker obj = new DeadlineStressChecker();
        obj.getInput();
        obj.analyzeStress();
    }
}
