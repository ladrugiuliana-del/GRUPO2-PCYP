package actividad6;

public class Matriz {
	
	private int [][] matriz = new int [10] [10];
	
	public void setCampoMatriz(int fila, int columna, int valor) {
		this.matriz [fila][columna] = valor;
	}
	
	public void mostrarMatriz() {
		for(int i = 0; i < 10; ++i) {
			String fila = matriz[i][0] + " " + matriz[i][1] + " " + matriz[i][2] + " " + matriz[i][3] + " " + matriz[i][4] + " " + matriz[i][5] + " " + matriz[i][6] + " " + matriz[i][7] + " " + matriz[i][8] + " " + matriz[i][9];
			System.out.println(fila);
		}
	}
	
	public void initMatriz() {
		for(int i = 0; i < 10; ++i) {setCampoMatriz(0, i, i);}
		for(int i = 0; i < 10; ++i) {setCampoMatriz(i, 0, i);}
	}
	
	public void fillMatriz() {
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				int num = (j + 1)* (i + 1);
				if (i == 0){
					num = j + 1;
				}
				setCampoMatriz(i, j, num);
			}
		}
	}
}
