package com.He.controller;

import com.He.controller.ItemsController;
import com.He.pojo.Items;
import com.He.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
   private ItemsService itemsService;

    @RequestMapping("/list")
    public String findAll(Model model) {
        List<Items> list = itemsService.findAll();
        model.addAttribute("items",list);
        return "items";
    }

    @RequestMapping("/save")
    public String save(Items items) {
        itemsService.save(items);
        return "redirect:/items/list";
    }
}
