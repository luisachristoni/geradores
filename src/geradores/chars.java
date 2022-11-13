package geradores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chars implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String number = main.caractersText.getText();
		if (number.equals("")) {
			main.label2.setText("Insira tamanho da string");
		} else {
			int num = Integer.valueOf(number);
			if (num <0) {
				main.label2.setText("Invalido! Insira numero positivo");
			} else {
				main.label2.setText(generators.geradorCaracteres(num));
			}
		}
	}
}
