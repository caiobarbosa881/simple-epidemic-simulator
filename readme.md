# 🧪 Simple Epidemic Simulator

Projeto científico simples desenvolvido em Java + Spring Boot para simular a propagação de uma epidemia em uma população usando regras lógicas e probabilidade básica.

O objetivo do projeto é aplicar conceitos de simulação computacional e pensamento científico sem exigir conhecimentos avançados de matemática ou física.

## Conceito

Cada pessoa da simulação pode estar em um dos seguintes estados:

- SAUDAVEL  
- INFECTADO  
- RECUPERADO  

Regras básicas:
- Pessoas infectadas podem infectar pessoas saudáveis com uma taxa de infecção (probabilidade).
- Pessoas infectadas se recuperam após um número fixo de dias.
- A simulação evolui dia a dia.

## Arquitetura

├── model → Entidades e enums
├── simulation → Lógica da simulação científica
├── service → Execução e controle da simulação
└── controller → (futuro) API REST

markdown
Copiar código

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Funcionamento

1. Uma população inicial é criada.
2. Uma pessoa começa infectada.
3. A simulação roda por um número definido de dias.
4. Ao final, a população é dividida entre saudáveis, infectados e recuperados.

Os principais parâmetros da simulação são:
- Tamanho da população
- Taxa de infecção
- Dias para recuperação
- Número de dias simulados

## Objetivo Educacional

Este projeto tem foco em:
- Aprender Java e Spring Boot
- Entender simulações computacionais simples
- Desenvolver pensamento científico aplicado à programação
- Criar um projeto de portfólio com abordagem científica

## Próximos Passos

- Criar endpoint REST para execução da simulação
- Gerar estatísticas por dia
- Persistir resultados no banco de dados
- Evoluir o modelo de simulação

Projeto educacional para fins de estudo e aprendizado.

## ▶️ Como Rodar o Projeto

### Pré-requisitos
Antes de rodar o projeto, certifique-se de ter instalado:

- Java 17 ou superior
- Maven
- IntelliJ IDEA (recomendado)

---

### ENDPOINT

/simulate em uma API rest para ver os resultados.