CREATE TABLE menu (
  id    INT NOT NULL PRIMARY KEY,
  title VARCHAR(255)
);

CREATE TABLE menu_dish (
  id_menu INT NOT NULL ,
  id_dish INT NOT NULL,

  UNIQUE (id_dish, id_menu),

  FOREIGN KEY (id_menu) REFERENCES menu (id),
  FOREIGN KEY (id_dish) REFERENCES dish (id)
);

ALTER TABLE orders ADD COLUMN status VARCHAR(255);