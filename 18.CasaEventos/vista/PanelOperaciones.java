package vista;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel {
    private JButton bAgregarSalon;
    private JButton bPrecioTotal;
    /**
     * 
     */
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        //Crear y agregar boton AgregarNumMesero
        bAgregarSalon = new JButton("Agregar Salon");
        bAgregarSalon.setBounds(10,20,170,20);
        bAgregarSalon.setActionCommand("Agregar Salon");
        this.add(bAgregarSalon);

        //Crear y agregar boton VenderCarro
        bPrecioTotal = new JButton("Precio Salones");
        bPrecioTotal.setBounds(200,20,170,20); 
        bPrecioTotal.setActionCommand("Precio Salones");
        this.add(bPrecioTotal);
          //Borde y titulo del panel
          TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
          borde.setTitleColor(Color.BLUE);
          this.setBorder(borde);
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        bAgregarSalon.addActionListener(pAL);
       bPrecioTotal.addActionListener(pAL);
    }
    
    


}
    

