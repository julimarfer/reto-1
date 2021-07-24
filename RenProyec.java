package reto1;

public class RenProyec
{

    // Atributos
    private int tiempo;
    private double capital;
    private double interes;
    //private int interesCompuesto;
    //private int interesSimple;

    public RenProyec()
    {
        this.tiempo=0;
        this.capital=0.0;
        this.interes=0.0;
    }
    public  RenProyec(Integer cTiempo, Double cCapital, Double cInteres)
    {
        this.tiempo=cTiempo;
        this.capital=cCapital;
        this.interes=cInteres;
    }

    //Metodos

    public double calcularInteresSimple()
    {
        double interesSimple= this.capital * (this.interes/100) * this.tiempo;
        return Math.round(interesSimple);

    }
    public double calcularInteresCompuesto()
    {
        double interesCompuesto= Math.round(this.capital * (Math.pow((1+(this.interes/100)), this.tiempo)-1));
        return interesCompuesto;
    }
    
    public String analisisInversion( int cTiempo, double cCapital, double cInteres)
    {
        this.tiempo=cTiempo;
        this.capital=cCapital;
        this.interes=cInteres;
        double diferencia= calcularInteresCompuesto()-calcularInteresSimple();
        if ( diferencia>0)
        { 
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        } 
        else
        { 
        return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto";}
        }
    public String analisisInversion()
    {
       //this.tiempo=0;
        //this.capital=0.0;
        //this.interes=0.0; 
        double diferencia= calcularInteresCompuesto()-calcularInteresSimple();
        if (diferencia>0)
        { 
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        } 
        else
        { 
        return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
    }
}
