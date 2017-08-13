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

INSERT INTO orders VALUES (1, 1, 1, 'Sun Aug 13 19:07:40 EEST 2017', 'OPEN');
INSERT INTO orders VALUES (2, 1, 2, 'Sun Aug 12 19:08:40 EEST 2017', 'CLOSE');
INSERT INTO orders VALUES (3, 2, 3, 'Sun Aug 13 19:09:40 EEST 2017', 'OPEN');
INSERT INTO orders VALUES (4, 2, 4, 'Sun Aug 12 19:10:40 EEST 2017', 'CLOSE');

INSERT INTO dish_to_order VALUES (1, 1);
INSERT INTO dish_to_order VALUES (1, 2);
INSERT INTO dish_to_order VALUES (2, 3);
INSERT INTO dish_to_order VALUES (2, 4);
INSERT INTO dish_to_order VALUES (3, 1);
INSERT INTO dish_to_order VALUES (3, 3);
INSERT INTO dish_to_order VALUES (4, 2);
INSERT INTO dish_to_order VALUES (4, 4);

INSERT INTO menu VALUES (1, 'breakfast');
INSERT INTO menu VALUES (2, 'lunch');

INSERT INTO menu_dish VALUES (1, 1);
INSERT INTO menu_dish VALUES (1, 2);
INSERT INTO menu_dish VALUES (1, 3);
INSERT INTO menu_dish VALUES (2, 2);
INSERT INTO menu_dish VALUES (2, 3);
INSERT INTO menu_dish VALUES (2, 4);