package questoesjava;

import javax.swing.JOptionPane;

public class Questoes {

    public void q61() {
        //61 - Faça um programa que que leia um ano de nascimento e o ano atual e imprima a idade da pessoa, não se esqueça de verificar se o
        //ano de nascimento é um ano válido;
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual"));
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu ano de nascimento"));

        if (anoNascimento > 1905) {//https://veja.abril.com.br/mundo/morre-masazo-nonaka-o-homem-mais-velho-do-mundo/
            JOptionPane.showMessageDialog(null, "Idade: " + (anoAtual - anoNascimento));
        } else {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido!");
        }
    }

    public void q62() {
        //62 - Faça um programa que leia nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino e tiver menos que 25 anos, imprimir
        //nome e a mensagem: ACEITA. Caso contrário, imprimir nome e a mensagem: NÃO ACEITA. (Considerar f, F, m, M)
        String nome = JOptionPane.showInputDialog("Nome");
        String sexo = JOptionPane.showInputDialog("Sexo [M] ou [m] para masculino e [F] ou [f] para feminino").toUpperCase();

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));

        if ((sexo.equals("F")) && (idade < 25)) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nACEITA!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nNÃO ACEITA!");
        }
    }

    public void q63() {
        //63 - Faça um programa que entre com a sigla do Estado de uma pessoa e imprima uma das mensagens: carioca, paulista, mineiro, outros
        //estados.
        String estado = JOptionPane.showInputDialog("Insira a sigla de seu estado").toUpperCase();
        switch (estado) {
            case "RJ":
                JOptionPane.showMessageDialog(null, "Carioca");
                break;
            case "SP":
                JOptionPane.showMessageDialog(null, "Paulista");
                break;
            case "MG":
                JOptionPane.showMessageDialog(null, "Mineiro");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Outros Estados");
                break;
        }
    }

    public void q64() {
        //64. Faça um programa que leia 2 números e imprima o quadrado do menor número e a raiz quadrada do maior número.
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));

        if (n1 < n2) {
            JOptionPane.showMessageDialog(null, "Quadrado de " + n1 + " : " + Math.pow(n1, 2));
            JOptionPane.showMessageDialog(null, "Raiz quadrada de " + n2 + " : " + Math.sqrt(n2));
        } else {
            JOptionPane.showMessageDialog(null, "Quadrado de " + n2 + " : " + Math.pow(n2, 2));
            JOptionPane.showMessageDialog(null, "Raiz quadrada de " + n1 + " : " + Math.sqrt(n1));
        }
    }

    public void q65() {
        //65 - Faça um programa que leia 3 números e imprima-os em ordem decrescente
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número"));

        if (n1 > n2 && n2 > n3) {
            JOptionPane.showMessageDialog(null, n1 + "\n" + n2 + "\n" + n3);
        } else if (n2 > n1 && n1 > n3) {
            JOptionPane.showMessageDialog(null, n2 + "\n" + n1 + "\n" + n3);//{+312, +321, 132, +123, +213, +231}
        } else if (n3 > n2 && n2 > n1) {
            JOptionPane.showMessageDialog(null, n3 + "\n" + n2 + "\n" + n1);
        } else if (n1 > n3 && n3 > n2) {
            JOptionPane.showMessageDialog(null, n1 + "\n" + n3 + "\n" + n2);
        } else if (n3 > n1 && n1 > n2) {
            JOptionPane.showMessageDialog(null, n3 + "\n" + n1 + "\n" + n2);
        } else {
            JOptionPane.showMessageDialog(null, n2 + "\n" + n3 + "\n" + n1);
        }

    }

    public void q66() {
        //66 - Faça um programa que leia 3 números e armazene-os em 3 variáveis com os seguintes nomes: maior, intermediário e menor.
        double maior, intermediario, menor;
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número"));

        if (n1 > n2 && n2 > n3) {
            maior = n1;
            intermediario = n2;
            menor = n3;
        } else if (n2 > n1 && n1 > n3) {
            maior = n2;
            intermediario = n1;
            menor = n3;
        } else if (n3 > n2 && n2 > n1) {
            maior = n3;
            intermediario = n2;
            menor = n1;
        } else if (n1 > n3 && n3 > n2) {
            maior = n1;
            intermediario = n3;
            menor = n2;
        } else if (n3 > n1 && n1 > n2) {
            maior = n3;
            intermediario = n1;
            menor = n2;
        } else {
            maior = n2;
            intermediario = n3;
            menor = n1;
        }

        JOptionPane.showMessageDialog(null,
                "Maior: " + maior
                + "\nIntermediario: " + intermediario
                + "\nMenor: " + menor);
    }

    public void q67() {
        //67 - Faça um programa que leia 3 números, os possíveis lados de um triangulo, e imprima a classificação segundo os lados.
        double x = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));
        double z = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número"));

        if ((x < y + z) && (y < x + z) && (z < x + y)) {
            if (x == y && x == z) {
                JOptionPane.showMessageDialog(null, "Triangulo Equilátero");//todos os lados iguais
            } else if ((x == y) || (x == z)) {
                JOptionPane.showMessageDialog(null, "Triangulo Isósceles");//dois lados iguai
            } else {
                JOptionPane.showMessageDialog(null, "Triângulo Escaleno");//todos os lados diferentes
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é um triângulo!");//a soma de dois lados é igual ou menor que o terceiro lado
        }
    }

    public void q68() {
        //68 - Faça um programa que leia nome, nota n1 e nota n2 de um aluno. Imprima seu nome, nota n1, nota n2, média e uma das mensagens:
        //Aprovado, Reprovado ou em Prova Final (a média é 7 para aprovação, menor que 4 para reprovação e as demais para prova final)
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota"));
        double media = (n1 + n2) / 2;
        String msg;

        if (media >= 7) {
            msg = "Aprovado!";
        } else if (media < 4) {
            msg = "Reprovado!";
        } else {
            msg = "Prova final!";
        }
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nNota 1: " + n1 + "\nNota 2: " + n2 + "\nMédia: " + media + "\n" + msg);
    }

    public void q69() {
        //69 - Faça um programa que leia o salário de uma pessoa e imprima o desconto do INSS:
        //Salario Desconto
        //<= 600 isento
        //>600, <1200 20%
        //>1200, <2000 25%
        //>2000 30%
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário"));
        if (salario <= 600) {
            JOptionPane.showMessageDialog(null, "Isento");
        } else if (salario > 600 && salario < 1200) {
            JOptionPane.showMessageDialog(null, "Desconto: " + (salario * 0.2));
        } else if (salario > 1200 && salario < 2000) {
            JOptionPane.showMessageDialog(null, "Desconto: " + (salario * 0.25));
        } else if (salario > 2000) {
            JOptionPane.showMessageDialog(null, "Desconto: " + (salario * 0.30));
        }
    }

    public void q70() {
        //70 - Um comerciante comprou um produto e quer vende-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00 caso
        //contrário, o lucro será de 30%. Faça um programa que leia o valor do produto e imprima o valor da venda.
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto"));
        if (valor < 20) {
            valor += (0.45 * valor);
            JOptionPane.showMessageDialog(null, "Valor de venda: " + valor);
        } else {
            valor += (0.3 * valor);
            JOptionPane.showMessageDialog(null, "Valor de venda: " + valor);
        }

    }

    public void q71() {
        //71. A turma de programação I, por ter muitos alunos, será dividida em dias de provas. Decidiu-se dividi-las em 3 grupos. Faça um
        //programa que leia o nome do aluno e imprima a sala onde o mesmo irá fazer a prova:
        //A – K: sala 101
        //L – N: sala 102
        //O –Z: sala 103
        String nome = JOptionPane.showInputDialog("Insira seu nome").toUpperCase();
        char inicial = nome.charAt(0);
        
        if (inicial >= 'A' && inicial <= 'K') {
            JOptionPane.showMessageDialog(null, "A – K: Sala 101");
        } else if (inicial >= 'L' && inicial <= 'N') {
            JOptionPane.showMessageDialog(null, "L – N: Sala 102");
        } else if (inicial >= 'O' && inicial <= 'Z') {
            JOptionPane.showMessageDialog(null, "O – Z: Sala 103");
        } else {
            JOptionPane.showMessageDialog(null, "Inicial inválida!");
        }
    }

    public void q72() {
        //72. Faça um programa que leia uma quantia em reais e converta para uma das seguintes moedas:
        //f – franco suíço
        //l – libra
        //d – dólar
        //m – marco alemão
        double quantia = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantia"));
        String moeda = JOptionPane.showInputDialog("Insira a primeira letra da moeda").toUpperCase();

        switch (moeda) {
            case "F":
                JOptionPane.showMessageDialog(null, "Valor convertido: " + (quantia * 3.97));
                break;
            case "L":
                JOptionPane.showMessageDialog(null, "Valor convertido: " + (quantia * 5.13));
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "Valor convertido: " + (quantia * 4.01));
                break;
            case "M":
                JOptionPane.showMessageDialog(null, "Valor convertido: " + (quantia * 2.29));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Moeda Inválida! Apenas F, L, D, M");
                break;
        }

    }

    public void q73() {
        //73 - Faça um programa que leia a altura e o sexo da pessoa, calcule e imprima o seu peso ideal, utilizando as seguintes formulas:
        //Homens: (72,7 * H) - 58
        //Mulheres: (62,1 * H) – 44,7
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));
        String sexo = JOptionPane.showInputDialog("Insira seu sexo [M] para masculino [F] para feminino").toUpperCase();

        switch (sexo) {
            case "M":
                JOptionPane.showMessageDialog(null, "Peso ideal: " + ((72.7 * altura) - 58));
                break;
            case "F":
                JOptionPane.showMessageDialog(null, "Peso ideal: " + ((62.1 * altura) - 44.7));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sexo inválido!");
                break;

        }
    }

    public void q74() {
        //74 - Faça um programa que receba a idade de um nadador e imprima sua categoria segundo a tabela a seguir:
        //Infantil A 5 - 7 anos
        //Infantil B 8 – 10 anos
        //Juvenil A 11 – 13 anos
        //Juvenil B 14 – 17 anos
        //Sênior maiores de 18 anos
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
        if (idade >= 5 && idade <= 7) {
            JOptionPane.showMessageDialog(null, "Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            JOptionPane.showMessageDialog(null, "Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            JOptionPane.showMessageDialog(null, "Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "Categoria: Juvenil B");
        } else if (idade > 18) {//>=18
            JOptionPane.showMessageDialog(null, "Categoria: Sênior");
        } else {
            JOptionPane.showMessageDialog(null, "Idade inválida!");
        }
    }

    public void q75() {
        //75 - Um vendedor de um plano de saúde apresentou a tabela a seguir:
        //Até 10 anos – 30 reais
        //Acima de 10 até 29 anos – 60 reais
        //Acima de 29 até 45 anos – 120 reais
        //Acima de 45 até 59 anos – 150 reais
        //Acima de 59 até 95 anos – 250 reais
        //Maior que 65 anos – 400 reais -> Acima de 95*?
        //Faça um programa que leia o nome e a idade de uma pessoa e imprima o nome e o valor que ela deverá pagar.
        String nome = JOptionPane.showInputDialog("Insira o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
        if (idade <= 10) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor a pagar: 30 reais");
        } else if (idade > 10 && idade <= 29) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor a pagar: 60 reais");
        } else if (idade > 29 && idade <= 45) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor a pagar: 120 reais");
        } else if (idade > 45 && idade <= 59) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor a pagar: 150 reais");
        } else if(idade > 65){
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor a pagar: 400 reais");
        } else if (idade > 59 && idade <= 95) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor a pagar: 250 reais");
        }
    }

    public void q76() {
        //76 - Faça um programa que leia 3 inteiros (variáveis a, b, c) e efetuar cálculo da equação de segundo grau, apresentando: as duas raízes,
        //se para os calores informados for possível fazer o cálculo delta; A mensagem “Não há raízes reais” se não for possível fazer o
        //cálculo delta; e a mensagem “Não é equação de segundo grau” se a for igual a zero.
        double r1;//primeira raiz 
        double r2;//segunda raiz
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: "));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Não é equação de segundo grau");
        } else {
            int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: "));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C: "));
            double delta = ((b * b) - (4 * a * c));//b^2-4.a.c 
            if (delta >= 0) { //delta maior ou igual a zero 
                r1 = (-b + Math.sqrt(delta)) / (2 * a);
                r2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "\nPrimeira raiz: " + r1 + "\nSegunda raiz: " + r2);
            } else { //delta<0 não podemos calcular... 
                JOptionPane.showMessageDialog(null, "Não há raízes reais");
            }
        }
    }

    public void q77() {
        //77 - Sabendo que somente os municípios que possuem mais de 20000 eleitores tem segundo turno nas eleições para prefeito caso o
        //primeiro colocado tenha mais de 50% dos votos, faça um programa que leia o nome do município, a quantidade de eleitores aptos, o
        //numero de votos do candidato mais votado e informar se terá ou não segundo turno em sua eleição municipal.
        String municipio = JOptionPane.showInputDialog("Insira o nome do município");
        int eleitores = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de eleitores aptos"));
        int votos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de votos do candidato mais votado"));

        if (eleitores > 20000 && votos > (eleitores / 2)) {//<50%?
            JOptionPane.showMessageDialog(null, "Município: " + municipio + "\nTerá segundo turno");
        } else {
            JOptionPane.showMessageDialog(null, "Município: " + municipio + "\nNão terá segundo turno");
        }
    }

    public void q78() {
        //78 - Um restaurante fez uma promoção semanal de descontos para clientes de acordo com as iniciais do nome da pessoa. Crie um
        //programa que leia o primeiro nome do cliente, o valor de sua conta e se o nome iniciar coma as letras A, D, M ou S, dar um desconto
        //de 30%. Para o cliente cujo nome não se inicia por nenhuma dessas letras, exibir a mensagem “Que pena. Nesta semana o desconto
        //não é para o seu nome, mas continue a nos prestigiar que sua vez chegará”
        String nome = JOptionPane.showInputDialog("Insira o nome").toUpperCase();
        double conta = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da conta"));
        if (nome.charAt(0) == 'A' || nome.charAt(0) == 'D' || nome.charAt(0) == 'M' || nome.charAt(0) == 'S') {
            JOptionPane.showMessageDialog(null, "Ganhou desconto!\nConta com desconto: " + (conta - (conta * 0.3)));
        } else {
            JOptionPane.showMessageDialog(null, "Que pena. Nesta semana o desconto não é para o seu nome, mas continue a nos prestigiar que sua vez chegará");
        }
    }

    public void q79() {
        //79 - O banco XXX concederá um credito especial com juros de 20% aos seus clientes de acordo com o saldo médio do ultimo ano. Faça
        //um programa que leia o saldo médio de um cliente e calcule o valor do credito de acordo com a tabela a seguir:
        //SALDO MEDIO PERCENTUAL
        //De 0 a 500 nenhum crédito
        //De 501 a 1000 30% do valor do saldo
        //De 1001 a 3000 40% do valor do saldo
        //Acima de 3001 50% do valor do saldo
        //Imprima uma mensagem informando o saldo médio e o valor do credito
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo médio"));
        if (saldo >= 0 && saldo <= 500) {
            JOptionPane.showMessageDialog(null, "Saldo médio: " + saldo + "\nValor do crédito: 0");
        } else if (saldo >= 501 && saldo <= 1000) {
            JOptionPane.showMessageDialog(null, "Saldo médio: " + saldo + "\nValor do crédito: " + (saldo * 0.3));
        } else if (saldo >= 1001 && saldo <= 3000) {
            JOptionPane.showMessageDialog(null, "Saldo médio: " + saldo + "\nValor do crédito: " + (saldo * 0.4));
        } else if (saldo > 3001) {
            JOptionPane.showMessageDialog(null, "Saldo médio: " + saldo + "\nValor do crédito: " + (saldo * 0.5));
        }
    }

    public void q80() {
        //80 - Faça um programa que leia um percurso em Km, o tipo de carro e o consumo estimado de combustível, sabendo-se que um carro tipo
        //C faz 12 Km com um litro de gasolina, um tipo B faz 9 Km e o tipo A faz 8 Km por litro.
        double percurso = Double.parseDouble(JOptionPane.showInputDialog("Insira o percurso em Km"));
        String tipo = JOptionPane.showInputDialog("Insira o tipo do carro [A],[B] ou [C]").toUpperCase();
        switch (tipo) {
            case "A":
                JOptionPane.showMessageDialog(null, "Consumo estimádo de combustível: " + (percurso / 8) + " litros");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Consumo estimádo de combustível: " + (percurso / 9) + " litros");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Consumo estimádo de combustível: " + (percurso / 12) + " litros");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de carro inválido!");
                break;
        }
    }
}
