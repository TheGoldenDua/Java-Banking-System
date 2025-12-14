
public class TestCompte 
{
    public static void main(String[] args)
    {
        Client cl1 = new Client("Alami", "AB344556");
        Client cl2 = new Client("Bennani", "CD233445");

        Compte cp1 = new Compte(1000, cl1);
        Compte cp2 = new Compte(2000, cl2);

        System.out.println(">> Depot de 2000 sur cp1 et Retrait de 500 sur cp2");
        cp1.deposer(2000);
        cp2.retirer(500);

        System.out.println(">> Transfert de 200 DH de cp1 vers cp2");
        cp1.transferVers(200, cp2);

        System.out.println("--- APRES OPERATIONS ---");
        cp1.afficher();
        cp2.afficher();

        System.out.println("la difference entre ces 2 soldes est:" + cp1.differenceSoldes(cp2) + "DHs");
        cp1.compareSoldes(cp2);

        System.out.println(">> Permutation des comptes...");
        Compte.permuterComptes(cp1, cp2);

        System.out.println("--- APRES PERMUTATION ---");
        cp1.afficher();
        cp2.afficher();

        System.out.println(Compte.nbr_Comptes());
    }
}
