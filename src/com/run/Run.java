package com.run;

import com.controller.Controller;
import com.model.Invoice;
import com.view.View;
import java.util.ArrayList;

public class Run {


    public static void main(String[] args) {
       new Controller(new View(), new ArrayList<Invoice>());
    }

    
}
