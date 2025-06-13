public class PetMachine {
    private boolean clear = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower(){
        if (this.pet== null){
            System.out.println("coloca o pet na maquina de banho");
            return;
        }
        this.water -= 10;
        this.shampoo -=2;
        pet.setClean(true);
        System.out.println("o pet " + pet.getName() + "está limpo");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("a capacidade de agua da maquina esta no maximo");
            return;
        }
        water += 2;
    }
    public void addShapoo() {
        if (shampoo == 10) {
            System.out.println("a capacidade de shampoo da maquina esta no maximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
//        if (this.clear) {
//            System.out.println("a maquina esta suja, é necessario limpar");
//            return;
//        }
        if (this.pet != null){
            System.out.println("o pet " + this.pet.getName() + " esta na maquina nesse momento");
            return;
        }

        this.pet = pet;
    }
    public void removePet(){
        this.clear = this.pet.isClean();
        System.out.println("o pet " + this.pet.getName() + " esta limpo");
        this.pet = null;
    }
    public void wash(){
        this.water -=10;
        this.shampoo -=2;
        this.clear = true;
        System.out.println("a maquina esta limpa");
    }
}
