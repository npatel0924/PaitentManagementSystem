import java.util.ArrayList;

public class Patient {
    private int date;
    private int dob;
    private String name;
    private double age;
    private double height;
    private double weight;
    private String gender;
    private ArrayList<String> symptoms = new ArrayList<String>();
    private String referall;
    private String notes;
    private int urgency;
    private ArrayList<String> medications = new ArrayList<String>();
    private String disease;
    private String bloodtype;
    private int paitentnumber;

    public Patient(){
        date = 0;
        age = 0;
        dob = 0;
        height = 0;
        weight = 0;
        urgency = 0;

        name = null;
        gender = null;
        referall = null;
        notes = null;
        disease = null;
        bloodtype = null;
    }

    public void fillData (int d, double a, int bir, double h, double w, int u, String bld, String n, String gen, String no, String ref, String dis){
        date = d;
        age = a;
        dob = bir;
        height = h;
        weight = w;
        urgency = u;
        bloodtype = bld;
        name = n;
        gender = gen;
        notes = n;
        referall = ref;
        disease = dis;
    }

    public void changeDate (int d){
        date = d;
    }

    public void changeAge(double a){
        age = a;
    }

    public void changeHeight(double h){
        height = h;
    }

    public void changeWeight(double w){
        weight = w;
    }

    public void changeUrgency(int u){
        urgency = u;
    }

    public void changeName(String n){
        name = n;
    }

    public void changeGender(String g){
        gender = g;
    }

    public void changeNotes(String n){
        notes = n;
    }
    public void changeReferall(String r){
        referall = r;
    }
    public void changeDisease(String d){
        disease = d;
    }

    public void addSymptom(String s){
        symptoms.add(s);
    }

    public void removeSymptom(int n){
        int ne = n + 1;
        symptoms.remove(ne);
    }

    public void addMedication(String s){
        medications.add(s);
    }

    public void removeMedication(int n){
        int ne = n + 1;
        medications.remove(ne);
    }

    public void addNumber(int n){
        paitentnumber = n;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        String sympList = "";
        String medList = "";

        for (int i = 0; i < symptoms.size(); i++){
            sympList += symptoms.get(i) + ", ";
        }

        for (String medication : medications){
            medList += medication + ", ";
        }

        String output = "Name: " + name + "\nDate of Last Appointment" + date + "\nDOB: " + dob + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + "\nBloodtype: " + bloodtype + "\nGender: " + gender + "\nUrgency: " + urgency + "\nMedications: " + medList + "\nSymptoms: " + sympList + "\nDisease: " + disease + "\nReferall: " + referall + "\nNotes: " + notes + "\nPaitent Number: " + paitentnumber;
        return output;
    }
}