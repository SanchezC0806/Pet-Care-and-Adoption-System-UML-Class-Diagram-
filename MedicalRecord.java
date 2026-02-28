public class MedicalRecord {

    private int recordID;
    private String diagnosis;
    private String treatment;
    private String checkupDate;

    public MedicalRecord(int recordID, String diagnosis, String treatment, String checkupDate) {
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.checkupDate = checkupDate;
    }

    public void updateRecord(String diagnosis, String treatment) {
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        System.out.println("Medical record updated.");
    }
}