public class CompteEpargne extends CompteBancaire{
    double tauxInteret;

    public CompteEpargne(int nCompte, double solde, String nTitulaire, double tauxInteret) {
        super(nCompte, solde, nTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void addInteret(double tauxInteret) {
        solde = solde * (1 + tauxInteret);
    }
}
