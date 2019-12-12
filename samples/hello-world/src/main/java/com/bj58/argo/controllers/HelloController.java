package com.bj58.argo.controllers;

import com.bj58.argo.ActionResult;
import com.bj58.argo.annotations.Path;
import com.bj58.argo.controller.AbstractController;

public class HelloController extends AbstractController {

    @Path("hello/{name}")
    public ActionResult hello(String name) {

        return writer().write("hello %s", name);

    }
    
    @Path("test1")
    public ActionResult test1() {

        return view("test");

    }
    
    @Path("test2/{name}")
    public ActionResult test2(String name) {
    	
    	System.out.println(" ++++++++++++++++++++++++++ " + name + " ++++++++++++++++++++++++++ ");
    	
        return writer().write("test2 %s", name);

    }
    
}
