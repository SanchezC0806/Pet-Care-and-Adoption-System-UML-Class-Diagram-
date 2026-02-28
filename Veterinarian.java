public class Veterinarian implements PetCareService {

    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public void treatPet(Animal animal) {
        System.out.println(name + " is treating the pet.");
    }

    public void updateRecord(MedicalRecord record) {
        System.out.println("Updating medical record...");
    }

    @Override
    public void feedPet(Animal animal) {
        System.out.println("Vet feeds the pet.");
    }

    @Override
    public void playWithPet(Animal animal) {
        System.out.println("Vet plays with the pet.");
    }

    @Override
    public void groomPet(Animal animal) {
        System.out.println("Vet grooms the pet.");
    }
}
