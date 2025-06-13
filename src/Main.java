import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;
        do {
            System.out.println("================================================");
            System.out.println("escolha uma das opções");
            System.out.println("1 dar banho no pet");
            System.out.println("2 abastecer a maquina com agua");
            System.out.println("3 abstecer a maquina com shampoo");
            System.out.println("4 verifica agua da maquina");
            System.out.println("5 verifica shampoo da maquina");
            System.out.println("6 verifica se tem pet no banho");
            System.out.println("7 colocar pet na maquina");
            System.out.println("8 retirar pet da maquina");
            System.out.println("9 limpar a maquina");
            System.out.println("0 sair");
            System.out.println("================================================");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShapoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMacghine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("opção invalida");
            }
        } while (true);
    }

    private static void setWater(){
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void setShapoo(){
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addShapoo();
    }

    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("a maquina esta no momento com " + amout + " litro(s) de agua");
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("a maquina esta no momento com " + amout + " litro(s) de shampoo");
    }

    private static void checkIfHasPetInMacghine() {
        var hasPEt = petMachine.hasPet();
        System.out.println(hasPEt ? "tem pet na maquina":"não tem pet na maquina");
    }

    private static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("informe o nome do pet: ");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("o pet " + pet.getName() + " foi colocado na maquina");
    }
}
