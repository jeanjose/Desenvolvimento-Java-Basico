package me.dio.web.strings;

public class Strings {

    public static void main(String[] args) {

        var nome = "Jean ";
        var sobreNome = "José";
        var nomeCompleto = nome + sobreNome;


        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: " + nomeCompleto);


        /*Pode fazer isso, só que é redundante instanciar uma String assim*/
        var string = new String (" Minha String ");

        /*O método .charAt(Nº) é responsável por mostrar apenas o caracter da posição desejada*/
        System.out.println("Char na posição(5): " + string.charAt(5));

        /*O método .lenght() é responsável por devolver o resultado do tamanho da String*/
        System.out.println("Quantidade de Char: " + string.length());

        /*O método .trim() é responsável por tirar os espaçamentos em branco
        Ex: Sem utilizar o trim e utilizando o trim*/
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");

        /*O método .toLowerCase() é responsável por deixar toda a String minúscula*/
        System.out.println("Minúsculo: " + string.toLowerCase());
        /*O método .toUpperCase() é responsável por deixar toda a String maiúscula*/
        System.out.println("Maiúsculo: " + string.toUpperCase());

        /*O método .contains() é responsável por verificar se existe um caracter dentro da String
        Ex: 1- A String contém a letra M? || 2- A string contém a letra X?
        Se a resposta for verdadeira = true, se for falsa = false*/
        System.out.println("Contém M? " + string.contains("M"));
        System.out.println("Contém X? " + string.contains("X"));

        /*O método .replace("1ºLetra", "2ºLetra") é responsável por trocar a primeira letra do parâmetro, pela segunda letra do parâmetro
        Ex: Vamos trocar o "n", pelo "$"*/
        System.out.println("Replace: " + string.replace("n", "$"));

        /*O método .equals("exemplo") é responsável por fazer comparações incluindo letras maiúsculas e minúsculas.
        Ex: A string que inicializamos lá em cima "Minha String" é igual a " MinHa StRinG " que passamos por parâmetro?
        Se a resposta for sim = true, se for não = false*/
        System.out.println("Equals? " + string.equals(" MinHa StRinG "));

        /*O método .equalsIgnoreCase("exemplo") é responsável por fazer comparações "ignorando" letras maiúsculas e minúsculas.
        Não importa se as letras sejam maúsculas ou minúsculas, para esse método, só importa o texto*/
        System.out.println("EquaisIgnoreCase? " + string.equalsIgnoreCase(" MinHa StRinG "));

        /*O método .substring(1º espaço, 2ºespaco) é responsável por imprimir apenas o que está entre as casas selecionadas.
        No exemplo a baixo pedimos para imprimir apenas do espaçamento 1 ao 6*/
        System.out.println("Substring(1,6): " + string.substring(1,6));

         /*O método string toCharArray() Converte uma String em um Array de char, ou seja,
        uma String de 10 posições irá ser convertida em um vetor char[] de 10 posições*/
        var s1 = "ABCDEFG";
        System.out.print("CharArray: ");
        for (char c : s1.toCharArray()){
            System.out.print("| Char: " + c + " |");
        }
        System.out.println();

        /* O método split cria um array de Strings com base no "regexs" passado via parâmetro, ou seja,
        ele divide a String em várias outras Strings com base no seu regex,
        o que é muito útil para separar tags em uma String completa.
        ex: "software, engenharia, computação".
        Você pode transformar essa única String em um array com três Strings. */
        System.out.println("Split:");
        String valor = "Software -Engenharia -Computação";
        String [] valorComSplit = valor.split("-");
        for(String s : valorComSplit){
            System.out.println(s);
        }
        /*Este método também possui uma variação, que é o parâmetro "int limit",
        onde você identifica quantas vezes o regex será aplicado em toda String.*/
        System.out.println("Split com limit:");
        String valor02 = "Hacker -Java -Engenharia -Software";
        String [] valorComSplit02 = valor02.split("-", 2);
        for(String s2 : valorComSplit02){
            System.out.println(s2);
        }

        /*Podemos concatenar (juntar) strings usando o método .concat da classe String,
        o qual permite concatenar duas strings de forma similar ao uso do operador de concatenação*/
        System.out.println("Aula".concat(" de Java"));

        /*Este método nos permite substituir todas as ocorrências do caractere que passarmos por outro caractere.
        Perceba que o primeiro argumento que passamos foi ".", pois ele é o caractere que queremos substituir.
        Logo em seguida passamos uma String vazia representada pelas aspas duplas juntas*/
        String computador = "Keyboard.mouse.teclado.monitor";
        String textoReplace = "123456 ..meu / nome, testando ||";
        System.out.println("ReplaceAll:");
        System.out.println(computador.replaceAll("\\.", " - "));
        /*Esse regex representa tudo o que não for um número de 0 a 9 ( [^0-9] ).
        Para testar, passei um texto cheio de erros, com ".", "||", "/" e letras*/
        System.out.println(textoReplace.replaceAll("[^0-9]", ""));
    }
}
