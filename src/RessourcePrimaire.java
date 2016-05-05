/**
 * Created by swag on 05/05/16.
 */
public class RessourcePrimaire extends Ressource
{
    private int difficulteExtraction;

    public RessourcePrimaire(int court, String nom, int rarete, int difficulteExtraction)
    {
        super(court, nom, rarete);
        this.difficulteExtraction = difficulteExtraction;
    }

    public int getDifficulteExtraction()
    {
        return difficulteExtraction;
    }

    public void setDifficulteExtraction(int difficulteExtraction) {
        this.difficulteExtraction = difficulteExtraction;
    }
}
