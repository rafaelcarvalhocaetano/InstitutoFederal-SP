-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema tabelaifsp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema tabelaifsp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tabelaifsp` DEFAULT CHARACTER SET utf8 ;
USE `tabelaifsp` ;

-- -----------------------------------------------------
-- Table `tabelaifsp`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tabelaifsp`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(20) NOT NULL,
  `sobreNome` VARCHAR(45) NOT NULL,
  `dataNascimento` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
