package OperacionesBasicas.operacionesbasicas;

public class OperacionesBasicas {

	public static void main(String[] args) {
		
		char operador;
		int operando1, operando2;
		operador=args[0].charAt(0);
		operando1=Integer.parseInt(args[1]);
		operando2=Integer.parseInt(args[2]);
		
		System.out.println(operar(operador,operando1,operando2));
		
	}
	
	public static String operar(char operador, int operando1, int operando2) {

		int resultado=-1;
		switch(operador) {
		case '+':
			 resultado=operando1+operando2;
			 break;
		case '-':
			 resultado=operando1-operando2;
			 break;
		case '.':
			 resultado=operando1*operando2;
			 break;
		case '/':
			 resultado=operando1/operando2;
			 break;
		default:
			break; 
		}
		
		return operando1+" "+operador+" "+operando2+" = "+resultado;
		
	}
}
