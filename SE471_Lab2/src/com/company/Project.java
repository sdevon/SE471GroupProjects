package com.company;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String projectName;
    private int status;
    private ArrayList<String> projectsTasks = new ArrayList();

    Project(String projectName, int status){
        this.projectName = projectName;
        this.status = status;
    }

    public String addTask(String s){
        projectsTasks.add(s);
        return s;
    }

    public List getTask(){
        return projectsTasks;
    }

}
