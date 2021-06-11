package funcao;

import main.Banco_Program;

public class Saque {

	public void saque(double saque) {
		
		
		int notasa = 0;
		int notasb = 0;
		int notasc = 0;
		int notasd = 0;
		int notase = 0;
		int notasf = 0;
		int notasg = 0;


		double calculo = 0.0;
		
		do
		{
			if (saque >= 200) 
			{
				notasa = notasa + 1;
				saque = saque - 200;
			}
			
			if (saque >= 100) 
			{
				notasb = notasb + 1;
				saque = saque - 100;
			}
			
			if (saque >= 50) 
			{
				notasc = notasc + 1;
				saque = saque - 50;
			}
			if (saque >= 20) 
			{
				notasd = notasd + 1;
				saque = saque - 20;
			}
			if (saque >= 10) 
			{
				notase = notase + 1;
				saque = saque - 10;
			}
			calculo = saque % 2;
			if (saque >= 5 && calculo != 0) 
			{
				notasf = notasf + 1;
				saque = saque - 5;
			}
			if (saque >= 2) 
			{
				notasg = notasg+ 1;
				saque = saque - 2;
			}
		}
		while (saque > 1);
		System.out.println();
		
			System.out.println("200 = " + notasa);
			System.out.println("100 = " + notasb);
			System.out.println("50 = " + notasc);
			System.out.println("20 = " + notasd);
			System.out.println("10 = " + notase);
			System.out.println("5 = " + notasf);
			System.out.println("2 = " + notasg);
		}

	}

