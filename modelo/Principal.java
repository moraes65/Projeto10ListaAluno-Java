/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIAR 10 OBJETOS DA CLASS ALUNO USANDO O 
        //CONSTRUTOR CHEIO
        Aluno aluno01 = new Aluno(111, "JOAO", "1111-1111");
        Aluno aluno02 = new Aluno(222, "ANA", "2222-2222");
        Aluno aluno03 = new Aluno(333, "MARIA", "3333-3333");
        Aluno aluno04 = new Aluno(444, "JOSE", "4444-4444");
        Aluno aluno05 = new Aluno(555, "ANTONIO", "5555-5555");
        Aluno aluno06 = new Aluno(666, "JOAQUIM", "6666-6666");
        Aluno aluno07 = new Aluno(777, "ROSA", "7777-7777");
        Aluno aluno08 = new Aluno(888, "SILVA", "8888-8888");
        Aluno aluno09 = new Aluno(999, "FRANCISCO", "9999-9999");
        Aluno aluno10 = new Aluno(100, "MARCIO", "1010-1010");
        
        //OBJETO 'listaAlunos' pertence 'a Classe ArrayList
        //instanciando uma lista vazia que só receberá objetos da
        //classe Aluno
        //Classe TIPADA ArrayList<T>
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        
        //ADICIONANDO 10 OBJETOS DA CLASSE Aluno 
        //na lista Instanciada usando método add()
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
        //listaAluno.add("Aluno11");ERRO - LISTA TIPADA 
        //NAO ACEITA STRING 
        
        //intanciar 5 objetos da classe Aluno
        //e adicionar na listaAlunos
        //usando um laço FOR
        
        for (int j = 11; j <= 15; j++){
            Aluno objAluno = new Aluno(j, "aluno"+j, "9999-"+j+j);
            listaAluno.add(objAluno);
        }
        
        //Novos Objetos definindo FORA DO FOR
        //teremos a referencia a um UNICO objeto (GLOBAL)
        //nesse caso teremos de colocar o objeto dentro
        //do laco FOR
        //*****NAO POSSO DECLARAR FORA DO LACO*****
        for (int j = 11; j <= 15; j++){
            Aluno objAluno1 = new Aluno();
            objAluno1.setIdAluno(j);
            objAluno1.setNome("novo-aluno"+j);
            objAluno1.setCelular("XXXX-"+j+j);
            listaAluno.add(objAluno1);
        }
        
        
        //LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA
        //USANDO O LAÇO FOR
        //método size() retorna o tamanho da lista
        //método get(index) retorna o elemento  da posicao INDEX
        for(int i = 0; i < listaAluno.size(); i++){
            System.out.println("Aluno "+
                    listaAluno.get(i).getIdAluno()+ " - " + 
                    listaAluno.get(i).getNome());
        }
        
        //*******NAO "DEVO" DECLARAR DENTRO DO LACO FOR*****
        Aluno objAluno = new Aluno();    
        
        for(int i = 0; i < listaAluno.size(); i++){
            objAluno = listaAluno.get(i);
            //aluno com ID 999
            if (objAluno.getIdAluno() == 999){
                System.out.println("ENCONTREI O " + objAluno.getNome());
            }
            System.out.println("Aluno "+
                objAluno.getIdAluno()+ " - " + 
                objAluno.getNome());
        }
        
        
        
        
        
        
    }
    
}
