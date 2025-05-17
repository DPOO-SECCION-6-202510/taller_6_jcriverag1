package uniandes.dpoo.swing.interfaz.mapa;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;

import javax.swing.JPanel;


import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelMapaVisualizar extends JPanel
{
    /**
     * La etiqueta donde se dibuja el mapa y se hacen las señales de los restaurantes
     */

    /**
     * La lista de restaurantes que se están dibujando en el mapa
     */
    private List<Restaurante> restaurantes;
    private Image imagenMapa;

    public PanelMapaVisualizar()
    {
        // Cargar imagen del mapa al iniciar
        this.imagenMapa = new ImageIcon("./imagenes/mapa.png").getImage();
    }

    @Override
    protected void paintComponent(Graphics graphic) {
        super.paintComponent(graphic);

        graphic.drawImage(imagenMapa, 0, 0, getWidth(), getHeight(), this);

        Graphics2D g2d = (Graphics2D) graphic;
        g2d.setColor(Color.red);

        if (restaurantes != null) {
            for (Restaurante e : restaurantes) {
                int x = e.getX();
                int y = e.getY();
                g2d.fillOval(x - 5, y - 5, 10, 10); // centrado
                g2d.drawString(e.getNombre(), x + 10, y);
            }
        }
    }
    
    public java.awt.Dimension getPreferredSize() {
        return new java.awt.Dimension(450, 500);
    }

    public void actualizarMapa(List<Restaurante> nuevosRestaurantes)
    {
        this.restaurantes = nuevosRestaurantes;
        repaint();
    }
}
