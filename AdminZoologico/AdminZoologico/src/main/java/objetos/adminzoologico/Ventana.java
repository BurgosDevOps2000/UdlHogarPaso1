
package objetos.adminzoologico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ventana extends JFrame implements ActionListener {

    private JButton botonMostrar;
    private JTextArea areaTextoAnimales;
    private JLabel etiquetaTitulo;

    private List<Animal> listaAnimales;

    public Ventana() {
        setTitle("Administracion Zoologico");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        iniciarComponentes();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mostrarInformacionAnimales();
        botonMostrar.setEnabled(false);
    }

    private void iniciarComponentes() {
        JPanel panelBotones = new JPanel();
        add(panelBotones, BorderLayout.SOUTH);

        botonMostrar = new JButton("MOSTRAR");
        botonMostrar.addActionListener(this);
        panelBotones.add(botonMostrar);

        etiquetaTitulo = new JLabel("Administracion Zoologico");
        etiquetaTitulo.setForeground(Color.MAGENTA);
        etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(etiquetaTitulo, BorderLayout.NORTH);

        areaTextoAnimales = new JTextArea();
        areaTextoAnimales.setEditable(false);
        areaTextoAnimales.setLineWrap(true);
        areaTextoAnimales.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(areaTextoAnimales, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        listaAnimales = new ArrayList<>();
        listaAnimales.add(new Tigre("bengala", 10, 80, "selva", "phantera tigris", 120, 210, 190));
        listaAnimales.add(new Leon(10, 240, 10, 80, "Selva", "Phantera Leo", 120, 240, 190));
        listaAnimales.add(new Guepardo("Amarillo", 8, 100, "Selva", "Acinonyx jubatus", 120, 180, 60));
        listaAnimales.add(new Lobo(10, "Lobo Siberiano", "Blanco y gris", 5, "Polo Norte", "Canis Lupus", 120, 140, 50));
        listaAnimales.add(new Perro(195, "negro", 5, "Selva", "Speothos venaticus", 62, 80, 6));
    }

    private void mostrarInformacionAnimales() {
        for (Animal animal : listaAnimales) {
            areaTextoAnimales.append(String.format("%s%n%n", animal.toString()));
        }
    }
}
```