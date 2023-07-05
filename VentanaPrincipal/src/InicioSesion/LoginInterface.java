package InicioSesion;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoginInterface extends JFrame {

    private JPanel mainPanel;
    private JPanel loginPanel;
    private JPanel imagePanel;
    private JTextField usernameField;
    private JPasswordField passwordField;

    private List<String> imagePaths; // Lista de rutas de imágenes

    public LoginInterface() {
        super("Inicio de sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar la lista de rutas de imágenes
        imagePaths = new ArrayList<>();
        imagePaths.add("src/imagenes/LoginInterface/imagen_1.jpg");
        imagePaths.add("src/imagenes/LoginInterface/imagen_2.jpg");
        imagePaths.add("src/imagenes/LoginInterface/imagen_3.jpg");
        // Agrega más rutas de imágenes si lo deseas

        // Crear el panel principal
        mainPanel = new JPanel(new BorderLayout());

        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Crear el panel de inicio de sesión
        loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBounds(0, 0, screenWidth, 20);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espacios entre los componentes

        JLabel nameappLabel = new JLabel("Hogar de paso");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        loginPanel.add(nameappLabel, gbc);


        JLabel usernameLabel = new JLabel("Usuario:");
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        loginPanel.add(usernameLabel, gbc);


        usernameField = new JTextField();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        loginPanel.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Contraseña:");
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        loginPanel.add(passwordLabel, gbc);

        passwordField = new JPasswordField();
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        loginPanel.add(passwordField, gbc);

        // Crear el panel de imagen
        imagePanel = new JPanel();
        imagePanel.setBounds(getBounds());
        JLabel imageLabel = new JLabel();
        imagePanel.add(imageLabel);

// Obtener una imagen aleatoria de la lista de rutas de imágenes
        Random random = new Random();
        int randomIndex = random.nextInt(imagePaths.size());
        String randomImagePath = imagePaths.get(randomIndex);
        ImageIcon image = new ImageIcon(randomImagePath);

// Ajustar el tamaño de los paneles internos
        int loginPanelWidth = screenWidth / 2;
        int imagePanelWidth = screenWidth - loginPanelWidth;
        loginPanel.setPreferredSize(new Dimension(loginPanelWidth, screenHeight));
        imagePanel.setPreferredSize(new Dimension(imagePanelWidth, screenHeight));

// Ajustar el tamaño de la imagen para que ocupe todo el espacio del panel
        Image scaledImage = image.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        imageLabel.setIcon(scaledIcon);



        // Agregar los paneles al panel principal
        mainPanel.add(loginPanel);
        mainPanel.add(imagePanel);

        // Agregar el panel principal al JFrame
        getContentPane().add(mainPanel);

        // Mostrar la ventana
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface();
            }
        });
    }
}
