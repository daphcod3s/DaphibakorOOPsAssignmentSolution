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
class AdminDepartment extends SuperDepartment {

    @Override
    public String getDepartmentName() {

        return "Admin Department ";
    }

    @Override
    public String getTodaysWork() {

        return "Complete your documents Submission";
    }

    @Override
    public String getWorkDeadline() {

        return "Complete by EOD ";
    }

 
     
}