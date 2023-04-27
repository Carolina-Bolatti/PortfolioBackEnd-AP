-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bo4u5pptyxcx2tmmzkoy
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bo4u5pptyxcx2tmmzkoy
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS bo4u5pptyxcx2tmmzkoy DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema bo4u5pptyxcx2tmmzkoy
-- -----------------------------------------------------
USE bo4u5pptyxcx2tmmzkoy ;

-- -----------------------------------------------------
-- Table bo4u5pptyxcx2tmmzkoy.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS bo4u5pptyxcx2tmmzkoy.`persona` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `fecha_nac` DATE NOT NULL,
  `telefono` VARCHAR(20) NULL,
  `correo` VARCHAR(45) NULL,
  `sobre_mi` VARCHAR(550) NULL,
  `url_foto` VARCHAR(200) NULL,
  `estado_civil` VARCHAR(20) NULL,
  `lenguajes` VARCHAR(45) NULL,
  `nacionalidad` VARCHAR(45) NOT NULL,
  `celular` VARCHAR(20) NULL,
  `direccion` VARCHAR(45) NULL,
  `url_banner` VARCHAR(200) NULL,
  `url_linkedin` VARCHAR(200) NULL,
  `url_ig` VARCHAR(200) NULL,
  `url_github` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table bo4u5pptyxcx2tmmzkoy.`tipo_empleo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS bo4u5pptyxcx2tmmzkoy.`tipo_empleo` (
  `id` INT NOT NULL,
  `nombre_tipo` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table bo4u5pptyxcx2tmmzkoy.`experiencia_laboral`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS bo4u5pptyxcx2tmmzkoy.`experiencia_laboral` (
  `id` INT NOT NULL,
  `nombre_empresa` VARCHAR(500) NOT NULL,
  `es_trabajo_actual` TINYINT NULL,
  `fecha_inicio` DATE NULL,
  `fecha_fin` DATE NULL,
  `experiencia_laboralcol` VARCHAR(500) NULL,
  `url_foto_empresa` VARCHAR(200) NULL,
  `persona_id` INT NOT NULL,
  `tipo_empleo_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_experiencia_laboral_persona_idx` (`persona_id` ASC) VISIBLE,
  INDEX `fk_experiencia_laboral_tipo_empleo1_idx` (`tipo_empleo_id` ASC) VISIBLE,
  CONSTRAINT `fk_experiencia_laboral_persona`
    FOREIGN KEY (`persona_id`)
    REFERENCES bo4u5pptyxcx2tmmzkoy.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_experiencia_laboral_tipo_empleo1`
    FOREIGN KEY (`tipo_empleo_id`)
    REFERENCES bo4u5pptyxcx2tmmzkoy.`tipo_empleo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table bo4u5pptyxcx2tmmzkoy.`educacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS bo4u5pptyxcx2tmmzkoy.`educacion` (
  `id` INT NOT NULL,
  `titulo_alcanzado` VARCHAR(200) NOT NULL,
  `descripcion` VARCHAR(300) NOT NULL,
  `lugar` VARCHAR(300) NOT NULL,
  `fecha_inicio` DATE NOT NULL,
  `fecha_fin` DATE NULL,
  `esta_cursando` TINYINT NOT NULL,
  `url_foto` VARCHAR(200) NULL,
  `persona_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_educacion_persona1_idx` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `fk_educacion_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES bo4u5pptyxcx2tmmzkoy.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table bo4u5pptyxcx2tmmzkoy.`skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS bo4u5pptyxcx2tmmzkoy.`skills` (
  `id` INT NOT NULL,
  `tipo` VARCHAR(10) NOT NULL,
  `nombre_skill` VARCHAR(100) NOT NULL,
  `url_porcentaje` VARCHAR(200) NOT NULL,
  `persona_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_skills_persona1_idx` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `fk_skills_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES bo4u5pptyxcx2tmmzkoy.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table bo4u5pptyxcx2tmmzkoy.`proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS bo4u5pptyxcx2tmmzkoy.`proyectos` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `url_logo` VARCHAR(200) NOT NULL,
  `persona_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_proyectos_persona1_idx` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `fk_proyectos_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES bo4u5pptyxcx2tmmzkoy.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
