/**
 * Created by swag on 05/05/16.
 */
public class Test
{
    public static void main(String args[])
    {
        Individu i = new Individu(15,18, 100,100,70,"Gérard","Dupont",Sexe.FEMME);

        i.setAge(99);//455
        System.out.println(i.getBarreVieMax());
    }
}
