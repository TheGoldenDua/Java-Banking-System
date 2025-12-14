
public class Compte
{
    private double solde;
    private Client proprietair;
    private int numero;

    private static int cpt = 0;

    public Compte(double solde, Client proprietaire)
    {
        cpt++;
        this.solde = solde;
        this.numero = cpt;
        this.proprietair = proprietaire;
    }

    public static String nbr_Comptes()
    {
        return "Nombre de comptes cree est : " + cpt;
    }

    public void afficher()
    {
        System.out.println("Proprietaire de compte numero: " + this.numero);
        this.proprietair.afficher();
        System.out.println("Solde du compte: " + this.solde + "DHs");
    }

    public void deposer(double montant)
    {
        this.solde += montant;
    }

    public void retirer(double montant)
    {
        this.solde -= montant;
    }

    public void transferVers(double montant, Compte c)
    {
        this.retirer(montant);
        c.deposer(montant);
    }

    public double differenceSoldes(Compte c)
    {
        return Math.abs(this.solde - c.solde);
    }

    public void compareSoldes(Compte c)
    {
        if(this.solde > c.solde)
            System.out.println("le solde de compte numero: " +this.numero+ "> a le solde de compte numero" +c.numero);
        else if(this.solde < c.solde)
            System.out.println("le solde de compte numero: " +this.numero+ "< a le solde de compte numero" +c.numero);
        else
            System.out.println("le solde de compte numero: " +this.numero+ "= a le solde de compte numero" +c.numero); 
    }

    public static void permuterComptes(Compte c1, Compte c2)
    {
        double tmp = c1.solde;
        c1.solde = c2.solde;
        c2.solde = tmp;

        Client tmp2 = c1.proprietair;
        c1.proprietair = c2.proprietair;
        c2.proprietair = tmp2;
    }
}
