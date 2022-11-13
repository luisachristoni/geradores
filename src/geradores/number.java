package geradores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class number implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String number = main.numberText.getText();
		if (number.equals("") ) {
			main.label2.setText("Insira qtd digitos ate 10");
		} else {
			int num = Integer.valueOf(number);
			if (num<0 || num>10) {
				main.label2.setText("Invalido! Deve ser entre 0 e 10");
			} else {
				main.label2.setText(Integer.toString(generators.numeroAleatorio(num)));
			}
			
		}
	}
}
