package spring.mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.mvc.Model.Menu;
import spring.mvc.service.MenuService;

import java.util.List;

@RestController
public class MenuController {

    private MenuService menuService;

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public List menu() {
        return menuService.getAllMenus();
    }

    @RequestMapping(value = "/menu/{id}", method = RequestMethod.GET)
    public Menu menu(@PathVariable Integer id) {
        return menuService.findMenuById(id);
    }

    @RequestMapping(value = "/menu/search", method = RequestMethod.GET)
    public Menu employees(@RequestParam("title") String title) {
        return menuService.findMenuByTitle(title);
    }

    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }
}
