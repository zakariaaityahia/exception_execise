public class CompteBancaire {
    int nCompte;
    double solde;
    String nTitulaire;

    public CompteBancaire(int nCompte, double solde, String nTitulaire) {
        this.nCompte = nCompte;
        this.solde = solde;
        this.nTitulaire = nTitulaire;
    }

    public int getnCompte() {
        return nCompte;
    }

    public void setnCompte(int nCompte) {
        this.nCompte = nCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getnTitulaire() {
        return nTitulaire;
    }

    public void setnTitulaire(String nTitulaire) {
        this.nTitulaire = nTitulaire;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "nCompte=" + nCompte +
                ", solde=" + solde +
                ", nTitulaire='" + nTitulaire + '\'' +
                '}';
    }

    // deposer le solde
    public void DeposerSolde(double dSolde) {
         solde += dSolde;
    }

    // retraire d'un solde
    public void retrier(double rSolde) throws CompteInexistantException, SoldeInsuffisantException, FondsInsuffisantsException {
        if((rSolde - solde ) > 0) throw new SoldeInsuffisantException("sold Insuffisant !!");
    }

    // affichage de solde
    public void aSolde(){
        System.out.println("le solde est : " + getSolde());
    }

    // transfer d'un solde vers un autre compte

    public void Tsolde(CompteBancaire nCompteDestination, double montant) throws CompteInexistantException, SoldeInsuffisantException{
        if (montant > solde)  {
            throw new SoldeInsuffisantException("le solde insuffisant !!");
        }
        this.solde -= montant;
        nCompteDestination.solde += montant;

        System.out.println(montant + " has been transfered success from " + this.nCompte + " into " + nCompteDestination);
    }




}
