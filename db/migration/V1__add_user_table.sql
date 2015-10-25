CREATE TABLE IF NOT EXISTS `phm`.`User` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `employee_number` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `sex` VARCHAR(10) NOT NULL,
  `birthday` DATE NOT NULL,
  `hire_date` DATE NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `employee_number_UNIQUE` (`employee_number` ASC))
ENGINE = InnoDB
