/**
 * Projeto das trilhas de treinamento de Java b�sico ou avan�ado 
 * com foco nas certifica��es java e em treinamentos corporativos. 
 * Fontes dispon�veis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package com.rodrigofujioka.javabasico.aula05;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 10 de mar de 2016
 * @Time: 21:50:47
 */
public class UsaEmpregados {
	
	public static void main(String[] args) {
				
		Presidente presidente = new Presidente("Michel Temer");
		presidente.trabalhar();
		
		Gerente gerente = new Gerente("Rodrigo Fujioka");
		gerente.trabalhar();
		
		Empregado empregado = new Empregado("Alunos");
		empregado.trabalhar();
				
	}

}




