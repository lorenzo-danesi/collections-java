package br.com.dio.collection.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //é criada uma lista com os elementos 'embaralhados' e sem repetições
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        //nenhum desses métodos é possível utilizando Sets

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        //ambos utilizam métodos herdados da classe Collections

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        //inicia a variavél soma com 0 e verifica, somando com o próximo valor
        while(iterator.hasNext()) {
            //verifica se existe um próximo valor
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos valores: " + soma/notas.size());
        //divide a soma pelo método que retorna o total de valores do conjunto

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        //remove o valor informado

        System.out.println("Remova a nota da posição 0: ");
        //não é possível saber as posições de um Set

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            //verifica se existe um próximo valor
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
            //se houver e for menor que 7 o valor é excluído
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        //é necessário alterar o tipo de Set criado
        Set<Double> notas2 = new LinkedHashSet<>();
        //alterando a inserção de elementos
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        //inserindo valores de notas2 em um novo Set de ordem crescente
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}
