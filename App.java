import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Patient> paitentList = new ArrayList<>();
        int on = 0;
        while (on == 0){
            System.out.println("Hello. What would you like to do today?");
            System.out.println("A) Add new paitent\nB) Edit paitent records\n C)View paitent records");
            String input = scan.nextLine();
    
            if (input.equals("A")){
                System.out.println("What is the paitents name?");
                String name = scan.nextLine();
                System.out.println("What is the date?");
                int date = scan.nextInt();
                System.out.println("What is the paitents DOB?");
                int DOB = scan.nextInt();
                System.out.println("What is the paitents age?");
                double age = scan.nextDouble();
                System.out.println("What is the paitents height?");
                double height = scan.nextDouble();
                System.out.println("What is the paitents weight?");
                double weight = scan.nextDouble();
                System.out.println("What is the paitents bloodtype?");
                String bloodtype = scan.nextLine();
                System.out.println("What is the paitents gender?");
                String gender = scan.nextLine();
                System.out.println("What is the paitents urgency on a scale of one to ten?");
                int urgency = scan.nextInt();
                System.out.println("What is the disease");
                String disease = scan.nextLine();
                System.out.println("What is the referall?");
                String referall = scan.nextLine();
                System.out.println("Notes: ");
                String notes = scan.nextLine();

                Patient p = new Patient();
                p.fillData(date, age, DOB, height, weight, urgency, bloodtype, name, gender, notes, referall, disease);
                paitentList.add(p);

                p.addNumber(paitentList.indexOf(p));

                int moreSymp = 0;

                while (moreSymp == 0){
                    System.out.println("Would you like to add a symptom?");
                    if (scan.nextLine().equals("yes")){
                        System.out.println("What is the symptom?");
                        p.addSymptom(scan.nextLine());
                        System.out.println("Are you done? Write 0 for no, any other number for yes.");
                        moreSymp = scan.nextInt();
                    }
                }

                int moreMeds = 0;

                while (moreMeds == 0){
                    System.out.println("Would you like to add more medicaions?");
                    if(scan.nextLine().equals("yes")){
                        System.out.println("What is the medication?");
                        p.addMedication(scan.nextLine());
                        System.out.println("Are you done? Write 0 for no, any other number for yes.");
                        moreMeds = scan.nextInt();
                    }
                }

                System.out.println("Here is your paitent report: ");
                System.out.println(p.toString());
                System.out.println("Are you done? Enter 0 for no, any other number for yes.");
                on = scan.nextInt();
            }

            System.out.println("Are you done? 0 for no, any other number for yes.");
            on = scan.nextInt();

            if (input.equals("B")){
                System.out.println("Which paitent would you like to modify?");
                String pname = scan.nextLine();

                for (int i = 0; i < paitentList.size(); i++){
                    if (paitentList.get(i).getName().equals(pname)){
                        int modyes = 0;
                        while (modyes == 0){
                            System.out.println("What would you like to modify?");

                            if (scan.nextLine().equals("date")){
                                System.out.println("Enter the date: ");
                                paitentList.get(i).changeDate(scan.nextInt());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("age")){
                                System.out.println("Enter the new age: ");
                                paitentList.get(i).changeAge(scan.nextDouble());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("height")){
                                System.out.println("Enter the new height: ");
                                paitentList.get(i).changeHeight(scan.nextDouble());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("weight")){
                                System.out.println("Enter new weight: ");
                                paitentList.get(i).changeWeight(scan.nextDouble());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("urgency")){
                                System.out.println("Enter the new urgency: ");
                                paitentList.get(i).changeUrgency(scan.nextInt());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("name")){
                                System.out.println("Enter the new name: ");
                                paitentList.get(i).changeName(scan.nextLine());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("gender")){
                                System.out.println("Enter the new gender: ");
                                paitentList.get(i).changeGender(scan.nextLine());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("notes")){
                                System.out.println("Enter new notes: ");
                                paitentList.get(i).changeNotes(scan.nextLine());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("referall")){
                                System.out.println("Enter a new referall: ");
                                paitentList.get(i).changeReferall(scan.nextLine());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("disease")){
                                System.out.println("Enter the new disease: ");
                                paitentList.get(i).changeDisease(scan.nextLine());
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("symptoms")){
                                int changeSymp = 0;
                                while (changeSymp == 0){
                                    System.out.println("Would you like to add or remove symptoms?");
                                    if (scan.nextLine().equals("add")){
                                        System.out.println("What is the symptom? ");
                                        paitentList.get(i).addSymptom(scan.nextLine());
                                        System.out.println("Are you done? 0 for no, any other number for yes.");
                                        changeSymp = scan.nextInt();
                                    }

                                    if (scan.nextLine().equals("remove")){
                                        System.out.println("Enter the number of the symptom you would like to remove: ");
                                        paitentList.get(i).removeSymptom(scan.nextInt());
                                        System.out.println("Are you done? 0 for no, any other number for yes.");
                                        changeSymp = scan.nextInt();
                                    }
                                }
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }

                            if (scan.nextLine().equals("medication")){
                                int changeMeds = 0;
                                while (changeMeds == 0){
                                    System.out.println("Would you like to add or remove meds?");
                                    if (scan.nextLine().equals("add")){
                                        System.out.println("What is the medication?");
                                        paitentList.get(i).addMedication(scan.nextLine());
                                        System.out.println("Are you done? 0 for no, any other number for yes.");
                                        changeMeds = scan.nextInt();
                                    }

                                    if (scan.nextLine().equals("remove")){
                                        System.out.println("The the number of the medication you would like to remove: ");
                                        paitentList.get(i).removeMedication(scan.nextInt());
                                        System.out.println("Are you done? 0 for no, any other number for yes.");
                                        changeMeds = scan.nextInt();
                                    }
                                }
                                System.out.println("Are you done? 0 for no, any other number for yes.");
                                modyes = scan.nextInt();
                            }
                        }
                    }
                }
             }

             System.out.println("Are you done? 0 for no, any other number for yes.");
             on = scan.nextInt();

             if (scan.nextLine().equals("C")){
                System.out.println("What is the name of the paitent whose records you would like to see?");
                String pname = scan.nextLine();

                for (int i = 0; i < paitentList.size(); i++){
                    if (paitentList.get(i).getName().equals(pname)){
                        paitentList.get(i).toString();
                    }
                }
             }

             System.out.println("Are you done? 0 for no, any other number for yes.");
             on = scan.nextInt();
        }
    }
}