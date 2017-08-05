package spring.mvc.service;

import spring.mvc.Model.Menu;
import spring.mvc.dao.MenuDao;

import javax.transaction.Transactional;
import java.util.List;

public class MenuService {

    private MenuDao menuDao;

    @Transactional
    public List getAllMenus(){
        return menuDao.listMenus();
    }

    @Transactional
    public Menu findMenuById(Integer id){
        return menuDao.findMenuById(id);
    }

    @Transactional
    public Menu findMenuByTitle(String title){
        return menuDao.findMenuByTitle(title);
    }

    public void setMenuDao(MenuDao menuDao) {
        this.menuDao = menuDao;
    }
}
