package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Source;

public class Exemplo {
    public static void main(String[] args) {
    //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        
        System.out.println("Crie uma lista e adicione as sete notas: ");
        //List<Double> notas = new ArrayList<Double>();
        //é apenas uma das formas de criar uma lista, sendo que o segundo Double pode ser omitido
        List<Double> notas = new ArrayList<>(); 
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        //lembrando que os valores são Double, por isso é necessário .0, caso contrário seria necessário adicionar d ao final

        //System.out.println(notas);
        //pode-se utilizar o método toString para o mesmo efeito
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        //usamos o método indexOf para localizar a posição do valor desejado

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        //dessa vez, add necessita de um valor para a posição seguido do valor para adicionar
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        //editamos utilizando a posição do valor encontrado e adicionando o novo elemento
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        //realiza a busca do valor e retorna um boolean (true/false)

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for(Double nota : notas) System.out.println(nota);
        //imprime de forma que os valores fiquem alinhados

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        //lembrando que toda lista começa por 0, por isso o valor requerido é 2

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        //ambos utilizam métodos da classe Collections
        
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        //inicia a variavél soma com 0 e verifica, somando com o próximo valor da lista
        while(iterator.hasNext()){
            //verifica se existe um próximo valor
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos valores: " + soma/notas.size());
        //divide a soma pelo método que retorna o total de valores da lista

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        //remove o valor informado
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        //remove o valor da posição informada

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            //verifica se existe um próximo valor
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
            //se houver e for menor que 7 o valor é excluído
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        //método que retorna um boolean confirmando se está vazia ou não
        
    }
}