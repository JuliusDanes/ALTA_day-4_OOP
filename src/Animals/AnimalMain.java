package Animals;

public class AnimalMain {
    public static void main(String[] args) {

        Animal hewan = new Animal("Binatang");
        Herbivor herbiv = new Herbivor("Kambing");
        Omnivora omni = new Omnivora("Ayam");
        Carnivor carni = new Carnivor("Singa");

        hewan.identify_myself();
        herbiv.identify_myself();
        carni.identify_myself();
        omni.identify_myself();
    }
}
