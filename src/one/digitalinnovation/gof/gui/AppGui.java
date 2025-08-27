package one.digitalinnovation.gof.gui;

import javax.swing.*;
import java.awt.*;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;

public class AppGui {

    private static JTextArea outputArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Padrões de Projeto - DIO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Área de texto para mostrar saídas
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Painel com botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        JButton btnSingleton = new JButton("Testar Singleton");
        JButton btnStrategy = new JButton("Testar Strategy");
        JButton btnFacade = new JButton("Testar Facade");

        panel.add(btnSingleton);
        panel.add(btnStrategy);
        panel.add(btnFacade);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Ações dos botões
        btnSingleton.addActionListener(e -> appendMessage("Chamando Singleton...\n" + SingletonLazyHolder.getInstance().toString()));
        btnStrategy.addActionListener(e -> appendMessage("Chamando Strategy...\n(Aqui vai o código futuramente)"));
        btnFacade.addActionListener(e -> appendMessage("Chamando Facade...\n(Aqui vai o código futuramente)"));

        frame.setVisible(true);
    }

    private static void appendMessage(String message) {
        outputArea.append(message + "\n\n");
    }
}
