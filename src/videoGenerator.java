import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class videoGenerator extends JFrame {

	public static String RN = "\r\n";

	private JTextField idMatch;
	private JTextField EquipeBleu;
	private JTextField EquipeGris;
	private JTextField EquipeNoir;
	private JTextField lienYoutube;
	private JTextArea textArea;
	private JTextField date;

	public videoGenerator() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblIdDuMatch = new JLabel("Id du match");
		GridBagConstraints gbc_lblIdDuMatch = new GridBagConstraints();
		gbc_lblIdDuMatch.anchor = GridBagConstraints.EAST;
		gbc_lblIdDuMatch.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdDuMatch.gridx = 1;
		gbc_lblIdDuMatch.gridy = 0;
		getContentPane().add(lblIdDuMatch, gbc_lblIdDuMatch);

		idMatch = new JTextField();
		GridBagConstraints gbc_idMatch = new GridBagConstraints();
		gbc_idMatch.insets = new Insets(0, 0, 5, 0);
		gbc_idMatch.fill = GridBagConstraints.HORIZONTAL;
		gbc_idMatch.gridx = 2;
		gbc_idMatch.gridy = 0;
		getContentPane().add(idMatch, gbc_idMatch);
		idMatch.setColumns(10);

		JLabel lblDate = new JLabel("Date");
		GridBagConstraints gbc_lblDate = new GridBagConstraints();
		gbc_lblDate.anchor = GridBagConstraints.EAST;
		gbc_lblDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblDate.gridx = 1;
		gbc_lblDate.gridy = 1;
		getContentPane().add(lblDate, gbc_lblDate);

		date = new JTextField();
		GridBagConstraints gbc_date = new GridBagConstraints();
		gbc_date.insets = new Insets(0, 0, 5, 0);
		gbc_date.fill = GridBagConstraints.HORIZONTAL;
		gbc_date.gridx = 2;
		gbc_date.gridy = 1;
		getContentPane().add(date, gbc_date);
		date.setColumns(10);

		JLabel lblEquipe = new JLabel("Equipe bleu");
		GridBagConstraints gbc_lblEquipe = new GridBagConstraints();
		gbc_lblEquipe.anchor = GridBagConstraints.EAST;
		gbc_lblEquipe.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipe.gridx = 1;
		gbc_lblEquipe.gridy = 2;
		getContentPane().add(lblEquipe, gbc_lblEquipe);

		EquipeBleu = new JTextField();
		GridBagConstraints gbc_EquipeBleu = new GridBagConstraints();
		gbc_EquipeBleu.insets = new Insets(0, 0, 5, 0);
		gbc_EquipeBleu.fill = GridBagConstraints.HORIZONTAL;
		gbc_EquipeBleu.gridx = 2;
		gbc_EquipeBleu.gridy = 2;
		getContentPane().add(EquipeBleu, gbc_EquipeBleu);
		EquipeBleu.setColumns(10);

		JLabel lblEquipeGris = new JLabel("Equipe Gris");
		GridBagConstraints gbc_lblEquipeGris = new GridBagConstraints();
		gbc_lblEquipeGris.anchor = GridBagConstraints.EAST;
		gbc_lblEquipeGris.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipeGris.gridx = 1;
		gbc_lblEquipeGris.gridy = 3;
		getContentPane().add(lblEquipeGris, gbc_lblEquipeGris);

		EquipeGris = new JTextField();
		GridBagConstraints gbc_EquipeGris = new GridBagConstraints();
		gbc_EquipeGris.insets = new Insets(0, 0, 5, 0);
		gbc_EquipeGris.fill = GridBagConstraints.HORIZONTAL;
		gbc_EquipeGris.gridx = 2;
		gbc_EquipeGris.gridy = 3;
		getContentPane().add(EquipeGris, gbc_EquipeGris);
		EquipeGris.setColumns(10);

		JLabel lblEquipeNoire = new JLabel("Equipe noir");
		GridBagConstraints gbc_lblEquipeNoire = new GridBagConstraints();
		gbc_lblEquipeNoire.anchor = GridBagConstraints.EAST;
		gbc_lblEquipeNoire.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipeNoire.gridx = 1;
		gbc_lblEquipeNoire.gridy = 4;
		getContentPane().add(lblEquipeNoire, gbc_lblEquipeNoire);

		EquipeNoir = new JTextField();
		GridBagConstraints gbc_EquipeNoir = new GridBagConstraints();
		gbc_EquipeNoir.insets = new Insets(0, 0, 5, 0);
		gbc_EquipeNoir.fill = GridBagConstraints.HORIZONTAL;
		gbc_EquipeNoir.gridx = 2;
		gbc_EquipeNoir.gridy = 4;
		getContentPane().add(EquipeNoir, gbc_EquipeNoir);
		EquipeNoir.setColumns(10);

		JLabel lblLienYoutube = new JLabel("Lien Youtube");
		GridBagConstraints gbc_lblLienYoutube = new GridBagConstraints();
		gbc_lblLienYoutube.anchor = GridBagConstraints.EAST;
		gbc_lblLienYoutube.insets = new Insets(0, 0, 5, 5);
		gbc_lblLienYoutube.gridx = 1;
		gbc_lblLienYoutube.gridy = 5;
		getContentPane().add(lblLienYoutube, gbc_lblLienYoutube);

		lienYoutube = new JTextField();
		GridBagConstraints gbc_lienYoutube = new GridBagConstraints();
		gbc_lienYoutube.insets = new Insets(0, 0, 5, 0);
		gbc_lienYoutube.fill = GridBagConstraints.HORIZONTAL;
		gbc_lienYoutube.gridx = 2;
		gbc_lienYoutube.gridy = 5;
		getContentPane().add(lienYoutube, gbc_lienYoutube);
		lienYoutube.setColumns(10);

		JLabel lblNewLabel = new JLabel("http://www.youtube.com/embed/i3lFzMk6FOA?list=PLd4ZYCcMmGFmEpm3_vK-HEttq9EyI4LBW");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 6;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				idMatch.setText("");
				EquipeBleu.setText("");
				EquipeGris.setText("");
				EquipeNoir.setText("");
				textArea.setText("");
				lienYoutube.setText("");
				date.setText("");
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridx = 1;
		gbc_btnClear.gridy = 7;
		getContentPane().add(btnClear, gbc_btnClear);

		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				generateHtml();
			}
		});
		GridBagConstraints gbc_btnGenerate = new GridBagConstraints();
		gbc_btnGenerate.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerate.gridx = 1;
		gbc_btnGenerate.gridy = 8;
		getContentPane().add(btnGenerate, gbc_btnGenerate);

		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 8;
		getContentPane().add(textArea, gbc_textArea);
	}

	private void generateHtml() {

		StringBuilder html = new StringBuilder();

		html.append("		<!-- DEBUT Match " + idMatch.getText() + " -->	" + RN);
		html.append("		<a id=\"titleMatch" + idMatch.getText() + "\" onclick=\"toggleVisibility('Match"
				+ idMatch.getText() + "')\" title=\"reduce\">");
		html.append(date.getText() + " : " + EquipeBleu.getText() + " - " + EquipeGris.getText() + " - " + EquipeNoir.getText() + " </a> " + RN);
		html.append("			<div id=\"Match" + idMatch.getText() + "\" style=\"display:none;\">" + RN);
		html.append("				<center>" + RN);
		html.append("					<a class=\"youtube-lazy-link\" style=\"width:560px;height:410px;\" href=\"" + lienYoutube.getText() + "\"></a>" + RN);
		html.append("				</center>" + RN);
		html.append("			</div>" + RN);
		html.append("		<!-- FIN Match " + idMatch.getText() + " -->	" + RN);
		html.append("		<br />" + RN);

		textArea.setText(html.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new videoGenerator().setVisible(true);
	}

}
