/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapi;

/**
 *
 * @author Fragkenstein
 */
public class Dapi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdminDepartment admdept = new AdminDepartment();
        System.out.println("Welcome to " + admdept.getDepartmentName());
        System.out.println(admdept.getTodaysWork());
        System.out.println(admdept.getWorkDeadline());
        System.out.println(admdept.isTodayAHoliday());
        System.out.println("");
        System.out.println("");
        HrDepartment hrdept = new HrDepartment();
        System.out.println("Welcome to " + hrdept.getDepartmentName());
        System.out.println(hrdept.doActivity());
        System.out.println(hrdept.getTodaysWork());
        System.out.println(hrdept.getWorkDeadline());
        System.out.println(hrdept.isTodayAHoliday());
        System.out.println("");
        System.out.println("");
        TechDepartment techdept = new TechDepartment();
        System.out.println("Welcome to " + techdept.getDepartmentName());
        System.out.println(techdept.getTodaysWork());
        System.out.println(techdept.getWorkDeadline());
        System.out.println(techdept.getTechStackInformation());
        System.out.println(techdept.isTodayAHoliday());
    }

}
