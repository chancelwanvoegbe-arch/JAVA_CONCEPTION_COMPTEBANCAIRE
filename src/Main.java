public class Main {
    public static void main(String[] args) {
        CompteBancaire A = new CompteBancaire("MA-001", "Karim", 1000.0);
        CompteBancaire B = new CompteBancaire("MA-002", "Nadia"); // Solde 0

        System.out.println("1. A retire 300");
        A.retirer(300);

        System.out.println("\n2. B dépose -50");
        B.deposer(-50);

        System.out.println("\n3. A vire 500 vers B");
        A.virerVers(B, 500);

        System.out.println("\n4. B retire 1000");
        B.retirer(1000);

        System.out.println("\n5. B vire 100 vers A");
        B.virerVers(A, 100);

        System.out.println("\n=== ETAT FINAL ===");
        A.afficher();
        B.afficher();
    }
}