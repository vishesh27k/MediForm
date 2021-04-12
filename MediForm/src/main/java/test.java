public class test {
    public static void main(String[] args) {
        Patient pat = new Patient();
        DatabaseInterface.insertPatient(pat);
    }
}
