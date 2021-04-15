# PUC Anamnese Grupo 07

Este sistema tem como objetivo de apontar um ***possível pré-diagnóstico*** um paciente identificado sobre qual possível doença que ele possui através dos sintomas informados. Tal pré-diagnóstico não garante, porém, auxilia na identificação das doenças do paciente.

# Contextualização

Este projeto contempla os requisitos apresentados para a **Unidade de Aprendizagem: Projeto Integrator I-A**. Os requisitos regem a necessidade de pré-diagnosticar um determinado paciente através da análise de seus sintomas apresentados. Contudo, aqui dizemos que *apontamos um possível pré-diagnóstico*, devido a complexidade desta análise.

A esta coletagem dos sintomas, excluindo as condições de saúde do paciente (irrelevante para este projeto), damos o nome de **anamnese**. Sabemos que este nome vai além do que fazemos, mas consideramos que o que fazemos realiza uma pequena parte desse procedimento, então, assim o nomeamos.

## Por que fazemos anamnese do paciente?

**Anamnese** e o ato de realizar uma entrevista a um paciente por profissional de saúde, com o objetivo de relembrar todos os fatos relacionados ao que o paciente está sentindo, reclamando, revelando ao profissional de saúde. Com o colhimento destes dados, alguns apontamentos podem ser realizados, dentre eles, a possível doença do paciente.

## Quem é o usuário deste projeto

Este projeto visa o uso por um **profissional de saúde**.

## Quem é diagnosticado

Um **paciente** atendido por um profissional de saúde.

## Benefícios oferecidos pelo Pré-diagnóstico do Sistema

Com a informações dos sintomas do paciente, podemos oferecer um rápido apontamento das possíveis doenças que ele *pode* ter.

# Como usar o sistema

### Compreender o que o usuário deseja

No menu inicial, o usuário irá informar o que deseja, selecionando uma das seguintes opções:

```bash
Olá, bem-vindo ao PUC Anamnese Grupo 07 - Anamnese.

Aqui você poderá obter, de forma ágil, um possível pré-diagnóstico de algum paciente sendo atendido.

Vamos começar?

--
1) Listar doenças reconhecidas
2) Listar sintomas
3) Realizar anamnese
4) Sair
--
Informe o que deseja fazer: _
```

**Opção 1 - Listar doenças reconhecidas:** aqui você vai obter a lista de doenças que o sistema reconhece.

**Opção 2 - Listar sintomas:** aqui você vai obter uma lista de possíveis sintomas dentre as doenças reconhecidas pelo sistema.

**Opção 3 - Realizar anamnese:** aqui você vai poder informar os sintomas reportados pelo paciente e obter um rápido possível pré-diagnóstico do paciente.

### Opção 1 - Listar doenças reconhecidas

Ao selecionar a `opção 1`, você terá o seguinte resultado:

```bash
As doenças reconhecidas pelo sistema são:

- Influenza (H1N1)
- Pneumonia
- Corona Virus (Covid-19)

--

Vamos continuar?

--
1) Listar doenças reconhecidas
2) Listar sintomas
3) Realizar anamnese
-
4) Sair
--
Informe o que deseja fazer: _
```

### Opção 2 - Listar sintomas

Ao selecionar a `opção 2`, você terá o seguinte resultado:

```bash
Vamos listar os possíveis sintomas reconhecidos. Para isso, selecione uma doença:

1) Influenza (H1N1)
2) Pneumonia
3) Corona Virus (Covid-19)
-
4) Voltar
--
Deseja listar os sintomas de qual doença: _
```

Ao selecionar uma doença, você terá o seguinte resultado:

```bash
Você selecionou: INFLUENZA (H1N1)

Os sintomas são:

- Febre;
- Tosse;
- Coriza;
- Dor de garganta;
- Dor muscular;
- Dor de cabeça;
- Mal-estar;
- Irritação nos olhos;
- Falta de apetite;
- Falta de ar;
- Calafrios;
- Cansaço e fadiga;
- Vômitos e náuseas e
- Diarreia.

--

Selecione outra doença:

1) Influenza (H1N1)
2) Pneumonia
3) Corona Virus (Covid-19)
-
4) Voltar
--
Deseja listar os sintomas de qual doença: _
```

### Opção 3 - Realizar anamnese

Ao selecionar a `opção 3`, você terá o seguinte resultado:

```bash
Por favor informe o(s) sintoma(s) do paciente:

Sintomas:

1) Febre
2) Tosse seca
3) Tosse com catarro esverdeado ou com sangue
4) Dores musculares
5) Dor de cabeça
6) Dificuldade de respirar
7) Cansaço e fadiga
8) Coriza
9) Falta de apetite
10) Calafrios
11) Vômitos e náuseas
12) Perda de paladar
13) Perda de olfato
14) Erupção cutânea na pele
15) Descoloração dos dedos das mãos ou dos pés
16) Perda de fala ou movimento
17) Respiração mais rápida que o normal
18) Suor noturno
19) Dor no peito
20) Conjutivite
21) Diarreia
22) Dor de Garganta
--
V) Voltar
F) Finalizar
--
Informe o sintoma ou digite "D" para diagnosticar ou "V" para voltar: _
```
### Opção F - Finalizar
Ao selecionar a opção `Finalizar` o programa fará a análise e exibirá o resultado da anamnese informando qual a provável doença contraída.

```bash
De acordo com os dados informados a probabilidade do paciente ter contraído as seguintes doenças é:
--
Covid-19: Alta
Influenza H1N1: Média
Pneumonia: Baixa
--
Voltar ao menu inicial? (S - Sim /N - Não): _
```