import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<CompteBancaire> Comptes = new ArrayList<>();

        // ajouter des comptes
        Comptes.add(new CompteBancaire(421623, 3000.09, "zakaria ait yahia"));
        Comptes.add(new CompteBancaire(83209, 2000.67, "oussama oussama"));
        Comptes.add(new CompteBancaire(76543, 1000.65, "omar omar"));
        Comptes.add(new CompteBancaire(122398, 5000.00, "adil adil"));

        // supprimer des compte
        if (!Comptes.isEmpty()) {
            Comptes.remove(0);
        }

        for (CompteBancaire compte : Comptes) {
            try {
                compte.retrier(100);
            } catch (SoldeInsuffisantException | CompteInexistantException | FondsInsuffisantsException e) {
                e.toString();
            }
        }


        for (CompteBancaire c1 : Comptes) {
          c1.getSolde();
        }

        try {
            Comptes.get(1).Tsolde(Comptes.get(0), 100.00);
        } catch (CompteInexistantException | SoldeInsuffisantException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
