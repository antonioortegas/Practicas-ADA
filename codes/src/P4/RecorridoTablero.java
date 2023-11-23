public class RecorridoTablero {
	private int[][] tablero; 
	private int[][] solucion;
	private int fila; //Fila de la casilla de inicio
	private int col;  //Columna de la casilla de inicio
	private int n;   
	private int m;

	public RecorridoTablero(int[][] t, int fila, int col) {
		tablero = t;
		n = tablero.length;
		m = tablero[0].length;
		this.fila = fila;
		this.col = col;
		solucion = null;
	}

	public int resolverMemo() {
		// Creamos la tabla auxiliar
		solucion = new int[n][m]; // -1 representará que la celda está vacía.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				solucion[i][j] = -1;
			}
		}
		// Rellenamos la tabla desde la casilla indicada
		return resuelve(fila, col);
	}

	private int resuelve(int i, int j) {
        // Base case: if out of bounds, return 0
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return 0;
        }

        // If the solution for this cell is already calculated, return it
        if (solucion[i][j] != -1) {
            return solucion[i][j];
        }

        // Calculate the maximum cost considering the three possible moves
        int moveAbove = resuelve(i - 1, j);
        int moveAboveLeft = resuelve(i - 1, j - 1);
        int moveAboveRight = resuelve(i - 1, j + 1);

        // Update the solution for the current cell
        solucion[i][j] = tablero[i][j] + maximo3(moveAbove, moveAboveLeft, moveAboveRight);

        return solucion[i][j];
    }

	private int maximo3(int a, int b, int c) {
		int res = a;
		if (b > res) {
			res = b;
		}
		if (c > res) {
			res = c;
		}
		return res;
	}

	private int minimo3(int a, int b, int c) {
		int res = a;
		if (b < res) {
			res = b;
		}
		if (c < res) {
			res = c;
		}
		return res;
	}

	public Recorrido reconstruirSol() {
        if (solucion == null) {
            throw new RuntimeException("Se debe resolver el problema primero");
        }


        Recorrido recorrido = new Recorrido();
        reconstruirSolRec(recorrido, fila, columna);
        return recorrido;
    }

    private void reconstruirSolRec(Recorrido recorrido, int i, int j) {
        if (i >= 0 && i < n && j >= 0 && j < m) {
            recorrido.add(i, j);
            int moveAbove = solucion[i][j] - tablero[i][j];
            int moveAboveLeft = (j > 0) ? solucion[i][j] - solucion[i - 1][j - 1] : 0;
            int moveAboveRight = (j < m - 1) ? solucion[i][j] - solucion[i - 1][j + 1] : 0;

            // Move to the position with the maximum contribution
            if (moveAbove > moveAboveLeft && moveAbove > moveAboveRight) {
                reconstruirSolRec(recorrido, i - 1, j);
            } else if (moveAboveLeft > moveAboveRight) {
                reconstruirSolRec(recorrido, i - 1, j - 1);
            } else {
                reconstruirSolRec(recorrido, i - 1, j + 1);
            }
        }
    }

	public void imprimeMatrizSolucion() {
		for (int i = 0; i < solucion.length; i++) {
			for (int j = 0; j < solucion[i].length; j++) {
				System.out.print(solucion[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
}
