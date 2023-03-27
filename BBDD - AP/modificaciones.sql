ALTER TABLE persona MODIFY COLUMN sobre_mi varchar (550);
ALTER TABLE skills ADD COLUMN tipo varchar (10) NOT NULL;

SELECT * FROM skills;

DELETE from skills where ID=4; 

ALTER TABLE educacion ADD COLUMN lugar varchar (300) NOT NULL;
ALTER TABLE educacion MODIFY COLUMN fecha_fin date;

ALTER TABLE experiencia_laboral DROP COLUMN descripcion;
ALTER TABLE experiencia_laboral MODIFY COLUMN nombre_empresa varchar (500);

SELECT * FROM experiencia_laboral;

SELECT * FROM tipo_empleo;
