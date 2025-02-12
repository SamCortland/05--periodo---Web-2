public class Principal{

    public static void main(String args[]){

        Aluno aluno1 = new Aluno("Rafael", 34, 12345678910l, 1001);
        System.out.println(aluno1.toString());

        Aluno aluno2 = new Aluno("Gabriel", 28, 12345678910l, 2001);
        System.out.println(aluno2.toString());

        Professor professor1 = new Professor("Cecilia", 2, 45612378910l, 2002);
        System.out.println(professor1.toString());

        Professor professor2 = new Professor("Clara", 1, 45612378910l, 3002);
        System.out.println(professor2.toString());

        Disciplina disciplina1 = new Disciplina("Web II", 80);
        System.out.println(disciplina1.toString());

        disciplina1.addAluno(aluno1);
        disciplina1.addAluno(aluno2);

        disciplina1.addProfessor(professor1);
        disciplina1.addProfessor(professor2);

        System.out.println(disciplina1.toString());

        Disciplina disciplina2 = new Disciplina("Topicos Entregadores", 80);
        System.out.println(disciplina2.toString());

        disciplina2.addAluno(aluno1);
        disciplina2.addAluno(aluno2);

        disciplina2.addProfessor(professor1);
        disciplina2.addProfessor(professor2);

        System.out.println(disciplina2.toString());

        Curso curso = new Curso("Sistemas de Informação");
        curso.addDisciplina(disciplina1);
        curso.addDisciplina(disciplina2);
        System.out.println(curso.toString());

    }
}