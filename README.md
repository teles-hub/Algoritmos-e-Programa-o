# Algoritmos e Programação

Repositório de **estudos acadêmicos de algoritmos e programação em Java**. Ele não é um aplicativo nem um projeto profissional: reúne exercícios de aula e algumas atividades independentes feitas durante o curso de Análise e Desenvolvimento de Sistemas.

## Conteúdo

- `aula1.java` a `aula4.java`, `ExerciciosAula2.java` e `jogo.java` — exercícios da raiz.
- `pastaAula3/` a `pastaAula8/` — exercícios organizados por aula.

São **62 arquivos Java**, todos no repositório. Alguns exercícios usam pacotes (por exemplo `aula7Faculdade`, `exerciciosAula5`, `exerciciosAula6` e `exerciciosAula7`); os demais ficam no pacote padrão.

## Como compilar

Cada diretório pode ser compilado separadamente com o JDK instalado:

```bash
cd pastaAula3
javac -d saida *.java
```

Verificação realizada em 25/11/2026: os sete diretórios (raiz, `pastaAula3`, `pastaAula4`, `pastaAula5`, `pastaAula6`, `pastaAula7` e `pastaAula8`) compilaram sem erros com `javac` 27. O diretório de saída precisa ser criado fora do repositório ou removido depois, para não poluir o histórico.

## Observações

- Alguns nomes de arquivos preservam erros de digitação originais, como `ExercicioPrinfAula3.java` e `exercicio6Aula.java`. Eles foram mantidos porque o nome do arquivo e o nome da classe pública precisam coincidir para o Java compilar.
- As credenciais que aparecem em exercícios, como a senha em `pastaAula4/exercicio8Aula4.java`, são valores fictícios usados apenas para praticar validação de entrada. Não são credenciais reais.
- Não há README por aula, testes automatizados ou um ponto de entrada único. Cada arquivo é um exercício independente com seu próprio `main`, quando aplicável.

## Tecnologias

Java (JDK).
