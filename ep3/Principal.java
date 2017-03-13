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

ArrayList<Aluno> ni = new ArrayList<Aluno>();
ni.add(a1);
ni.add(a2);
ni.add(a3);
ni.add(a4);
ni.add(a5);

Collections.sort(ni);
for (int i=0; i<5; i++){
   System.out.println(ni.get(i).getNome()+" - " + ni.get(i).getIdade());
}

}
}
