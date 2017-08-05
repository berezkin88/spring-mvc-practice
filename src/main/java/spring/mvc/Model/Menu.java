package spring.mvc.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @ManyToMany
    @JoinTable(name = "menu_dish",
            joinColumns = @JoinColumn(name = "id_menu"),
            inverseJoinColumns = @JoinColumn(name = "id_dish"))
    private List<Dish> dishes;

    public Menu() {
    }

    public Menu(String title, List<Dish> dishes) {
        this.title = title;
        this.dishes = dishes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
