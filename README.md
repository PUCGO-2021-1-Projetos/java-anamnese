# PUC Anamnese Grupo 07

Este sistema tem como objetivo de apontar um ***possível pré-diagnóstico*** uma pessoa sobre qual possível doença que ela possui através dos sintomas informados. Tal pré-diagnóstico não garante, porém, auxilia na identificação das doenças do paciente.

# Contextualização

Este projeto contempla os requisitos apresentados para a **Unidade de Aprendizagem: Projeto Integrator I-A**. Os requisitos regem a necessidade de pré-diagnosticar um determinado paciente através da análise de seus sintomas apresentados. Contudo, aqui dizemos que *apontamos um possível pré-diagnóstico*, devido a complexidade desta análise.

A esta coletagem dos sintomas, excluindo as condições de saúde do paciente (irrelevante para este projeto), damos o nome de **anamnese**. Sabemos que este nome vai além do que fazemos, mas consideramos que o que fazemos realiza uma pequena parte desse procedimento, então, assim o nomeamos.

## Por que fazemos anamnese do paciente?

**Anamnese** e o ato de realizar uma entrevista a um paciente por profissional de saúde, com o objetivo de relembrar todos os fatos relacionados ao que o paciente está sentindo, reclamando, revelando ao profissional de saúde. Com o colhimento destes dados, alguns apontamentos podem ser realizados, dentre eles, a possível doença do paciente.

## Quem é o usuário deste projeto

Este projeto visa o uso por um **profissional de saúde**.

## Quem é diagnosticado

Uma **pessoa** com queixas de saúde.

## Benefícios oferecidos pelo Pré-diagnóstico do Sistema

Com a informações dos sintomas da pessoa, podemos oferecer um rápido apontamento das possíveis doenças que ele *pode* ter.

# Como usar o sistema

### Compreender o que o usuário deseja

No menu inicial, o usuário irá informar o que deseja, selecionando uma das seguintes opções:

```bash
Olá, bem-vindo ao PUC Anamnese Grupo 07 - Anamnese.

Aqui você poderá obter, de forma ágil, um possível pré-diagnóstico sobre suas queixas.

Vamos começar?

--
1) Listar doenças reconhecidas
2) Listar sintomas
3) Realizar anamnese
--
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

- Corona Virus (Covid-19)
- H1N1 (Influenza)
- Pneumonia

--

Vamos continuar?

--
1) Listar doenças reconhecidas
2) Listar sintomas
3) Realizar anamnese
--
4) Sair
--

Informe o que deseja fazer: _
```

### Opção 2 - Listar sintomas

Ao selecionar a `opção 2`, você terá o seguinte resultado:

```bash
Vamos listar os possíveis sintomas reconhecidos. Para isso, selecione uma doença:

--
1) Corona Virus (Covid-19)
2) H1N1 (Influenza)
3) Pneumonia
--
V) Voltar
--

Escolha uma doença para para listar os sitomas: _
```

Ao selecionar uma doença, você terá o seguinte resultado:

```bash
Você selecionou: H1N1 (Influenza) (alias: H1N1)

Os sintomas são:

- Calafrios
- Cansaço e Fadiga
- Coriza
- Descoloração dos dedos das mãos ou dos pés
- Diarreia
- Dificuldade de respirar
- Dor de cabeça
- Dor de Garganta
- Dores musculares
- Falta de apetite
- Falta de ar
- Febre
- Irritação nos olhos
- Mal-estar
- Tosse
- Vômitos e náuseas

--
1) Corona Virus (Covid-19)
2) H1N1 (Influenza)
3) Pneumonia
--
V) Voltar
--

Escolha uma doença para para listar os sitomas: _
```

### Opção 3 - Realizar anamnese

Ao selecionar a `opção 3`, você terá o seguinte resultado:

```bash
Por favor informe o(s) sintoma(s) do paciente:

1) Calafrios
2) Cansaço e Fadiga
3) Conjutivite
4) Coriza
5) Descoloração dos dedos das mãos ou dos pés
6) Diarreia
7) Dificuldade de respirar
8) Dor de cabeça
9) Dor de Garganta
10) Dor no peito
11) Dores musculares
12) Erupção cutânea na pele
13) Falta de apetite
14) Falta de ar
15) Febre
16) Irritação nos olhos
17) Mal-estar
18) Perda de fala ou movimento
19) Perda de olfato
20) Perda de paladar
21) Respiração mais rápida que o normal
22) Suor noturno
23) Tosse
24) Tosse com catarro esverdeado ou com sangue
25) Tosse seca
26) Vômitos e náuseas
--
Informe o sintoma ou ("D": diagnosticar, "V": Voltar, "R": recomeçar): _ 
```
### Opção D - Diagnosticar
Ao selecionar a opção `Diagnosticar` o programa fará a análise e exibirá o resultado da anamnese informando qual a provável doença contraída.

```bash
De acordo com os dados informados a probabilidade do paciente ter contraído as seguintes doenças é:
- COVID19: PROVÁVEL
- H1N1: PROVÁVEL
- PNEUMONIA: POUCO PROVÁVEL

Procure um médico informando o pré-diagnostico.
Lembre-se, o pré-diagnostico não exclui mudanças de possibilidades, pois os sintomas podem mudar e outros diagnósticos podem identificar novas doenças.
```
