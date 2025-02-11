public class Principal{

    public static void main(String args[]){

    Aluno aluno1 = new Aluno("Kaueh", 21, 1256789689646101l , 1001);
    System.out.println(aluno1.toString());

    Aluno aluno2 = new Aluno("kalera", 21, 1256789689646101l , 1001);
    System.out.println(aluno2.toString());

    Professor professor1 = new Professor("Cleber", 54, 12345678999l, 10002);
    System.out.println(professor1.toString());

    Professor professor2 = new Professor("jore", 54, 12345678999l, 10002);
    System.out.println(professor2.toString());

    Disciplina Disciplina = new Disciplina("Web II");
    System.out.println(Disciplina);

    }
}