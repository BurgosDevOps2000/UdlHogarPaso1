
package objetos.adminzoologico;

public class Guepardo extends Felino {
    String color;

    public Guepardo(String color, float tamañoGarras, int velocidad, String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(tamañoGarras, velocidad, habitat, nombreCientifico, altura, largo, peso);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamañoGarras() {
        return tamañoGarras;
    }

    public void setTamañoGarras(float tamañoGarras) {
        this.tamañoGarras = tamañoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\t\t\t== Guepardo ==\n\n" + "=color\t\t" + color +"\n= tama\u00f1oGarras\t" + tamañoGarras+" Cm" + "\n= velocidad\t\t" + velocidad+" Km/h"
                + "\n= habitat\t\t" + habitat + "\n= nombreCientifico\t" + nombreCientifico 
                + "\n= altura\t\t" + altura+" Cm" + "\n= largo\t\t" + largo+" Cm" + "\n= peso\t\t" + peso+" Kg"
                +"\n= el tigre es\t\t"+comer()+"\n= correr\t\t"+correr()+"\n= duerme\t\t"+dormir()+"\n= su comunicaacion es\t"+comunicarse();
    }
    

    @Override
    public String comer() {
        String comer= "Carnivoros";
        return comer;
    }

    @Override
    public String dormir() {
      String dormir= "12 Horas";
      return dormir;
    }

    @Override
    public String correr() {
      String correr="100 Km/h";
      return correr;
    }

    @Override
    public String comunicarse() {
     String comunicarse="Señales olfativas";
     return comunicarse;
    }
    
    
}
