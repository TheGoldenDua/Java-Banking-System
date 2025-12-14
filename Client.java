
public class Client 
{
    private String nom;
    private String cin;

    public Client(String nom, String cin)
    {
        this.nom = nom;
        this.cin= cin;
    }

    public void afficher()
    {
        System.out.println("Client:" +this.nom+ "(CIN: " + this.cin + ")");
    }

    public String getNom()
    {
        return nom;
    }

    public String getCin()
    {
        return cin;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setCin(String cin)
    {
        this.cin = cin;
    }

}