public class test {
    public static void main(String[] args) {
        Patient pat = new Patient();
        String patID = "6074fba91477040008b0c736";

        System.out.println(pat.getPatientID());

        pat = DatabaseInterface.findPatient(patID);

        System.out.println(pat.getName());

        if(!patID.equals(pat.getPatientID())) {
            System.out.println("Not equal");
        }

        System.out.println(pat.getPatientID());
        System.out.println(patID);

    }
}
