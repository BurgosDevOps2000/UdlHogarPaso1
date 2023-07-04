
package objetos.adminzoologico;

public abstract class Animales {
String habitat;
String nombreCientifico;
double altura;
double largo;
double peso;

    public Animales(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "habitat\t\t\t" + habitat + "\nnombreCientifico\t" + nombreCientifico + "\naltura\t\t\t" + altura + "\nlargo\t\t\t" + largo + "\npeso\t\t\t" + peso;
    }
    
       public abstract String comer(); 
       public abstract String dormir(); 
       public abstract String correr(); 
       public abstract String comunicarse(); 

}
