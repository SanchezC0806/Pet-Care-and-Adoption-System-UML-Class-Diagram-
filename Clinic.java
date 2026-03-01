public class Clinic {
    public String clinicName;
    public String Location;

    public void scheduleAppointment(Appointment appt){

    }

}

class Appointment{
    private int appointmentId;
    private String date;
    private String time;

    public void setAppointmentId(int appointmentId){
        this.appointmentId = appointmentId;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setTime(String time){
        this.time = time;
    }

    public int getAppointmentId(){
        return appointmentId;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }

    public void createAppointment(Owner owner, Animal animal){

    }

public class MedicalRecord{
    private int recordID;
    private String diagnosis;
    private String treatment;
    private String checkUpDate;

    public void setRecordId(int recordID){
        this.recordID = recordID;
    }
    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }
    public void setTreatment(String treatment){
        this.treatment = treatment;
    }
    public void checkUpDate(String checkUpDate){
        this.checkUpDate = checkUpDate;
    }

    public int getRecordId(){
        return recordID;
    }
    public String getDiagnosis(){
        return diagnosis;
    }
    public String getTreatment(){
        return treatment;
    }
    public String getCheckUpDate(){
        return checkUpDate;
    }

    public void updateRecord(){

    }
}
   
class Veterinarian extends Person implements PetCareService{
    public void treatPet(Animal animal){
        System.out.println("Treating " + getName() + ", " + getAge() + " years old");
    }
    public void updateRecord(MedicalRecord record){
        System.out.println("Updating Record");
    }

    @Override
    public void feedPet(Animal animal){
        System.out.println("Feeding Pet");
    }
    @Override
    public void playWithPet(Animal animal){
        System.out.println("Playing with pet");
    }
    @Override
    public void groomPet(Animal animal){
        System.out.println("Grooming the pet");
    }

}
    
}

