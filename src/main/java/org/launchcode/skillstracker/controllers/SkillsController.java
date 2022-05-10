package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
//    At localhost:8080, add text that states the three possible programming languages
//    someone could be working on. You need to have an h1 with the title “Skills
//    Tracker”, an h2, and an ol containing three programming languages of your
//        choosing.

    @RequestMapping("form")
    @ResponseBody
    public String showLanguages(@RequestParam String language1){
        String html =
                "<h1>Skills Tracker</h1>" +
                        "<h2></h2>" +
                        "<ol>" +
                        "<li>" + language1 + "</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>";
        return html;
    }

//    At localhost:8080/form, add a form that lets the user enter their name and choose their favorite,
//    second favorite, and third favorite programming languages on your list. Use select elements for each of the rankings.
//    Just as with the exercises, we will use @GetMapping()

    @GetMapping("form")
    @ResponseBody
    public String displayForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'coder'/>" +
                        "</br>" +
                        "<label for='languages'>First Favorite</label>" +
                        "<select name='language1' id='languages'>" +
                        "    <option value='java'>Java</option>" +
                        "    <option value='javascript'>JavaScript</option>" +
                        "    <option value='python'>Python</option>" +
                        "  </select>" +
                        "</br>" +

                        "<label for='languages'> Second Favorite</label>" +
                        "<select name='language2' id='languages'>" +
                        "    <option value='java'>Java</option>" +
                        "    <option value='javascript'>JavaScript</option>" +
                        "    <option value='python'>Python</option>" +
                        "  </select>" +
                        "</br>" +

                        "<label for='languages'>Third Favorite</label>" +
                        "<select name='language3' id='languages'>" +
                        "    <option value='java'>Java</option>" +
                        "    <option value='javascript'>JavaScript</option>" +
                        "    <option value='python'>Python</option>" +
                        "  </select>" +
                        "<input type = 'submit' value = 'Submit!' />" +
                        "</form>" +
                        "</body>" +
                "</html>";
        return html;
    }
//    value = "/form"
//    Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1 stating the user’s
//    name and an ol showing the three programming languages in the order they chose.


    @PostMapping("form")
    @ResponseBody
    public String updateLanguageList(@RequestParam String coder, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        return "<h1>" + coder + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }
}
