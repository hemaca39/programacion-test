import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraFront extends JFrame implements ActionListener {
    
    private JTextField txtPantallaInput;
    private JLabel lblPantallaHistorial;
    private CalculadoraBack backEnd;
    private boolean inicioDeNumero = true;
    private String operacionActual = "";

    public CalculadoraFront() {
        backEnd = new CalculadoraBack(); // Inicialización correcta para evitar el NullPointerException
        crearVentana();
        inicializarComponentes();
        setVisible(true);
    }

    private void crearVentana() {
        setTitle("Calculadora PR1");
        setSize(360, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8, 8));
        getContentPane().setBackground(new Color(23, 23, 23));
    }

    private void inicializarComponentes() {
        JPanel panelNorte = new JPanel(new GridLayout(2, 1));
        panelNorte.setBackground(new Color(23, 23, 23));

        lblPantallaHistorial = new JLabel("", SwingConstants.RIGHT);
        lblPantallaHistorial.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblPantallaHistorial.setForeground(new Color(150, 150, 150));
        lblPantallaHistorial.setBorder(BorderFactory.createEmptyBorder(5, 10, 0, 10));

        txtPantallaInput = new JTextField("0");
        txtPantallaInput.setFont(new Font("Segoe UI", Font.BOLD, 38));
        txtPantallaInput.setHorizontalAlignment(JTextField.RIGHT);
        txtPantallaInput.setEditable(false);
        txtPantallaInput.setBackground(new Color(30, 30, 30));
        txtPantallaInput.setForeground(Color.WHITE);
        txtPantallaInput.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        panelNorte.add(lblPantallaHistorial);
        panelNorte.add(txtPantallaInput);
        add(panelNorte, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel(new GridLayout(5, 4, 6, 6));
        panelBotones.setBackground(new Color(23, 23, 23));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] matrizBotones = {
            "AC", "<-", "+/-", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "", "="
        };

        for (String item : matrizBotones) {
            if (item.isEmpty()) {
                panelBotones.add(new JLabel(""));
                continue;
            }
            JButton boton = new JButton(item);
            boton.setFont(new Font("Segoe UI", Font.BOLD, 18));
            boton.addActionListener(this);
            darDisenioBoton(boton, item);
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    private void darDisenioBoton(JButton btn, String texto) {
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        
        if (texto.matches("[0-9.]")) {
            btn.setBackground(new Color(45, 45, 45));
            btn.setForeground(Color.WHITE);
        } else if (texto.matches("[+\\-*/=]")) {
            btn.setBackground(new Color(241, 142, 33));
            btn.setForeground(Color.WHITE);
        } else {
            btn.setBackground(new Color(60, 60, 60));
            btn.setForeground(Color.WHITE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputComando = e.getActionCommand();
        String textoEnPantalla = txtPantallaInput.getText().trim();

        if (textoEnPantalla.isEmpty()) {
            textoEnPantalla = "0";
        }

        try {
            if (inputComando.matches("[0-9]")) {
                if (inicioDeNumero || textoEnPantalla.equals("0")) {
                    txtPantallaInput.setText(inputComando);
                    inicioDeNumero = false;
                } else {
                    txtPantallaInput.setText(textoEnPantalla + inputComando);
                }
                backEnd.setEsNuevoNumero(false);
                
            } else if (inputComando.equals(".")) {
                if (!textoEnPantalla.contains(".")) {
                    txtPantallaInput.setText(textoEnPantalla + ".");
                    inicioDeNumero = false;
                }
            } else if (inputComando.equals("AC")) {
                backEnd.reiniciar();
                txtPantallaInput.setText("0");
                lblPantallaHistorial.setText("");
                operacionActual = "";
                inicioDeNumero = true;
                
            } else if (inputComando.equals("<-")) {
                if (textoEnPantalla.length() > 1) {
                    txtPantallaInput.setText(textoEnPantalla.substring(0, textoEnPantalla.length() - 1));
                } else {
                    txtPantallaInput.setText("0");
                    inicioDeNumero = true;
                }
                
            } else if (inputComando.equals("+/-")) {
                double valorNum = Double.parseDouble(textoEnPantalla);
                if (valorNum != 0) {
                    valorNum = valorNum * -1;
                    txtPantallaInput.setText(valorNum == (long) valorNum ? String.format("%d", (long) valorNum) : String.valueOf(valorNum));
                }
                
            } else if (inputComando.matches("[+\\-*/=]")) {
                double numeroProcesable = Double.parseDouble(textoEnPantalla);
                
                if (inputComando.equals("=")) {
                    String resultadoFinal = backEnd.procesarOperacion(numeroProcesable, "=");
                    lblPantallaHistorial.setText(lblPantallaHistorial.getText() + " " + textoEnPantalla + " =");
                    txtPantallaInput.setText(resultadoFinal);
                } else {
                    operacionActual = inputComando;
                    String resultadoIntermedio = backEnd.procesarOperacion(numeroProcesable, operacionActual);
                    lblPantallaHistorial.setText(resultadoIntermedio + " " + operacionActual);
                    txtPantallaInput.setText(resultadoIntermedio);
                }
                inicioDeNumero = true;
            }
        } catch (ArithmeticException ex) {
            txtPantallaInput.setText("Error: Div / 0");
            lblPantallaHistorial.setText("");
            inicioDeNumero = true;
            backEnd.reiniciar();
        } catch (Exception ex) {
            txtPantallaInput.setText("Error");
            inicioDeNumero = true;
        }
    }

    public static void main(String[] args) {
        new CalculadoraFront();
    }
}