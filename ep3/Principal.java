import java.util.Collections;
import java.util.ArrayList;

public class Principal {

public static void main(String [] args){

Aluno a1 = new Aluno();
a1.setNome("Karol");
a1.setIdade(20);

Aluno a2 = new Aluno();
a2.setNome("Nathalia");
a2.setIdade(17);

Aluno a3 = new Aluno();
a3.setNome("Brian");
a3.setIdade(18);

Aluno a4 = new Aluno();
a4.setNome("Lais");
a4.setIdade(12);

Aluno a5 = new Aluno();
a5.setNome("Birma");
a5.setIdade(19);

Disciplina d1 = new Disciplina();
d1.setNome ("WEB");
d1.setProfessor ("Marcelo");

Disciplina d2 = new Disciplina();
d1.setNome ("Lp2");
d1.setProfessor ("Herbert"); 


ArrayList<Aluno> ni = new ArrayList<Aluno>();
ni.add(new Nota (5, a1, d1));
n.add(new Nota (7, a1, d1));

ni.add(new Nota (4, a2, d2));
ni.add(new Nota (8, a2, d2));

ni.add(new Nota (10, a3, d3));
ni.add(new Nota (6, a3, d3));

ni.add(new Nota (9, a4, d4));
n.add(new Nota (3, a4, d4));

ni.add(new Nota (7, a5, d5));
ni.add(new Nota (5, a5, d5));


ni.add(a1);
ni.add(a2);
ni.add(a3);
ni.add(a4);
ni.add(a5);

Collections.sort(ni);
for (int i=0; i<5; i++){
   System.out.println(ni.get(i).getAluno.getNome()+" - " + ni.get(i).getAluno.getIdade());
}

System.out.println (" ..............................");

System.out.println("A maior nota geral foi: " + ni.get(0).getNota() + " " + " do aluno: " + ni.get(0).get.Aluno.getNome());

int i = 0;
		while( ni.get(i).getDisciplina().getNome() != "Lp2")
			i++;
		System.out.println("A maior nota em lp2 foi: " + ni.get(i).getNota() + " " + "do aluno: " + ni.getAluno.getNome());
		System.gc();
}
}
