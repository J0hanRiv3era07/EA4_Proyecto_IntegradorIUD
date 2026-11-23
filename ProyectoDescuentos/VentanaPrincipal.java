package ProyectoDescuentos;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JTextField txtMonto;
    private JButton btnCalcular;
    private JTextArea areaResultado;

    public VentanaPrincipal() {
        setTitle("Calculadora de Descuentos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));

        // Parte de arriba: monto y botón
        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Monto total:"));
        txtMonto = new JTextField(10);
        panelSuperior.add(txtMonto);
        btnCalcular = new JButton("Calcular Descuento");
        panelSuperior.add(btnCalcular);

        // Parte central: resultados
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);

        panel.add(panelSuperior, BorderLayout.NORTH);
        panel.add(new JScrollPane(areaResultado), BorderLayout.CENTER);
        add(panel);

        // Evento del botón (por ahora solo prueba)
        btnCalcular.addActionListener(e -> {
            areaResultado.append("Botón presionado\n");
        });
    }
}