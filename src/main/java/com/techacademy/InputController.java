package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

//    @GetMapping("/input")
//    public String getinput() {
//        // input.htmlに画面遷移
//        return "input";
//    }
    @GetMapping("/input")
    public String getPrevious(@RequestParam ( name = "previous", required = false) String previous, Model model) {
     // クエリパラメータの値をModelに登録
        model.addAttribute("previous", previous);
     // input.htmlに画面遷移
        return "input";
    }

    @PostMapping("/output")
    public String postForm(@RequestParam("val") String val, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        // output.htmlに画面遷移
        return "output";
    }




}