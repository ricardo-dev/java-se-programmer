package programmer.se.um.escopovariavel;

public class Main {

	public static void main(String[] args) {
		
		int x = 10;
		
		if(x >= 10) {
			int y = 100;
			System.out.println(y);
		}
		
		// System.out.println(y); // o 'y' nao e reconhecido, ele e local do if
		System.out.println(x);
	}

}

//shadowing esconder a variavel atributo com uma variavel local, a diferenca e o uso do this para referencia a variavel atributo

/*
Recapitulando, vimos variáveis locais, que podem ser definidas dentro de um método ou de um construtor, e elas 
vivem somente dentro daquele bloco, pode ser dentro de um if ou dentro de um for. Cuidado.

Vimos variáveis de instância ou “variáveis membro”, também chamadas de atributo ou variáveis de objeto. Vimos 
variáveis estáticas ou variáveis da classe, podem ser acessadas de qualquer lugar desde que sejam referenciadas através 
do objeto de uma instância ou através do nome da classe.

[20:15] E vimos conflito de nomes em escopos distintos, no mesmo escopo não pode, e no escopo static e de instância não pode. 
Só pode no escopo de static e local ou membro e local.
*/