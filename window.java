
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class window {
    public static void main(String[] args) {
        int windowX = 500, windowY = 600;
        int centerX = windowX/2;
       
       
        JFrame window = new JFrame(); //cria a janela
       
        JButton btn = new JButton("Enviar ->"); //cria um botao
        JLabel label = new JLabel("LOGIN"); //cria uma label
        JLabel userLabel = new JLabel("Usuario:"); //cria uma label
        JLabel passwordLabel = new JLabel("Senha"); //cria uma label
        JTextField nameInput = new JTextField();
        JTextField passwordInput = new JTextField();
       
        window.setVisible(true);//define a jalena como visivel
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//define que p programa acaba quando clica no X
        window.setLayout(null);
        window.setBounds(0,0,windowX,windowY); //define aonde a janela inicia e o tamanho dela(x, y, xtam, ytam)
        window.setResizable(false);

        window.add(label);
        label.setVisible(true);
        label.setBounds(centerX-25, 40, 100, 50);
       
       
       
        window.add(userLabel);
        userLabel.setVisible(true);
        userLabel.setBounds(centerX-150, 110, 100, 50);
       
        window.add(nameInput);
        nameInput.setVisible(true);
        nameInput.setBounds(centerX-150, 150, 300,25);
       
       
       
        window.add(passwordLabel);
        passwordLabel.setVisible(true);
        passwordLabel.setBounds(centerX-150, 200, 100, 50);
     
        window.add(passwordInput);
        passwordInput.setVisible(true);
        passwordInput.setBounds(centerX-150, 240, 300,25);
       
        window.add(btn);//adiciona o botao na tela
        btn.setVisible(true);//deixa o botao visivel
        btn.setBounds(centerX, 300, 150, 30);
    }
}
