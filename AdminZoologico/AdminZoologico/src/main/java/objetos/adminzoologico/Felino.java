
package objetos.adminzoologico;

public abstract class Felino extends Animales{
    float tamañoGarras;
    int velocidad;

    public Felino(float tamañoGarras, int velocidad, String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.tamañoGarras = tamañoGarras;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getTamañoGarras() {
        return tamañoGarras;
    }

    public void setTamañoGarras(float tamañoGarras) {
        this.tamañoGarras = tamañoGarras;
    }

    @Override
    public String toString() {
        return "Felino{" + "tama\u00f1oGarras=" + tamañoGarras + ", velocidad=" + velocidad + '}';
    }
    
    
}
