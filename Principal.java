import java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String[] args){		
		ArrayList<Nota> notas = new ArrayList<Nota>();
		Disciplina lp2 = new Disciplina("Lp2", "Herbert");
	  	Disciplina web = new Disciplina("Web", "Marcelo");
		
		Aluno a1 = new Aluno("Victor", 11);
	 	Aluno a2 = new Aluno("Caio", 16);
		Aluno a3 = new Aluno("Gregory", 17);
		Aluno a4 = new Aluno("Felipe", 31);
		Aluno a5 = new Aluno("João Paulo", 18);
		
		notas.add(new Nota(7, a1, lp2));
		notas.add(new Nota(8, a1, web));
		notas.add(new Nota(4, a2, lp2));
		notas.add(new Nota(7, a2, web));
		notas.add(new Nota(7, a3, lp2));
		notas.add(new Nota(4, a3, web));
		notas.add(new Nota(2, a4, lp2));
		notas.add(new Nota(5, a4, web));
		notas.add(new Nota(10, a5, lp2));
		notas.add(new Nota(9, a5, web));
		
		Collections.sort(notas);
		
		for(int i = 0; i < 10; i++){;
                        System.out.println("Aluno: "+notas.get(i).getAluno().getNome() +" Disciplina: "+ notas.get(i).getDisciplina().getNome() +"nota: "+ notas.get(i).getNota() + " Professor: " + notas.get(i).getDisciplina().getProfessor());
                }
		System.out.println("A maior nota foi: " + notas.get(0).getNota());
		int i = 0;
		while( notas.get(i).getDisciplina().getNome() != "Lp2"){
			i++;
			System.out.println("A maior nota de lp2 foi: " + notas.get(i).getNota());
		}
		
	}
}
