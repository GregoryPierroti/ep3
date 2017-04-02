import java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String[] args){		
		ArrayList<Aluno> lista = new ArrayList() <Aluno> ;
		lista.add(new Aluno("Felifish", 33));
		lista.add(new Aluno("Victryo3", 12));
		lista.add(new Aluno("Pafth", 16));
		lista.add(new Aluno("Greguin", 17));
		lista.add(new Aluno("Johnizinho", 18));
		
		for(int i = 0; i < 5; i++)
                {
                        System.out.println(lista.get(i).getIdade() +"--"+ lista.get(i).getNome());
                }


		Collections.sort(lista);
		for(int i = 0; i < 5; i++)
                {
                        System.out.println(lista.get(i).getIdade() +"--"+ lista.get(i).getNome());
                }
		
	}
}
