package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.synth.ColorType;

public class PanelEntradaDatos extends JPanel
{
    private JLabel capaSalon;
    private JLabel numPersonas;
    private JTextField tbCapaSalon;
    private JTextField tbnumPersonas;


   public PanelEntradaDatos()
   {

      //Definición del contenedor del panel

      this.setLayout(null);
      this.setBackground(Color.WHITE);

      //Crear y agregar etiqueta Capacidad Salon

      capaSalon = new JLabel("Capacidad del  Salon: ", JLabel.RIGHT);
      capaSalon.setBounds(0,35,140,20);
      this.add(capaSalon);

      // Creación caja de texto para Capacidad Salon
      tbCapaSalon= new JTextField();
      tbCapaSalon.setBounds(170,35,100,20);
      this.add(tbCapaSalon);
      //Crear y agregar etiqueta Numero Personas
      capaSalon = new JLabel("Numero de Personas: ", JLabel.RIGHT);
      capaSalon.setBounds(15,75,140,20);
      this.add(capaSalon);
      // Creación caja de Numero de Personas
      tbCapaSalon= new JTextField();
      tbCapaSalon.setBounds(170,75,100,20);
      this.add(tbCapaSalon);

      //Borde y titulo del panel
      TitledBorder borde = BorderFactory.createTitledBorder("Entradas");
      borde.setTitleColor(Color.BLUE);
      this.setBorder(borde);
   }

   public String getNumPersonas()
   {
      return tbnumPersonas.getText();
   }
   public String getCapacidadSalon()
   {
      return tbCapaSalon.getText();

   }
     

}
    
    


 
   

    
 
