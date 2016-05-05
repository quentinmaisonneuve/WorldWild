/**
 * Created by swag on 05/05/16.
 */
public class Individu
{
    private int dureeVie;
    private int age;
    private String nom;
    private String prenom;
    private Sexe sexe;
    private int barreVie;
    private int barreVieMax; // 100
    private int ageAdulte; // Hummain = 18, Elfe = 120

    public Individu(int age, int ageAdulte, int barreVie, int barreVieMax, int dureeVie, String nom, String prenom, Sexe sexe)
    {
        this.age = age;
        this.ageAdulte = ageAdulte;
        this.barreVie = barreVie;
        this.barreVieMax = barreVieMax;
        this.dureeVie = dureeVie;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public void setAge(int age)
    {
        this.age = age;
        // Sa barre de point de vie max est calculé en fonction de son age : enfant sa barre monte jusqu'à 100 adulte sa barre de vie ne fait que diminuer jusqu'à atteindre une limite de 26 pt de vie
        if (this.age < this.ageAdulte)
            this.barreVieMax = (int)((float)this.age / this.ageAdulte * 100);
        else
            this.barreVieMax = 100 - (int) ( (float)((this.age > this.dureeVie)?this.dureeVie - this.ageAdulte:(this.age - this.ageAdulte))/this.dureeVie * 100);
    }

    public int getAge() {
        return age;
    }

    public int getAgeAdulte() {
        return ageAdulte;
    }

    public int getBarreVie() {
        return barreVie;
    }

    public int getBarreVieMax() {
        return barreVieMax;
    }

    public int getDureeVie() {
        return dureeVie;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Sexe getSexe() {
        return sexe;
    }
}
