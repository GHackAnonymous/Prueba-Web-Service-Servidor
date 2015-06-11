-- ------------------
--    Creo la tabla -
-- ------------------
CREATE TABLE `webserviceprueba1server`.`ventas` (
    `id_Ventas` INT NOT NULL AUTO_INCREMENT,
    `Producto` VARCHAR(45) NOT NULL,
    `Precio` VARCHAR(45),
    `Cantidad` VARCHAR(50)
  PRIMARY KEY (`id_Ventas`));

-- ----------------------------
--    Inserto datos de prueba -
-- ----------------------------

INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('Valvula','3','3');

INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('Motor','400','1');

INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('Ruedas','40','4');

INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('Carroceria','300','1');


INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('Cardan','100','2');


INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('Cablestrante','70','2');


INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('Caja Reductora','140','1');


INSERT INTO `webserviceprueba1server`.`ventas`(`Producto`,`Precio`,`Cantidad`)
VALUES('RaspBerry Pi','50','3');
