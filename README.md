# PetShop – Sistema de Controle da Máquina de Banho

## Descrição

Este projeto simula o controle de uma máquina de banho para pets, implementado em Python. A aplicação gerencia o abastecimento de água e shampoo, o banho de um pet por vez e a limpeza da máquina, garantindo o uso eficiente dos recursos e o controle do processo de banho.

## Funcionalidades

- Dar banho no pet (consome água e shampoo);
- Abastecer água (2 litros por vez até o máximo de 30 litros);
- Abastecer shampoo (2 litros por vez até o máximo de 10 litros);
- Verificar nível atual de água e shampoo;
- Verificar se há um pet na máquina;
- Colocar um pet na máquina (somente se a máquina estiver limpa e vazia);
- Retirar o pet da máquina (se o pet não estiver limpo, a máquina fica suja);
- Limpar a máquina (consome água e shampoo para permitir uso de novo).

## Regras do Sistema

- A máquina só permite 1 pet por vez;
- Cada banho consome 10 litros de água e 2 litros de shampoo;
- A capacidade máxima da máquina é 30 litros de água e 10 litros de shampoo;
- Caso o pet seja retirado sem estar limpo, a máquina fica suja e precisa ser limpa para aceitar outro pet;
- A limpeza consome 3 litros de água e 1 litro de shampoo;
- O abastecimento é feito em incrementos de 2 litros para água e shampoo.

## Tecnologias

- Python 3.x

## Como usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/guilhermecunha777/petShop.git
