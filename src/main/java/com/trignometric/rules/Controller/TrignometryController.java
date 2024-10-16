package com.trignometric.rules.Controller;

import com.trignometric.rules.Ruler.TrignometricRuler;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrignometryController {

    @RequestMapping("/values")
    public String entry(){
        return "index";
    }

    @RequestMapping("/action")
    public String action(HttpServletRequest request, Model model){
        String trig = request.getParameter("select");
        double ang = Double.parseDouble(request.getParameter("id"));
        TrignometricRuler tg = new TrignometricRuler(trig, ang);
        double result = tg.valueAngle();
        model.addAttribute("message",result);
        return "action";
    }
}
