import javax.swing.JOptionPane;

public class Lista2_Ativ5 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número "));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número "));
		
		int a = rec(n, m);
		JOptionPane.showMessageDialog(null, "O MDC de " + n + " e " + m + " é: " + a);

	}
	
	public static int rec(int n, int m) {
		 if (n == m) {
			 return n;
		 } else if (n > m) {
			 return rec(n - m, m);
		 } else {
			 return rec(n, m - n);
		 }
		
	}

}