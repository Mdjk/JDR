import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfPlayerLvl;
	private InfoJeu jeu = new InfoJeu();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {

		ConnexionDB connexion = new ConnexionDB();
		connexion.connexion();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfPlayerLvl = new JTextField();
		tfPlayerLvl.setBounds(107, 0, 63, 20);
		contentPane.add(tfPlayerLvl);
		tfPlayerLvl.setColumns(10);
		
		JLabel lblLvlJoueurs = new JLabel("Lvl Joueurs");
		lblLvlJoueurs.setBounds(10, 3, 87, 14);
		contentPane.add(lblLvlJoueurs);
		
		JLabel lblTypeDeDs = new JLabel("Type de d\u00E9s");
		lblTypeDeDs.setBounds(10, 30, 87, 14);
		contentPane.add(lblTypeDeDs);
		
		JLabel lblLvlRencontre = new JLabel("Lvl Rencontre");
		lblLvlRencontre.setBounds(10, 58, 87, 14);
		contentPane.add(lblLvlRencontre);
		
		JComboBox cmbBxDiceType = new JComboBox(jeu.getDiceType());
		cmbBxDiceType.setBounds(107, 27, 63, 20);
		contentPane.add(cmbBxDiceType);
		
		JComboBox cmbBxLvlEncounter = new JComboBox(jeu.getEncounterLvl());
		cmbBxLvlEncounter.setBounds(107, 55, 63, 20);
		contentPane.add(cmbBxLvlEncounter);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jeu.setActualPlayersLvl(Integer.parseInt(tfPlayerLvl.getText()));
				jeu.setActualDiceType(Integer.parseInt(cmbBxDiceType.getSelectedItem().toString()));
				jeu.setActualEncounterLvl(Integer.parseInt(cmbBxLvlEncounter.getSelectedItem().toString()));
			}
		});
		btnValider.setBounds(95, 85, 87, 23);
		contentPane.add(btnValider);
		
		///////////// génération de la partie droite///////////////////
		
		JLabel lblRencontreSpcifique = new JLabel("Rencontre Sp\u00E9cifique");
		lblRencontreSpcifique.setBounds(330, 4, 135, 14);
		contentPane.add(lblRencontreSpcifique);
		
		JComboBox cmbBxSpecificEncounter = new JComboBox();
		cmbBxSpecificEncounter.setBounds(460, 1, 80, 20);
		contentPane.add(cmbBxSpecificEncounter);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Boss ?");
		chckbxNewCheckBox.setBounds(565, 0, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(347, 85, 89, 23);
		contentPane.add(btnAjouter);
		
		JButton btnSupprimer = new JButton("Supprimer ");
		btnSupprimer.setBounds(347, 119, 89, 23);
		contentPane.add(btnSupprimer);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReset.setBounds(347, 155, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblListeDesRencontres = new JLabel("Liste des Rencontres");
		lblListeDesRencontres.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeDesRencontres.setBounds(325, 58, 140, 14);
		contentPane.add(lblListeDesRencontres);
		
		JLabel lblGenererRencontre = new JLabel("Generer rencontre");
		lblGenererRencontre.setBounds(468, 58, 113, 14);
		contentPane.add(lblGenererRencontre);
		
		JButton btnGenerer = new JButton("Generer");
		btnGenerer.setBounds(585, 54, 89, 23);
		contentPane.add(btnGenerer);
		
		JLabel lblGenererButin = new JLabel("Generer Butin");
		lblGenererButin.setBounds(468, 89, 103, 14);
		contentPane.add(lblGenererButin);
		
		JButton btnGenerer_1 = new JButton("Generer");
		btnGenerer_1.setBounds(585, 85, 89, 23);
		contentPane.add(btnGenerer_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 190, 684, 222);
		contentPane.add(lblNewLabel);
		
	}
}
