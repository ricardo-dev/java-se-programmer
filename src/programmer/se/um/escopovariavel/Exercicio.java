package programmer.se.um.escopovariavel;

public class Exercicio {
	
	

	public void exercicioUm() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        int i = 15;
        System.out.println(i);
    }
	
	static int x = 15;
    public void exercicioDois(String[] x) {
        // x = 200; nao compila pois tenta colocar um int em uma string array
        System.out.println(x);
    }
    
    static int i = 3;
    public void exercicioTres() {
        for (new Exercicio().i = 10; new Exercicio().i < 100;
             new Exercicio().i++) {
            System.out.println(i);
        }
    }

	public static void main(String[] args) {
		Exercicio ex = new Exercicio();
		ex.exercicioUm();
		ex.exercicioTres();
	}

}
