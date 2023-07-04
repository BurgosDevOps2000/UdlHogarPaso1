package objetos.adminzoologico;

import objetos.adminzoologico.Felino;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String especieTigre, float tamañoGarras, int velocidad, String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(tamañoGarras, velocidad, habitat, nombreCientifico, altura, largo, peso);
        this.especieTigre = especieTigre;
    }
   

    public String getEspecieTigre() {
        
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String toString() {
        return "\t== Tigre == \n\n"+"= especieTigre\t\t" + especieTigre 
                +"\n= tama\u00f1oGarras\t" + tamañoGarras+" Cm" + "\n= velocidad\t\t" + velocidad+" Km/h"
                + "\n= habitat\t\t" + habitat + "\n= nombreCientifico\t" + nombreCientifico 
                + "\n= altura\t\t" + altura+" Cm" + "\n= largo\t\t" + largo+" Cm" + "\n= peso\t\t" + peso+" Kg"
                +"\n= el tigre es\t\t"+comer()+"\n= duerme\t\t"+dormir()+"\n= su comunicaacion es\t"+comunicarse();
    }

    @Override
    public String comer() {
        String comer = "Carnivoro";
        
        return comer;
    }

    @Override
    public String dormir() {
        String dormir = "16 Horas";
        return dormir;
    }

    @Override
    public String correr() {
       String correr="60 Km/h";
        return correr;
    }

    @Override
    public String comunicarse() {
        String comunicarse = "Rugidos";
        return comunicarse;
    }
    
}
