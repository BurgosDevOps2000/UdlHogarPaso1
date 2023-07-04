package objetos.adminzoologico;

public abstract class Canino extends Animales {

    String color;
    float tamañoColmillos;

    public Canino(String color, float tamañoColmillos, String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }

    public float getTamañoColmillos() {
        return tamañoColmillos;
    }

    public void setTamañoColmillos(float tamañoColmillos) {
        this.tamañoColmillos = tamañoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Canino{" + "color=" + color + ", tama\u00f1oColmillos=" + tamañoColmillos + '}';
    }

}
