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

UPDATE persona
SET url_banner = 'assets/encabezado/imagenes/Banner_Carolina Bolatti_2022.jpg'
WHERE id=1;

UPDATE persona
SET url_foto = 'assets/barra/imagenes/Caro Bolatti png.png'
WHERE id=1;

UPDATE experiencia_laboral
SET url_foto_empresa = 'assets/experiencia/imagenes/MOOCO_v01.jpg'
WHERE id=1;

UPDATE experiencia_laboral
SET url_foto_empresa = 'assets/experiencia/imagenes/LA POSTA_v01.jpg'
WHERE id=3;

UPDATE experiencia_laboral
SET url_foto_empresa = 'assets/experiencia/imagenes/varios logos.JPG'
WHERE id=4;


UPDATE educacion
SET url_foto = 'assets/educacion/imagenes/ISPC ICONO.JPG'
WHERE id=1;

UPDATE educacion
SET url_foto = 'assets/educacion/imagenes/UBA.jpg'
WHERE id=2;

UPDATE educacion
SET url_foto = 'assets/educacion/imagenes/DAVINCI_v01.jpg'
WHERE id=3;

UPDATE educacion
SET url_foto = 'assets/educacion/imagenes/Lincoln.png'
WHERE id=4;

UPDATE skills
SET url_porcentaje = 'assets/skills/imagenes/LOAD 100.png'
WHERE id in (1, 5, 6);

UPDATE skills
SET url_porcentaje = 'assets/skills/imagenes/LOAD 75.png'
WHERE id in (2, 3, 7, 8);

UPDATE skills
SET url_porcentaje = 'assets/skills/imagenes/LOAD 12.png'
WHERE id in (4);

UPDATE proyectos
SET url_logo = 'assets/proyectos/imagenes/ICONO ESTADO.JPG'
WHERE id in (1);

UPDATE proyectos
SET url_logo = 'assets/proyectos/imagenes/Codo a Codo icono.png'
WHERE id in (2);

UPDATE proyectos
SET url_logo = 'assets/proyectos/imagenes/ALURA ONE ORACLE.png'
WHERE id in (3);


commit;
