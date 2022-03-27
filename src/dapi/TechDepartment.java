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


class TechDepartment extends SuperDepartment {

    @Override
    public String getDepartmentName() {

        return "Tech Department ";
    }

    @Override
    public String getTodaysWork() {

        return "Complete coding of module 1";
    }

    @Override
    public String getWorkDeadline() {

        return "Complete by EOD ";
    }

    public String getTechStackInformation() {

        return "core Java";
    }
 
}