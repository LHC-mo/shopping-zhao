package zhao.lhcmo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import zhao.lhcmo.pojo.Account;
import zhao.lhcmo.service.IAccountService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping
public class StartPage {
    @Resource
    private IAccountService accountService;
    @GetMapping("/test")
    @ResponseBody
    public List<Account> accountsAll(){
        return  accountService.list();
    }
    @PostMapping("/logging")
    public ModelAndView logging(@RequestParam("accountname") String acc,@RequestParam("pwd") String pwd, ModelAndView modelAndView ){

        Account login = accountService.login(acc,pwd);
        if(login!=null){
            modelAndView.setViewName("goods");
            modelAndView.addObject("account",login);
        } else {
            modelAndView.setViewName("login");
            modelAndView.addObject("msg","账户名或密码错误");
        }
        return modelAndView;
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
