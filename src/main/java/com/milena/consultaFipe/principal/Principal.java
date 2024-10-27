package com.milena.consultaFipe.principal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.milena.consultaFipe.model.Dados;
import com.milena.consultaFipe.model.Modelo;
import com.milena.consultaFipe.model.Veiculo;
import com.milena.consultaFipe.service.ConsumoApi;
import com.milena.consultaFipe.service.ConverteDados;
import com.milena.consultaFipe.service.TransformaPlural;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    Scanner leitor = new Scanner(System.in);
    TransformaPlural formatador = new TransformaPlural();
    ConsumoApi consumo = new ConsumoApi();
    ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";


    public void ExibeMenu(){
        System.out.println("""
	***OPÇÕES***
	Carro
	Moto
	Caminhão
	
	Digite uma das opções para consultar valores:
	""");
    }

    public void consultaItem() throws JsonProcessingException {
        String itemPesquisado = "";


        while (!itemPesquisado.equals("carros") && !itemPesquisado.equals("caminhoes") && !itemPesquisado.equals("motos")) {
            this.ExibeMenu();
            itemPesquisado = formatador.toPlural(leitor.nextLine().toLowerCase());
            System.out.println("TESTE: " + itemPesquisado);

            if (itemPesquisado.equals("carros") || itemPesquisado.equals("caminhoes") || itemPesquisado.equals("motos")) {
                var json = consumo.obterDados(ENDERECO + itemPesquisado + "/marcas");
                var marcas = conversor.obterLista(json, Dados.class);
                marcas.stream()
                                .sorted(Comparator.comparing(Dados::codigo))
                                        .forEach(System.out::println);

                System.out.println("Digite o código do modelo que deseja pesquisar: ");
                var codigoMarca = leitor.nextLine();

                json= consumo.obterDados(ENDERECO + itemPesquisado + "/marcas/" + codigoMarca + "/modelos");
                var modelo = conversor.obterDados(json, Modelo.class);

                System.out.println("\n Lista de Modelos: ");
                modelo.modelos().stream()
                        .sorted(Comparator.comparing(Dados::codigo))
                        .forEach(System.out::println);

                System.out.println("Digite um trecho do nome do veículo para consulta");
                var nomeVeiculo = leitor.nextLine();

                List<Dados> listaMarcas= modelo.modelos().stream()
                        .filter(v->v.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                        .collect(Collectors.toList());

                System.out.println("\n Modelos Filtrados:");
                listaMarcas.forEach(System.out::println);
                System.out.println("\n Digite o código do modelo que deseja pesquisar: ");
                var codigoModelo = leitor.nextLine();

                json= consumo.obterDados(ENDERECO + itemPesquisado + "/marcas/" + codigoMarca + "/modelos/" + codigoModelo + "/anos");
                var marca = conversor.obterLista(json,Dados.class);
                List<Veiculo> listaVeiculo = new ArrayList<>();

                for (int i = 0; i < marca.size(); i++){
                    json= consumo.obterDados(ENDERECO + itemPesquisado + "/marcas/" + codigoMarca + "/modelos/" + codigoModelo + "/anos/" + marca.get(i).codigo());
                    var itemVeiculo = conversor.obterDados(json, Veiculo.class);
                    listaVeiculo.add(itemVeiculo);
                }

                listaVeiculo.forEach(v-> System.out.println(
                        "Valor: " + v.valor() +
                        " Marca: " + v.marca() +
                                " Modelo: " + v.modelo() +
                                " Ano: " + v.ano() +
                                " Combustível: " + v.combustivel()
                        ));

            } else {
                System.out.println("Digite uma opção válida");
            }
        }

    }
}
