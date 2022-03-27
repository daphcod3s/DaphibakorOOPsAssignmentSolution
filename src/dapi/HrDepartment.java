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
class HrDepartment extends SuperDepartment {

    @Override
    public String getDepartmentName() {

        return "Hr Department ";
    }

    @Override
    public String getTodaysWork() {

        return "Fill today’s worksheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline() {

        return "Complete by EOD ";
    }

    public String doActivity() {

        return "team Lunch";
    }
   
}

