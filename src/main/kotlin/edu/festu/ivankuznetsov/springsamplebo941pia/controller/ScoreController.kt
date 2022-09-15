package edu.festu.ivankuznetsov.springsamplebo941pia.controller

import edu.festu.ivankuznetsov.springsamplebo941pia.service.ScoreService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 * контроллер оценок
 * */
@Controller
class ScoreController(private val scoreService: ScoreService) {

    //GET-запрос к корневой странице
    @GetMapping("/")
    fun getGreeting(model: Model):String{
        //модель хранит данные для страниц
        model.addAttribute("scores"
            ,scoreService.getAll())
        //нащвание страницы, которую нужно показать пользователю
        return "index"
    }
}
