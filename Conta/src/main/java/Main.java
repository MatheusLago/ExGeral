public class Main {

    public static void main(String[] args) {


        Conta conta = new Conta();

        conta.saca(80);

        conta.saca(100);

        conta.saca(10000);

        System.out.println(conta.getSaldo());

    }

}
