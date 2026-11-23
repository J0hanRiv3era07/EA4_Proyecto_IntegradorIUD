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

                // Expresión lambda que calcula el descuento
        CalculadoraDescuento calculadora = total -> {
            if (total > 10) {
                return total * 0.85; // 15% de descuento
            }
            return total;            // 0% de descuento
        };


        // Evento del botón
        btnCalcular.addActionListener(e -> {
            try {
                // 1. Obtener el monto
                double monto = Double.parseDouble(txtMonto.getText());
                // 2. Aplicar la lógica lambda
                double montoFinal = calculadora.calcular(monto);
                // 3. Mostrar el resultado
                areaResultado.append("Monto original: $" + monto + "\n");
                areaResultado.append("Monto final: $" + montoFinal + "\n");
            } catch (NumberFormatException ex) {
                areaResultado.append("Error: escribe un número válido.\n");
            }
        });
    }
}