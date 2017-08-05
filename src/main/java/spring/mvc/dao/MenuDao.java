package spring.mvc.dao;

import spring.mvc.Model.Menu;

import java.util.List;

public interface MenuDao {

    List listMenus();

    Menu findMenuById(Integer id);

    Menu findMenuByTitle(String title);
}
