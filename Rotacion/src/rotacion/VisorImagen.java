package rotacion;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

public class VisorImagen extends JFrame {

    private JTextField angulo = new JTextField(5);
    private JTextField zoom1 = new JTextField(5);
    private JTextField zoom2 = new JTextField(5);
    private JButton girar = new JButton("Girar angulo");
    private JButton zoom = new JButton("Zoom");
    private JLabel cuadro = new JLabel();
    private JLabel cuadro2 = new JLabel();
    private JLabel cuadro3 = new JLabel();
    private JMenu archivo = new JMenu("Archivo");
    private JMenuBar menu = new JMenuBar();
    private JMenuItem abrir;
    private JFileChooser elijeImagen;
    private BufferedImage imagen;
    private int ancho;
    private int alto;
    private Container contenedor;
    // on-screen view

    public static void main(String args[]) {
        JFrame jFrame = new VisorImagen();
        jFrame.setVisible(true);
    }

    public VisorImagen() {
        super("Rotacion ProcImagenes");
        OpcionesFoto();
        manejaImagenes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    private void OpcionesFoto() {
        girar.setEnabled(false);
        JPanel opciones = new JPanel();
        opciones.add(girar);
        opciones.add(angulo);
        opciones.add(zoom);
        opciones.add(zoom1);
        opciones.add(zoom2);
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panelSuperior.add(opciones);
        panelSuperior.setBackground(SystemColor.control);
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(new JScrollPane(cuadro), BorderLayout.CENTER);
        contenedor.add(panelSuperior, BorderLayout.NORTH);
        abrir = new JMenuItem("Abrir");
        archivo.add(abrir);
        menu.add(archivo);
        setJMenuBar(menu);
    }

    public void iCono(Image image) {
        cuadro.setHorizontalAlignment(JLabel.CENTER);
        cuadro.setVerticalAlignment(JLabel.CENTER);
        cuadro.setIcon(new ImageIcon(image));
    }

    private void manejaImagenes() {


        zoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int d1 = Integer.parseInt(zoom1.getText());
                int d2 = Integer.parseInt(zoom2.getText());

                escalar(imagen, BufferedImage.TYPE_INT_RGB, d1, d2);

            }
        });

        girar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(angulo.getText());
                rotarImagen(imagen, d);


            }
        });


        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent abierto) {
                elijeImagen = new JFileChooser();
                elijeImagen.setCurrentDirectory(new File("."));

                elijeImagen.setFileFilter(new javax.swing.filechooser.FileFilter() {
                    @Override
                    public boolean accept(File f) {
                        String nombre = f.getName();
                        if (nombre.toLowerCase().endsWith(".jpg")
                                || nombre.toLowerCase().endsWith(".jpeg")
                                || nombre.toLowerCase().endsWith(".gif")
                                || nombre.toLowerCase().endsWith(".png")
                                || f.isDirectory()) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    @Override
                    public String getDescription() {
                        return "Solo cargar imagenes";
                    }
                });

                int escoje = elijeImagen.showOpenDialog(contenedor);

                if (escoje == JFileChooser.APPROVE_OPTION) {
                    String name = elijeImagen.getSelectedFile().getPath();
                    cargarImagen(name);
                }
            }
        });
    }

    private void cargarImagen(String arch) {
        girar.setEnabled(true);
        try {
            imagen = ImageIO.read(new File(arch));
            ancho = imagen.getWidth(null);
            alto = imagen.getHeight(null);
            int enAncho = this.getWidth();
            int enAlto = this.getWidth();
            if (ancho > enAncho) {
                ancho = enAncho;
            }
            if (alto > enAlto) {
                alto = enAlto;
            }
        } catch (IOException ioex) {
            System.out.println("No se pudo cargar: \"" + arch + "\"");
            System.exit(-1);
        }
        iCono(imagen);
    }

    public static void escalar(BufferedImage imagen, int tipo,
            int nuevoAncho, int nuevoAlto) {
        double radio = (double) nuevoAncho / (double) nuevoAlto;
        int ancho = imagen.getWidth(null);
        int alto = imagen.getHeight(null);
        double aspecto = (double) ancho / (double) alto;

        if (radio < aspecto) {
            nuevoAlto = (int) (nuevoAncho / aspecto);
        } else {
            nuevoAncho = (int) (nuevoAlto * aspecto);
        }

        BufferedImage nuevaImagen = new BufferedImage(nuevoAncho, nuevoAlto,
                tipo);
        Graphics2D graphics2D = nuevaImagen.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(imagen, 0, 0, nuevoAncho, nuevoAlto, null);


        ImageIcon icon = new ImageIcon(nuevaImagen);
        JFrame frame;
        frame = new JFrame();
        frame.setContentPane(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }

    public static void rotarImagen(BufferedImage img, double ang) {
        int ancho = img.getWidth();
        int alto = img.getHeight();
        BufferedImage img1 = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < ancho; x++) {
            for (int y = 0; y < alto; y++) {
                img1.setRGB(x, y, (img.getRGB(x, y)));
            }
        }

        double angulo = Math.toRadians(ang);
        double sen = Math.sin(angulo);
        double cos = Math.cos(angulo);
        double x0 = 0.5 * (ancho - 1);
        double y0 = 0.5 * (alto - 1);

        BufferedImage img2 = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < ancho; x++) {
            for (int y = 0; y < alto; y++) {
                double a = x - x0;
                double b = y - y0;

                int xx = (int) (+a * cos - b * sen + x0);
                int yy = (int) (+a * sen + b * cos + y0);

                if (xx >= 0 && xx < ancho && yy >= 0 && yy < alto) {
                    img2.setRGB(x, y, (img1.getRGB(xx, yy)));
                }
            }
        }

        ImageIcon icon = new ImageIcon(img2);
        JFrame frame;
        frame = new JFrame();
        frame.setContentPane(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }
}