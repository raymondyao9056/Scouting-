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

// public class scouting {
//     public static void main (String[] args) throws IOException{

//         JFrame title = new JFrame();
//         JPanel titlePanel = new JPanel();
//         JLabel titleLabel = new JLabel("FRC 4188 Scouting");
//         JButton titleButton = new JButton();
//         BufferedImage myPicture = ImageIO.read(new File("./csp.jpeg"));
//         Image image = myPicture.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
// 		JLabel picLabel = new JLabel(new ImageIcon(image));

//         BoxLayout boxlayout = new BoxLayout(titlePanel, BoxLayout.Y_AXIS);
         
//         JFrame out = new JFrame("Qualifications");
//         JPanel outPanel = new JPanel();

//         out.setSize(600, 800);
//         out.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//         out.setLocationRelativeTo(null);
//         out.setVisible(true);
//         out.add(outPanel);


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

//         out.setVisible(false);

//         titleButton.addActionListener(new java.awt.event.ActionListener() {
//             @Override
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 title.setVisible(false);
//                 String scouterName = JOptionPane.showInputDialog(title, "What is your name?", null);
//                 String competition = JOptionPane.showInputDialog(title, "What competition is this?", null);
//                 String allianceColor = JOptionPane.showInputDialog(title, "What alliance is this? (Red or Blue)", null);
//                 int allianceNumber = 1;

               

//                 String[] teams = {
//                     "3635",	"5632",	"7470",	"5293",	"4509",	"3344",
//                     "1648",	"8849",	"6910",	"2415",	"7538",	"6925",
//                     "4188",	"7315",	"4701",	"3091",	"6905",	"8100",
//                     "4112",	"8865",	"1261",	"6919",	"1414",	"5828",
//                     "1648",	"8815",	"6925",	"3344",	"5293",	"7470",
//                     "5632",	"3091",	"4701",	"7315",	"3635",	"6905",
//                     "5828",	"4509",	"1261",	"7538",	"8100",	"1414",
//                     "8815",	"4112",	"2415",	"6910",	"4188",	"6919",
//                     "1648",	"4701",	"8865",	"3344",	"8849",	"7315",
//                     "5632",	"5828",	"7538",	"6925",	"3091",	"5293",
//                     "8100",	"4112",	"6905",	"8815",	"6919",	"4509",
//                     "6910",	"7470",	"1414",	"4188",	"8849",	"8865",
//                     "3635",	"5293",	"1261",	"2415",	"5828",	"7315",
//                     "1648",	"6919",	"3344",	"4701",	"6925",	"8100",
//                     "7470",	"4509",	"4112",	"7538",	"8865",	"6910",
//                     "1414",	"8849",	"3635",	"3091",	"8815",	"5632",
//                     "2415",	"6905",	"5293",	"8100",	"4188",	"1261",
//                     "6925",	"7538",	"4509",	"7470",	"4701",	"6919",
//                     "8849",	"6910",	"5828",	"3635",	"8815",	"7315",
//                     "6905",	"1414",	"4112",	"5632",	"1648",	"2415",
//                     "3091",	"3344",	"8865",	"4509",	"4188",	"1261",
//                     "6925",	"6919",	"7315",	"4701",	"3635",	"8100",
//                     "5293",	"5632",	"1414",	"7538",	"4112",	"8849",
//                     "4188",	"2415",	"3091",	"6910",	"3344",	"5828",
//                     "1261",	"6905",	"1648",	"8865",	"8815",	"7470",
//                     "1414",	"8100",	"4509",	"8849",	"5293",	"4701",
//                     "3091",	"6910",	"7315",	"5632",	"6925",	"6919",
//                     "5828",	"4112",	"4188",	"1648",	"1261",	"7470",
//                     "3344",	"3635",	"8815",	"6905",	"2415",	"7538",
//                     "8100",	"6919",	"6910",	"8865",	"1414",	"3091",
//                     "5828",	"5293",	"1648",	"4701",	"4509",	"8849",
//                     "5632",	"2415",	"3344",	"1261",	"7470",	"7538",
//                     "6925",	"3635",	"8865",	"6905",	"8815",	"4188",
//                     "7315",	"8100",	"8849",	"4112",	"3091",	"4509",
//                     "7470",	"5632",	"5828",	"3344",	"4701",	"2415",
//                     "5293",	"7538",	"3635",	"1261",	"6910",	"6919",
//                     "6925",	"7315",	"4188",	"8815",	"1414",	"1648",
//                     "6905",	"4701",	"4509",	"4112",	"8865",	"5632",
//                     "6919",	"2415",	"5293",	"7470",	"5828",	"3091",
//                     "8815",	"7538",	"8849",	"4188",	"8100",	"1648",
//                     "1261",	"3344",	"6925",	"3635",	"6910",	"4112",
//                     "8865",	"6905",	"7470",	"1414",	"7315",	"5293",
//                     "4509",	"6919",	"3091",	"8100",	"8849",	"2415",
//                     "3635",	"1648",	"4188",	"4112",	"1261",	"4701",
//                     "6905",	"1414",	"3344",	"5828",	"6910",	"6925",
//                     "7315",	"5632",	"8815",	"7538",	"8865",	"6919",
//                     "2415",	"7470",	"3635",	"8100",	"1648",	"4112",
//                     "8849",	"1261",	"3091",	"5828",	"6925",	"6905",
//                     "4188",	"3344",	"7538",	"5293",	"7315",	"1414",
//                     "6910",	"4701",	"8815",	"4509",	"8865",	"5632",
//                     "6919",	"4112",	"8849",	"7470",	"5828",	"6905",
//                     "1414",	"6925",	"4188",	"7538",	"3091",	"3635",
//                     "5293",	"8100",	"8815",	"1261",	"5632",	"6910",
//                     "4509",	"1648",	"2415",	"8865",	"7315",	"3344",
//                     "4701",	"7538",	"5828",	"6919",	"3635",	"6905",
//                     "8849",	"7470",	"6925",	"8100",	"4188",	"5632",
//                     "6910",	"5293",	"8865",	"3091",	"3344",	"1648",
//                     "2415",	"1261",	"1414",	"7315",	"4509",	"4112",
//                     "4701",	"7470",	"8100",	"8815",	"5828",	"3635",
//                     "6919",	"4188",	"5293",	"8849",	"6905",	"5632",
//                     "7315",	"1648",	"7538",	"4509",	"2415",	"6910",
//                     "3344",	"1261",	"8815",	"1414",	"3091",	"4701",
//                     "8865",	"5828",	"8100",	"4112",	"6925",	"5293"
//                 };
                    
//                     String url = "https://docs.google.com/forms/d/e/1FAIpQLSfHjpqt4axhUYk2EFWeNPxkGLGrxeq47JX50rwIaNQ_Dz7Dnw/viewform?usp=pp_url";
            
//                     String nameURL = "&entry.1177301623=" + scouterName;
//                     String competitionURL = "&entry.1443173845=" + competition;
//                     String qualificationURL = "&entry.1802790063=";
//                     String teamNumberURL = "&entry.594343725=";
//                     String allianceColorURL = "&entry.1284261078=";
                    
//                     String finalURL;
//                     String teamNumber = "";

//                     out.setVisible(true);
                    
//                     for (int i = 1; i <= 63; i++) {
//                         if (allianceColor.equals("Red")) {
//                             teamNumber = teams[6*i - 6 + allianceNumber - 1];
//                         }
//                         if (allianceColor.equals("Blue")) {
//                             teamNumber = teams[6*i - 6 + allianceNumber - 1 + 3];
//                         }
//                         finalURL = url + nameURL + competitionURL + qualificationURL + "Q" + i + teamNumberURL + teamNumber + allianceColorURL + allianceColor;    
//                     }

//             }
//         });

        
//     }
// }
