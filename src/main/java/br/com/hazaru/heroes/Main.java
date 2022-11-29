package br.com.hazaru.heroes;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {

        /*List<Telefones> t1 = new ArrayList<>();
        t1.add(new Telefones(1, 2, 3, 4));

        ArrayList<TelefoneDTO> tDto = new ArrayList<>();


        ArrayList<Cliente> cli = new ArrayList<>();

        cli.add(new Cliente(1, "Rafa", "Cruz", t1));

        Iterator<Cliente> it = cli.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        HashMap<Integer, Contas> hash = new HashMap<>();

        for (int i = 0; i <= hash.size(); i++) {
            hash.put(1, new Contas(1, "Luz 1", 370.0, StatusPagamento.PAGO));
            hash.put(2, new Contas(2, "Luz 2", 280.0, StatusPagamento.PAGO));
            hash.put(3, new Contas(3, "Agua 1", 220.0, StatusPagamento.PAGO));
            hash.put(4, new Contas(4, "Telefone Monica", 85.0, StatusPagamento.PAGO));
            hash.put(5, new Contas(5, "Celular Claro", 160.0, StatusPagamento.PAGO));
            hash.put(6, new Contas(6, "Internet Vivo", 165.0, StatusPagamento.PAGO));
            hash.put(7, new Contas(7, "Telefone Vivo Te", 25.0, StatusPagamento.PAGO));
            hash.put(8, new Contas(8, "Giulia", 450.0, StatusPagamento.PAGO));
            hash.put(9, new Contas(9, "Faculdade Monica", 100.0, StatusPagamento.PAGO));
            hash.put(10, new Contas(10, "Kumon", 680.0, StatusPagamento.PAGO));
            hash.put(11, new Contas(11, "Faculdade", 100.0, StatusPagamento.PAGO));
            hash.put(12, new Contas(12, "Carro", 350.0, StatusPagamento.PAGO));
            hash.put(13, new Contas(13, "Empréstimo Santander", 1300.0, StatusPagamento.PAGO));
            hash.put(14, new Contas(13, "Cartoes", 2000.0, StatusPagamento.PAGO));
            hash.put(15, new Contas(14, "TV Claro", 90.0, StatusPagamento.PAGO));
            hash.put(16, new Contas(15, "Multas", 750.0, StatusPagamento.PAGO));
        }
        //BiConsumer<Integer, Contas> contas = (x, y) -> System.out.println(x.toString() + " " + y.getId() + " " + y.getDescricao() + " " + y.getDescricao() + " " + y.getValor());

        BiConsumer<Integer, Contas> contas = new MyBiConsumer();

        //hash.forEach(contas);

        //hash.entrySet().forEach(System.out::println);
        DoubleStream doubleStream = hash.values().stream().mapToDouble(x -> x.getValor());
        retornaValorTotal(hash);
        System.out.println("O valor total é de : " + doubleStream.parallel().sum());

    }

    private static void retornaValorTotal(HashMap<Integer, Contas> hash) {
        DoubleStream doubleStreamKey = hash.keySet().stream().mapToDouble(x -> x.doubleValue());
    }
}

/*BiFunction<Integer, Contas, Exception> b = new BiFunction<>() {
            @Override
            public DoubleStream apply(Integer integer, Contas contas) {
                if(integer == null && contas == null){
                    throw new Exception("Valores nulos");
                }
            }
        };*/
