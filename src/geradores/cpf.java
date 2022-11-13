package geradores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cpf implements ActionListener{
	

	@Override
	public void actionPerformed(ActionEvent e) {
		main.label2.setText(generators.geradorCPF());
	}

}
