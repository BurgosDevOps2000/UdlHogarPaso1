package objetos.adminzoologico;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(int numCamada, String especieLobo, String color, float tamañoColmillos, 
            String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(color, tamañoColmillos, habitat, nombreCientifico, altura, largo, peso);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    @Override
    public String toString() {
        return "\t\t\t== Lobo ==\n\n"+"=numCamada\t\t" + numCamada + "\n=especieLobo\t\t" + especieLobo +"\n=Color\t\t"+color+"\n= tama\u00f1Colmillos\t" +tamañoColmillos+" Cm"
                + "\n= habitat\t\t" + habitat + "\n= nombreCientifico\t" + nombreCientifico 
                + "\n= altura\t\t" + altura+" Cm" + "\n= largo\t\t" + largo+" Cm" + "\n= peso\t\t" + peso+" Kg"
                +"\n= el tigre es\t\t"+comer()+"\n= duerme\t\t"+dormir()+"\n= su comunicaacion es\t"+comunicarse();
    }

    @Override
    public String comer() {
        String comer = "carnivoro";
        return comer;
    }

    @Override
    public String dormir() {
        String dormir = "16 Horas";
        return dormir;
    }

    @Override
    public String correr() {
        String correr = "60 Km/h";
        return correr;
    }

    @Override
    public String comunicarse() {
        String comunicarse= "Gruñido";
        return comunicarse;
    }

}
