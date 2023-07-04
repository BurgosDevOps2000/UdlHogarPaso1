
package objetos.adminzoologico;

public class Perro extends Canino {
private int fuerzMordida;    

    public Perro(int fuerzMordida, String color, float tamañoColmillos, String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(color, tamañoColmillos, habitat, nombreCientifico, altura, largo, peso);
        this.fuerzMordida = fuerzMordida;
    }

    public int getFuerzMordida() {
        return fuerzMordida;
    }

    public void setFuerzMordida(int fuerzMordida) {
        this.fuerzMordida = fuerzMordida;
    }

    @Override
    public String toString() {
        return "\t\t\t== Perro ==\n\n" + "=fuerzMordida\t\t" + fuerzMordida+" PSI" +"\n=Color\t\t"+color+"\n= tama\u00f1Colmillos\t" +tamañoColmillos+" Cm"
                + "\n= habitat\t\t" + habitat + "\n= nombreCientifico\t" + nombreCientifico 
                + "\n= altura\t\t" + altura+" Cm" + "\n= largo\t\t" + largo+" Cm" + "\n= peso\t\t" + peso+" Kg"
                +"\n= el tigre es\t\t"+comer()+"\n= duerme\t\t"+dormir()+"\n= su comunicaacion es\t"+comunicarse();
    }

    @Override
    public String comer() {
       String comer="Carnivoro";
       return comer;
    }

    @Override
    public String dormir() {
        String dormir= "10 Horas";
        return dormir;
    }

    @Override
    public String correr() {
        String correr= "40 Km/h";
        return correr;
    }

    @Override
    public String comunicarse() {
       String comunicarse="olfato, oido, señales visuales";
       return comunicarse;
    }


}
