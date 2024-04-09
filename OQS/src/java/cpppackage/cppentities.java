/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpppackage;
import java.sql.*;

/**
 *
 * @author Kommal Kaushal
 */
public class cppentities {
    
    private int sno;
    private String quest;
    private String opn1;
    private String opn2;
    private String opn3;
    private String opn4;
    private String ans;

    public cppentities(int sno, String quest, String opn1, String opn2, String opn3, String opn4, String ans) {
        this.sno = sno;
        this.quest = quest;
        this.opn1 = opn1;
        this.opn2 = opn2;
        this.opn3 = opn3;
        this.opn4 = opn4;
        this.ans = ans;
    }

    public cppentities() {
    }
    
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getOpn1() {
        return opn1;
    }

    public void setOpn1(String opn1) {
        this.opn1 = opn1;
    }

    public String getOpn2() {
        return opn2;
    }

    public void setOpn2(String opn2) {
        this.opn2 = opn2;
    }

    public String getOpn3() {
        return opn3;
    }

    public void setOpn3(String opn3) {
        this.opn3 = opn3;
    }

    public String getOpn4() {
        return opn4;
    }

    public void setOpn4(String opn4) {
        this.opn4 = opn4;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }


    
    
    
}
