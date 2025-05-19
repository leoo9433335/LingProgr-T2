RomanDSL – Interpretação de Números Romanos com ANTLR4

Domínio de aplicação
            Este projeto demonstra a criação de uma DSL externa (Domain Specific Language) utilizando ANTLR4 para interpretar e validar números romanos, com foco em usuários não técnicos, como historiadores, professores, colecionadores e estudantes que lidam com registros em notações romanas.


🧰 Ferramentas Utilizadas

            Linguagem: Java

            Gerador de parser: ANTLR4

            DSL: externa, baseada em notação romana (ex: XIV, MMXXV)

            Código: 100% open-source

📦 Instalação

1. Clone o repositório

            git clone https://github.com/leoo9433335/LingProgr-T2.git

2. Instale o Java JDK

Instale o JDK caso ainda não esteja disponível em sua máquina.

3. Baixe o ANTLR4
Baixe o .jar do ANTLR4:

            👉 antlr-4.X-complete.jar

Salve-o na raiz do projeto.

4. Gerar Arquivos .java
Tem que estar na pasta example do projeto 

            T2LingProg\LingProgr-T2\demo\src\main\java\com\example

compilar no cmd 

            java -jar antlr-4.13.0-complete.jar Roman.g4 -visitor -package com.example  


5. Criar o Arquivo RomanDecoder.java com este codigo
        package com.example;
        import java.util.List;
        import java.util.stream.Collectors;

        public class RomanDecoder extends RomanBaseVisitor<Integer> {

        /*************  ✨ Windsurf Command ⭐  *************/
        /*******  da2d06bb-9e5e-4634-ba78-da0b20234a86  *******/
            
        private static int sum(List<Integer> nums) {
            if (nums == null || nums.isEmpty()) return 0;
            int sum = nums.get(nums.size() - 1);
            for (int i = 0; i < nums.size() - 1; i++) {
                int current = nums.get(i);
                int next = nums.get(i + 1);
                if (current < next) {
                    sum -= current;
                } else {
                    sum += current;
                }
            }
            return sum;
        }

            @Override
            public Integer visitRoot(RomanParser.RootContext ctx) {
                return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList()));
            }

            @Override public Integer visitUnits(RomanParser.UnitsContext ctx) { return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList())); }
            @Override public Integer visitTens(RomanParser.TensContext ctx) { return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList())); }
            @Override public Integer visitHundreds(RomanParser.HundredsContext ctx) { return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList())); }

            @Override public Integer visitOne(RomanParser.OneContext ctx) { return 1; }
            @Override public Integer visitFive(RomanParser.FiveContext ctx) { return 5; }
            @Override public Integer visitTen(RomanParser.TenContext ctx) { return 10; }
            @Override public Integer visitFifty(RomanParser.FiftyContext ctx) { return 50; }
            @Override public Integer visitOneHundred(RomanParser.OneHundredContext ctx) { return 100; }
            @Override public Integer visitFiveHundred(RomanParser.FiveHundredContext ctx) { return 500; }
            @Override public Integer visitOneThousand(RomanParser.OneThousandContext ctx) { return 1000; }
        }

A) Entrada no Programa

            MMMCMLXI
            MCMXC 
            MMVIII 
            MCMLIV 


B)Saida do Programa 

            Roman: MMMCMLXI = 3961
            Roman: MCMXC = 1990
            Roman: MMVIII = 2008
            Roman: MCMLIV = 1954


C) Ações semânticas

/ regra inicial: composição de milhares, centenas, dezenas e unidades
root 
            : (oneThousand)* hundreds? tens? units? 
            ; 
            // 🔧 Ação semântica: a lista de tokens reconhecidos aqui será convertida em inteiros 
            // e somada posteriormente com a verificação semântica feita no Java (RomanDecoder.java).

/REGRA UNIDADE
units 
            : one ((one)* | five  | ten) 
            | five (one)* 
            ;
            // 🔧 Ação semântica: valores correspondentes a I, V e X são convertidos em 1, 5 e 10.

/REGRA DEZENA
tens  

            : ten ((ten)* | fifty | oneHundred) 
            | fifty (ten)* 
            ;
            // 🔧 Ação semântica: X = 10, L = 50, C = 100.

/REGRA CENTENA
hundreds 
            : oneHundred ((oneHundred)* | fiveHundred | oneThousand) 
            | fiveHundred (oneHundred)* 
            ;
            // 🔧 Ação semântica: C = 100, D = 500, M = 1000.


D)Ação adicional verificação se respeita diretriz de números romanos
 no arquivo RomanDecoder.java 

            int repeatCount = 1;
                for (int i = 1; i < nums.size(); i++) {
                    if (nums.get(i).equals(nums.get(i - 1))) {
                        repeatCount++;
                        if (repeatCount > 3) {
                            throw new IllegalArgumentException("Número romano inválido: mais de 3 repetições seguidas.");
                        }
                    } else {
                        repeatCount = 1;
                    }
                }

                // Validação 2: subtrações inválidas (ex: I antes de L ou C)
                for (int i = 0; i < nums.size() - 1; i++) {
                    int current = nums.get(i);
                    int next = nums.get(i + 1);
                    if (current < next && (current * 10 < next)) {
                        throw new IllegalArgumentException("Número romano inválido: subtração não permitida.");
                    }
                }


👨‍💻 Autores

            Nome do Aluno 1  Leonardo Duarte da Silva

            Nome do Aluno 2 Cecilia Ricalcati da Silveira

            Nome do Aluno 3 Brenda Brizola de Oliveira



