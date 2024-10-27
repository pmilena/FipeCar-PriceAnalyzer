# FIPE API - Consulta de Preços de Veículos / FIPE API - Vehicle Price Inquiry

Este projeto implementa uma aplicação para consulta de preços de veículos, utilizando a FIPE API HTTP REST, que fornece informações sobre veículos brasileiros. A ideia central é auxiliar quem deseja comprar ou vender um carro, mostrando preços médios baseados em marca, modelo e ano do veículo.

This project implements an application to query vehicle prices using the FIPE HTTP REST API, which provides information on Brazilian vehicles. The main idea is to assist those looking to buy or sell a car by displaying average prices based on vehicle brand, model, and year.

---

## 🔍 Sobre a Tabela FIPE / About the FIPE Table

A **Tabela FIPE** (Fundação Instituto de Pesquisas Econômicas) é uma referência importante para consulta de preços médios de veículos no Brasil. No site oficial, é possível filtrar preços por:

- Mês e ano de referência
- Marca do veículo
- Modelo do veículo
- Ano do veículo e tipo de combustível

Essa tabela serve como base de preços médios de mercado e é atualizada frequentemente.

The **FIPE Table** (Fundação Instituto de Pesquisas Econômicas) is an important reference for consulting average vehicle prices in Brazil. On the official site, it is possible to filter prices by:

- Reference month and year
- Vehicle brand
- Vehicle model
- Vehicle year and fuel type

This table serves as the basis for average market prices and is frequently updated.

---

## 🛠 Funcionalidades / Features

1. **Escolha do tipo de veículo**: Carro, Moto ou Caminhão.
2. **Seleção de marca e modelo**: O usuário escolhe uma marca, e a aplicação retorna os modelos correspondentes.
3. **Listagem de anos de referência e preços**: Após escolher o modelo, a aplicação lista os anos disponíveis e seus preços médios.
4. **Interface via CLI**: A aplicação foi desenvolvida para execução em terminal, sendo fácil de navegar com comandos de texto.
##
1. **Vehicle type selection**: Car, Motorcycle, or Truck.
2. **Brand and model selection**: The user selects a brand, and the application returns the corresponding models.
3. **Listing of reference years and prices**: After selecting the model, the application lists the available years and their average prices.
4. **CLI Interface**: The application is designed for terminal execution, making it easy to navigate with text commands.

---

## 🚀 Exemplo de Uso / Usage Example

Abaixo estão exemplos de interações da aplicação.

Below are examples of application interactions.

1. **Seleção do Tipo de Veículo** / **Vehicle Type Selection**

   **** OPÇÕES / OPTIONS ****
   
- Carro / Car
- Moto / Motorcycle
- Caminhão / Truck

2. **Escolha da Marca** / **Brand Selection**

   Após escolher o tipo de veículo, a aplicação exibe as marcas disponíveis. O usuário deve digitar o código da marca desejada.

   After choosing the vehicle type, the application displays the available brands. The user must enter the desired brand code.

3. **Seleção do Modelo** / **Model Selection**

   Após a marca, a aplicação lista os modelos para o código informado.

   After selecting the brand, the application lists the models for the provided code.

4. **Listagem de Anos e Valores** / **Listing of Years and Prices**

   Após a seleção do modelo, a aplicação exibe todos os anos com preços médios na Tabela FIPE.

   After selecting the model, the application displays all years with average prices in the FIPE Table.

Visualização / Preview:

![image](https://github.com/user-attachments/assets/71250a39-45d6-4d9e-bf39-051e46b47c43)

---

## 🖥 Estrutura da Aplicação / Application Structure

A aplicação foi desenvolvida em **Java** com **Spring Boot**, organizada em pacotes e implementada com o comando `Line Runner` para facilitar a execução e organização de funcionalidades.

- **Pacotes**: Estrutura de pastas organizada por responsabilidade para facilitar a navegação e manutenção do código.
- **Execução**: A aplicação é executada no terminal com interação dinâmica para busca de preços.

The application was developed in **Java** with **Spring Boot**, organized into packages, and implemented with the `Line Runner` command to facilitate the execution and organization of functionalities.

- **Packages**: Folder structure organized by responsibility to facilitate code navigation and maintenance.
- **Execution**: The application runs in the terminal with dynamic interaction for price search.

---

## 📑 Documentação da API / API Documentation

Para mais detalhes sobre a FIPE API, consulte a [Documentação Oficial](https://deividfortuna.github.io/fipe/).

For more details about the FIPE API, please refer to the [Official Documentation](https://deividfortuna.github.io/fipe/).
