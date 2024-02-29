public class CompteCourant extends CompteBancaire{

    double decouvertAuthorise;
    public CompteCourant(int nCompte, double solde, String nTitulaire, double decouvertAuthorise) {
        super(nCompte, solde, nTitulaire);
        this.decouvertAuthorise = decouvertAuthorise;
    }

    @Override
    public void retrier(double rSolde) throws FondsInsuffisantsException, SoldeInsuffisantException {
        if((solde - rSolde) < -decouvertAuthorise) {
           throw new FondsInsuffisantsException("Fonds insuffisant !!");
       }
       solde -= rSolde;
    }


    @Override
    public void Tsolde(CompteBancaire nCompteDestination, double montant) throws CompteInexistantException, SoldeInsuffisantException {
        if(nCompteDestination == null) {
            throw new CompteInexistantException("le compte n'existe pas !!");
        }
        this.solde = solde - montant;
        nCompteDestination.solde += montant;
        System.out.println("le montant " + montant + " a ete transferer vers " + nCompteDestination.nCompte);
    }

}
