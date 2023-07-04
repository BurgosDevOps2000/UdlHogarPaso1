
package objetos.adminzoologico;

public class Leon extends Felino {
 private int numManada;
 private float potnciaRugidoDecibel;

    public Leon(int numManada, float potnciaRugidoDecibel, float tamañoGarras, int velocidad, String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(tamañoGarras, velocidad, habitat, nombreCientifico, altura, largo, peso);
        this.numManada = numManada;
        this.potnciaRugidoDecibel = potnciaRugidoDecibel;
    }

    public float getPotnciaRugidoDecibel() {
        return potnciaRugidoDecibel;
    }

    public void setPotnciaRugidoDecibel(float potnciaRugidoDecibel) {
        this.potnciaRugidoDecibel = potnciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public void setNumManada(int numManada) {
        this.numManada = numManada;
    }

 @Override
    public String toString() {
        return "\t== Leon ==\n\n"+"numManada\t\t" + numManada + "\npotnciaRugidoDecibel\t" + potnciaRugidoDecibel+" Hz" 
                +"\n= tama\u00f1oGarras\t" + tamañoGarras+" Cm" + "\n= velocidad\t\t" + velocidad+" Km/h"
                + "\n= habitat\t\t" + habitat + "\n= nombreCientifico\t" + nombreCientifico 
                + "\n= altura\t\t" + altura+" Cm" + "\n= largo\t\t" + largo+" Cm" + "\n= peso\t\t" + peso+" Kg"
                +"\n= el Leon es\t\t"+comer()+"\n= duerme\t\t"+dormir()+"\n= su comunicaacion es\t"+comunicarse();
    }

    @Override
    public String comer() {
      String comer= "Carnivoro";
      return comer;
    }

    @Override
    public String dormir() {
       String dormir= "20 Horas";
       return dormir;
    }

    @Override
    public String correr() {
      String correr="80 Km/h";
      return correr;
    }

    @Override
    public String comunicarse() {
       String comunicarse= "Rugido";
       return comunicarse;
    }
    
 
}
