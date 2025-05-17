package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	setLayout(new GridLayout(3,1));
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	JPanel nombre = new JPanel(new FlowLayout());
    	JLabel labNombre = new JLabel("Nombre: ");
    	txtNombre = new JTextField(30);
    	nombre.add(labNombre);
    	nombre.add(txtNombre);
    	
        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	JPanel calificacion = new JPanel(new FlowLayout());
    	JLabel labCalificacion = new JLabel("Calificacion");
    	cbbCalificacion = new JComboBox<>();
    	for (int i = 1; i <= 5; i++) {
            cbbCalificacion.addItem(String.valueOf(i));
        }
        calificacion.add(labCalificacion);
        calificacion.add(cbbCalificacion);
    	

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
        JPanel visitado = new JPanel(new FlowLayout());
        JLabel labVisitado = new JLabel("Visitado: ");
        cbbVisitado = new JComboBox<>();
        cbbVisitado.addItem("Si");
        cbbVisitado.addItem("No");
        visitado.add(labVisitado);
        visitado.add(cbbVisitado);
        

        // Agregar todos los elementos al panel
        // TODO completar
        add(nombre);
        add(calificacion);
        add(visitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
    	return cbbVisitado.getSelectedItem().equals("Si");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
    	return Integer.parseInt((String) cbbCalificacion.getSelectedItem());
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
        return txtNombre.getText();
        
    }
}
