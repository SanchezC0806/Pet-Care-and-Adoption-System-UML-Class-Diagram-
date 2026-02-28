public class Veterinarian extends Person implements PetCareService {
 
    public void treatPet(Animal animal) {
        System.out.println(getName() + " is treating the pet.");
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