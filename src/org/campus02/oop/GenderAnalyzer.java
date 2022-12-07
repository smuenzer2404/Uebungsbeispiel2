package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer {

    public void analyze(){
        int countM = 0;
        int countW = 0;
        int heightM = 0;
        int heightW = 0;
        for (Person person: super.getPersons()) {
            if (person.getGender() == 'M'){
                countM ++;
                heightM += person.getSize();
            }
            if (person.getGender() == 'W'){
                countW ++;
                heightW += person.getSize();
            }
            System.out.println("In der Liste existieren " + countM + "Männer mit einer durchschnittlichen Körpergröße von " + (heightM / countM));
            System.out.println("In der Liste existieren " + countW + "Frauen mit einer durchschnittlichen Körpergröße von " + (heightW / countW));

        }
    }
}
