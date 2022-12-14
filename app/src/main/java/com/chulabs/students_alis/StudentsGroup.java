package com.chulabs.students_alis;/* Tom
 */

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    private String number;
    private String facultyName;
    private int educationLevel;
    private boolean contractExistsFlg;
    private boolean privilageExistsFlg;

    public StudentsGroup(String number, String facultyName, int educationLevel, boolean contractExistsFlg, boolean privilageExistsFlg){
        this.number = number;
        this.facultyName = facultyName;
        this.educationLevel = educationLevel;
        this.contractExistsFlg = contractExistsFlg;
        this.privilageExistsFlg = privilageExistsFlg;
    }

    public String getNumber() {
        return number;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getEducationLevel(){
        return educationLevel;
    }

    public boolean isContractExistsFlg(){
        return contractExistsFlg;
    }

    public boolean isPrivilageExistsFlg(){ return privilageExistsFlg;
    }
    private final static ArrayList<StudentsGroup> groups = new ArrayList<StudentsGroup>(
            Arrays.asList(
                    new StudentsGroup("ІПЗ19-1", "Інноваційнх технологій", 0, true, false),
                    new StudentsGroup("ІПЗ19-2", "Інноваційнх технологій", 0, true, false),
                    new StudentsGroup("К19-1", "Інноваційнх технологій", 0, true, false),
                    new StudentsGroup("К19-2", "Інноваційнх технологій", 0, true, false),
                    new StudentsGroup("ІПЗ22м", "Інноваційнх технологій", 1, false, true)
            )
    );

    public static StudentsGroup getGroup(String groupNumber) {
        for(StudentsGroup g: groups) {
            if (g.getNumber().equals(groupNumber)) {
                return g;
            }
        }
        return null;
    }
}
