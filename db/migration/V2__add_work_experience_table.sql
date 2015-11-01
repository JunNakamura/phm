CREATE TABLE IF NOT EXISTS `phm`.`Work_Experience` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `abstract` VARCHAR(255) NOT NULL,
  `start_date` DATE NOT NULL,
  `end_date` DATE NOT NULL,
  `programing_language` VARCHAR(255) NULL,
  `rdbms` VARCHAR(255) NULL,
  `framework` VARCHAR(255) NULL,
  `ide` VARCHAR(255) NULL,
  `os` VARCHAR(255) NULL,
  `vcs` VARCHAR(45) NULL,
  `bts` VARCHAR(45) NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Work_Experience_User_idx` (`user_id` ASC),
  CONSTRAINT `fk_Work_Experience_User`
    FOREIGN KEY (`user_id`)
    REFERENCES `phm`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB