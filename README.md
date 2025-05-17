# Projeto: Builder Pattern - Montagem de PCs Personalizados

Este projeto demonstra a aplicação do padrão de projeto **Builder** em Java utilizando como contexto a montagem de computadores personalizados. Ao invés de utilizar exemplos tradicionais como carros, optamos por um cenário mais próximo da realidade de desenvolvedores e entusiastas de tecnologia: a construção de PCs com diferentes combinações de componentes.

##  Objetivo

O objetivo é mostrar como o padrão Builder permite construir objetos complexos passo a passo, separando a lógica de construção da representação final do objeto. Isso facilita a criação de múltiplas variações de um produto sem duplicar código e sem usar construtores longos ou confusos.

##  Componentes Modelados

Ao invés de usar `String`s simples para definir partes do PC, cada componente foi modelado como uma **classe específica**:

- `CPU` – Representa o processador do computador.
- `GPU` – Representa a placa de vídeo (dedicada ou integrada).
- `Storage` – Representa o tipo de armazenamento (HDD, SSD, NVMe).
- `OS` – Representa o sistema operacional.
- RAM – Representada como um valor numérico (GB), por simplicidade.

Essas classes fornecem melhor encapsulamento, coesão e futura capacidade de validação entre componentes.

##  Estrutura do Projeto

O projeto é dividido em três partes principais:

- **Builder**: Define a interface e as implementações concretas (`PCBuilder` para criar o PC físico e `PCManualBuilder` para criar um manual descritivo).
- **Product**: Contém os objetos finais construídos (`PC` e `PCManual`).
- **Componentes**: (`CPU`, `GPU`, `Storage`, `OS`).
- **Director**: Orquestra o processo de montagem de diferentes tipos de PCs, como `PC Gamer`, `PC para Escritório` e `Estação de Trabalho`.

##  Funcionamento

A classe `Main` demonstra como utilizar o padrão. Um `Director` recebe um `Builder` e executa a sequência de construção desejada. Com isso, é possível gerar:

- Um objeto real (`PC`) com as configurações completas.
- Um manual (`PCManual`) contendo as descrições dos mesmos componentes.

##  Aprendizado

Esse projeto é uma ótima base para quem quer:

- Entender o padrão Builder na prática.
- Aprender sobre separação de responsabilidades na orientação a objetos.
- Modelar domínios com foco em componentes reutilizáveis.

## Conceitos Aplicados

- Padrão de Projeto **Builder** (GoF)
- Princípio da responsabilidade única (SRP)
- Programação orientada a objetos
- Reutilização de lógica de montagem com múltiplas representações do produto final

---

Sinta-se à vontade para explorar, adaptar e evoluir esse projeto com novos tipos de computadores, validações entre componentes e até integração com UI para montagem interativa.
