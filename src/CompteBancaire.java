public class CompteBancaire {
    private String numero;
    private String titulaire;
    private double solde;


    public CompteBancaire(String numero, String titulaire, double soldeInitial) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }


    public CompteBancaire(String numero, String titulaire) {
        this(numero, titulaire, 0.0);
    }

    public void deposer(double montant) {
        if (montant <= 0) {
            System.out.println("Refusé : le montant déposé doit être positif.");
        } else {
            this.solde += montant;
            System.out.println("Dépôt de " + montant + " DH effectué avec succès.");
        }
    }

    public boolean retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Refusé : le montant retiré doit être positif.");
            return false;
        }
        if (this.solde < montant) {
            System.out.println("Refusé : Solde insuffisant.");
            return false;
        }
        this.solde -= montant;
        System.out.println("Retrait de " + montant + " DH effectué.");
        return true;
    }

    public void virerVers(CompteBancaire destinataire, double montant) {

        if (this.retirer(montant)) {
            destinataire.deposer(montant);
            System.out.println("Virement de " + montant + " DH effectué vers " + destinataire.titulaire);
        } else {
            System.out.println("Virement annulé.");
        }
    }

    public void afficher() {
        System.out.println("--- Compte " + numero + " ---");
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Solde     : " + solde + " DH");
    }
}