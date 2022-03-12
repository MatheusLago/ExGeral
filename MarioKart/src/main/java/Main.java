public class Main {

    public static void main(String[] args) {

     Kart kart1 = new Kart();
     Kart kart2 = new Kart();

     kart1.nome = "Kart1";
     kart2.nome = "Kart2";

     kart1.motor.velocidadeMaxima = 350;
     kart1.motor.cilindradas = "994";

     kart2.motor.velocidadeMaxima = 332;
     kart2.motor.cilindradas = "996";

     Piloto piloto1 = new Piloto();
     Piloto piloto2 = new Piloto();

     piloto1.nome = "Piloto1";
     piloto2.nome = "Piloto2";

     kart1.piloto = piloto1;
     kart2.piloto = piloto2;

     piloto1.soltaSuperPoder();
     piloto2.soltaSuperPoder();

     kart1.fazerDrift();
     kart2.soltarTurbo();

     kart1.motor.mostraIndo();
     kart2.motor.mostraIndo();

    }

}
