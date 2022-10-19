public class Main {
    public static void main(String[] args) {
        Endereco enderecoRestaurante2 = new Endereco("132476-650", "Praça da Paz");

        Endereco enderecoRestaurante1 = new Endereco("13142-300", "Bloco 12");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Cantina da Maria");
        restaurante.setCnpj("0134979204/0001-64");
        restaurante.setEndereco(enderecoRestaurante1);

        System.out.println(restaurante);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante de Fulano");
        restaurante2.setCnpj("248579524/0001-27");
        restaurante2.setEndereco(enderecoRestaurante2);

        System.out.println(restaurante2);

    }
}