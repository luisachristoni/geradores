package geradores;

import java.util.Random;

public class generators {
	
	public static String gerador;
	public static int numeroAleatorio(int qtdDigitos){
        int minimo = (int) Math.pow(10, qtdDigitos - 1);
        int maximo =  (int) Math.pow(10, qtdDigitos) - 1;
        Random random = new Random();
        return minimo + random.nextInt( (maximo - minimo) + 1);
    }

    public static String geradorCPF() {
        String CPF = "";
        //gera cada um dos 9 primeiros digitos do CPF
        int n1 = numeroAleatorio(1);
        int n2 = numeroAleatorio(1);
        int n3 = numeroAleatorio(1);
        int n4 = numeroAleatorio(1);
        int n5 = numeroAleatorio(1);
        int n6 = numeroAleatorio(1);
        int n7 = numeroAleatorio(1);
        int n8 = numeroAleatorio(1);
        int n9 = numeroAleatorio(1);
        //Multiplica cada digito gerado por seu peso e soma
        int primeiroDigito = n1*10 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 +n9*2;
        //se o resto da divisão da soma por 11 for menor que 2
        //primeiro dígito verificador será 0, senão subtrai-se 11 pelo resto da divisão
        int resto = primeiroDigito % 11;
        if(resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }

        int segundoDigito = n1*11 + n2*10 + n3*9 + n4*8 + n5*7 +
                n6*6 + n7*5 + n8*4 + n9*3 + primeiroDigito*2;
        resto = segundoDigito % 11;
        if(resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }

        CPF = Integer.toString(n1) + Integer.toString(n2) + Integer.toString(n3) +
                Integer.toString(n4) + Integer.toString(n5) + Integer.toString(n6) +
                Integer.toString(n7) + Integer.toString(n8) + Integer.toString(n9) +
                Integer.toString(primeiroDigito) + Integer.toString(segundoDigito);
       //System.out.println("CPF gerado: " + CPF);
        return CPF;
    }

    public static String geradorCNPJ() {
        String CNPJ = "";
        //gera cada um dos 12 primeiros digitos do CNPJ
        int n1 = numeroAleatorio(1);
        int n2 = numeroAleatorio(1);
        int n3 = numeroAleatorio(1);
        int n4 = numeroAleatorio(1);
        int n5 = numeroAleatorio(1);
        int n6 = numeroAleatorio(1);
        int n7 = numeroAleatorio(1);
        int n8 = numeroAleatorio(1);
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 1;
        //Multiplica cada digito gerado por seu peso e soma
        int primeiroDigito = n1*5 + n2*4 + n3*3 + n4*2 + n5*9 + n6*8 + n7*7 + n8*6 +n9*5 + n10*4 + n11*3 + n12*2;
        //se o resto da divisão da soma por 11 for menor que 2
        //primeiro dígito verificador será 0, senão subtrai-se 11 pelo resto da divisão
        int resto = primeiroDigito % 11;
        if(resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }
        int segundoDigito = n1*6 + n2*5 + n3*4 + n4*3 + n5*2 + n6*9 +
                n7*8 + n8*7 +n9*6 + n10*5 + n11*4 + n12*3 + primeiroDigito*2;
        resto = segundoDigito % 11;
        if(resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }
        CNPJ = Integer.toString(n1) + Integer.toString(n2) + Integer.toString(n3) +
                Integer.toString(n4) + Integer.toString(n5) + Integer.toString(n6) +
                Integer.toString(n7) + Integer.toString(n8) + Integer.toString(n9) +
                Integer.toString(n10) + Integer.toString(n11) + Integer.toString(n12) +
                Integer.toString(primeiroDigito) + Integer.toString(segundoDigito);
        //System.out.println("CNPJ gerado: " + CNPJ);
        return CNPJ;
    }

    public static String geradorCaracteres(int i) {
        String cadeiaCaracteres;
        StringBuilder construtor;
        cadeiaCaracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        construtor = new StringBuilder(i);
        for (int m = 0; m < i; m++) {

            // gera numerico
            int myindex
                    = (int)(cadeiaCaracteres.length()
                    * Math.random());

            // adiciona o caracter a String
            construtor.append(cadeiaCaracteres
                    .charAt(myindex));
        }
        return construtor.toString();
    }
}
