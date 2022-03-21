// import java.awt.FlowLayout;
// import java.awt.Font;

// import javax.swing.BoxLayout;
// import javax.swing.ImageIcon;
// import javax.swing.JButton;  
// import javax.swing.JFrame;  
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel; 
// import java.awt.Graphics;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.IOException;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import javax.imageio.ImageIO;
// import java.awt.FlowLayout;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.IOException;
// import java.awt.Component;
// import java.awt.Image;

// public class Button {
//     public static void main(String[] args) throws IOException {
//         JFrame title = new JFrame();
//         JPanel titlePanel = new JPanel();
//         JLabel titleLabel = new JLabel("FRC 4188 Scouting");
//         JButton titleButton = new JButton();
//         BufferedImage myPicture = ImageIO.read(new File("./csp.jpeg"));
//         Image image = myPicture.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
// 		JLabel picLabel = new JLabel(new ImageIcon(image));

//         BoxLayout boxlayout = new BoxLayout(titlePanel, BoxLayout.Y_AXIS);
         
        
//         titleButton.setText("Ok");
//         titleButton.setSize(400, 100);
//         titleButton.setAlignmentX(Component.CENTER_ALIGNMENT);

//         titlePanel.setLayout(boxlayout);  
//         titlePanel.add(titleLabel);

//         picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

//         titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//         titleLabel.setFont(new Font("Comic Sans", Font.BOLD,40));


//         titlePanel.add(picLabel);
//         titlePanel.add(titleButton);
//         title.add(titlePanel);
//         title.setSize(600, 800);
//         title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

//         title.setLocationRelativeTo(null);
//         title.setVisible(true);

//         titleButton.addActionListener(new java.awt.event.ActionListener() {
//             @Override
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 title.setVisible(false);
//                 String scouterName = JOptionPane.showInputDialog(title, "What is your name?", null);
//                 String competition = JOptionPane.showInputDialog(title, "What competition is this?", null);
//                 String alliance = JOptionPane.showInputDialog(title, "What alliance is this?", null);
//             }
//         });

//         // JFrame nameFrame = new JFrame();
//         // String name = JOptionPane.showInputDialog(nameFrame, "Enter your message");
//     }
// }