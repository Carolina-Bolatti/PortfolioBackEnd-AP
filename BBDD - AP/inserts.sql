INSERT INTO persona (id,nombre,apellido,fecha_nac,telefono,correo,sobre_mi,url_foto,estado_civil,lenguajes,nacionalidad,celular,direccion,url_banner,url_linkedin,url_ig,url_github) 
VALUES (1,'M. Carolina','Bolatti C.','1986-03-16','+54 9 4--- ----','bolatti.carolina@gmail.com',
'Me dicen ABI. Me gradué como Directora de Cine de animación. En 2016 finalicé “Programá tu futuro - Taller de Programación Inicial” de Ciudad de Buenos Aires. Actualmente terminé el CBC de la Licenciatura en Ciencias de la Computación y curso “Argentina Programa”, y, la Tecnicatura en Inteligencia Artificial y Ciencia de Datos en ISPC. Debido a que fui a un colegio bilingüe, poseo inglés avanzado. Todo lo descripto me dio mucha práctica en el área Audiovisual, en Comunicar, en Diseñar, en Coordinar, en Programar, etc.',
'https://drive.google.com/file/d/1scmA-6YmqzLiUC1XYiFedp4831s48S1W/view?usp=share_link','Soltera','Español Nativo e Inglés Avanzado','Argentina','+54 9 11 6846 3955','Virrey Loreto 1799, --- piso, CABA, Arg.','https://drive.google.com/file/d/1gCgYOepc_TccN_3gocGiTBcetbIoQ9nn/view?usp=share_link','https://www.linkedin.com/in/carolina-bolatti/','https://instagram.com/abibolatti?igshid=YjNmNGQ3MDY=','https://github.com/Carolina-Bolatti');

INSERT INTO proyectos (id,nombre,descripcion,url_logo,persona_id)
VALUES (1,'ARGENTINA PROGRAMA','MINISTERIO DE DESARROLLO PRODUCTIVO, BUENOS AIRES, ARGENTINA (2022) Gobstones, HTML, CSS, JavaScript, Ruby, Java, etc. Desarrollo de Porfolio Web Personal.','https://drive.google.com/file/d/1RcGjp0UBj1pyMuiZOePO3LvAcPlTPnlk/view?usp=share_link',1);

INSERT INTO proyectos (id,nombre,descripcion,url_logo,persona_id)
VALUES (2,'CODO A CODO 4.0','GOBIERNO DE CABA, BUENOS AIRES, ARGENTINA (2022) HTML, CSS, JavaScript, Python, etc. Desarrollo de Página Web Grupal.','https://drive.google.com/file/d/18rHxwKqp_TO9uCO6WJkVl-x6qZLBAEqf/view?usp=share_link',1);

INSERT INTO proyectos (id,nombre,descripcion,url_logo,persona_id)
VALUES (3,'ALURA ORACLE ONE NEXT EDUCATION','ORACLE, BUENOS AIRES, ARGENTINA (2022) HTML, CSS, JavaScript, Java, etc. Desarrollo de Página Web Personal.','https://drive.google.com/file/d/18zwkeY61OcYkqBhDP_LXZCx2Gv1I2XVx/view?usp=share_link',1);

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (1,'ADOBE CREATIVE','https://drive.google.com/file/d/1NWytSqEyKu2JiB5Y80kXz1wsfHIWChkz/view?usp=share_link',1,'HARD');

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (2,'REASON & CUBASE','https://drive.google.com/file/d/1bEsDqZdQKGFZt152kURpDETBbAiGNUij/view?usp=share_link',1,'HARD');

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (3,'OFFICE','https://drive.google.com/file/d/1bEsDqZdQKGFZt152kURpDETBbAiGNUij/view?usp=share_link',1,'HARD');

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (4,'HTML/CSS/PHP/JAVASCRIPT/JAVA/ PYTHON','https://drive.google.com/file/d/15OHaeUH5CyhIff0SM01RFIbsVmn0N7B0/view?usp=share_link',1,'HARD');

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (5,'CREATIVIDAD & EMPATIA','https://drive.google.com/file/d/1NWytSqEyKu2JiB5Y80kXz1wsfHIWChkz/view?usp=share_link',1,'SOFT');

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (6,'COLABORACION & ESPIRITU DE EQUIPO','https://drive.google.com/file/d/1NWytSqEyKu2JiB5Y80kXz1wsfHIWChkz/view?usp=share_link',1,'SOFT');

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (7,'MANEJO DEL TIEMPO & ETICA LABORAL','https://drive.google.com/file/d/1bEsDqZdQKGFZt152kURpDETBbAiGNUij/view?usp=share_link',1,'SOFT');

INSERT INTO skills (id,nombre_skill,url_porcentaje,persona_id,tipo)
VALUES (8,'ADAPTABILIDAD & COMUNICACION','https://drive.google.com/file/d/1bEsDqZdQKGFZt152kURpDETBbAiGNUij/view?usp=share_link',1,'SOFT');

INSERT INTO educacion (id,titulo_alcanzado,lugar,fecha_inicio,fecha_fin,esta_cursando,descripcion,url_foto,persona_id) 
VALUES (1,'CIENCIA DE DATOS E IA','INSTITUTO SUPERIOR POLITECNICO CÓRDOBA, CÓRDOBA, ARGENTINA','2022-04-01',null,true,'Materias Aprobadas: Programación I, Inglés I, Proyecto Integrador I, Sistemas de Comunicación, Lógica, Análisis Matemático, Álgebra, Base de Datos, Ética y Deontología Profesional','https://drive.google.com/file/d/1T7F0odq76pGxXWc-cVKCJiNllr5oYOLR/view?usp=share_link',1);

INSERT INTO educacion (id,titulo_alcanzado,lugar,fecha_inicio,fecha_fin,esta_cursando,descripcion,url_foto,persona_id) 
VALUES (2,'LICENCIATURA EN CIENCIAS DE LA COMPUTACIÓN','UNIVERSIDAD DE BUENOS AIRES, CABA, ARGENTINA','2021-03-15',null,true,'Materias Aprobadas: CBC','https://drive.google.com/file/d/1oL7oK2m4EISIJ1NWFKZ1t0Rzsxnp4wLb/view?usp=share_link',1);

INSERT INTO educacion (id,titulo_alcanzado,lugar,fecha_inicio,fecha_fin,esta_cursando,descripcion,url_foto,persona_id) 
VALUES (3,'DIRECTORA DE CINE DE ANIMACION','ESC. DE ARTE MULTIMEDIAL DA VINCI, CABA, ARGENTINA','2008-07-15','2011-12-30',false,'Egresada','https://drive.google.com/file/d/1npi4BPMYaTlivurm6W0K_BPSdmitiTBl/view?usp=share_link',1);

INSERT INTO educacion (id,titulo_alcanzado,lugar,fecha_inicio,fecha_fin,esta_cursando,descripcion,url_foto,persona_id) 
VALUES (4,'BACHILLERATO NACIONAL BILINGUE ESP. EN CIENCIAS Y LETRAS','COLEGIO LINCOLN, CABA, ARGENTINA','1998-03-15','2003-12-30',false,'Egresada','https://drive.google.com/file/d/10FSiXVBAHkDQ-jIE532Dee1rGJGUqWfV/view?usp=share_link',1);

INSERT INTO tipo_empleo (id,nombre_tipo)
VALUES (1,'MOTION GRAPHER');

INSERT INTO tipo_empleo (id,nombre_tipo)
VALUES (2,'COORDINADORA Y PRODUCTORA VFX');

INSERT INTO tipo_empleo (id,nombre_tipo)
VALUES (3,'COMPOSITORA VFX Jr.');

INSERT INTO tipo_empleo (id,nombre_tipo)
VALUES (4,'GUIONISTA, PRODUCTORA, DIRECTORA, EDITORA Y COMPOSITORA MUSICAL, FOTOMONTAJISTA / RETOCADORA DIGITAL, PROFESORA SUPLENTE / AYUDANTE, VIDEO EDITORA INTERINA');

INSERT INTO experiencia_laboral (id,nombre_empresa,es_trabajo_actual,fecha_inicio,fecha_fin,experiencia_laboralcol,url_foto_empresa,persona_id,tipo_empleo_id)
VALUES (1,'MOOCO, CABA, ARGENTINA',FALSE,'2021-01-01','2022-12-30','Para las cuentas de Disney, Paramount, Sony, NatGeo. Animación de Chyrons, Plates, Line-ups, etc.','https://drive.google.com/file/d/1x9Y7Gdn9KkTVkJl0zxo9pAvo91WL8yzD/view?usp=share_link',1,1);

INSERT INTO experiencia_laboral (id,nombre_empresa,es_trabajo_actual,fecha_inicio,fecha_fin,experiencia_laboralcol,url_foto_empresa,persona_id,tipo_empleo_id)
VALUES (2,'ONER VFX, BUENOS AIRES, ARGENTINA/INTERNACIONAL',FALSE,'2018-01-01','2019-12-30','Coordinadora vfx de “Resistance” de Jonathan Jakubowicz. Coordinadora vfx de “El Cuento de las Comadrejas” de J. J. Campanella','https://drive.google.com/file/d/1QOOWyGm_p92Uye7Q99GUbbzaFVdQe4Sx/view?usp=share_link',1,2);

INSERT INTO experiencia_laboral (id,nombre_empresa,es_trabajo_actual,fecha_inicio,fecha_fin,experiencia_laboralcol,url_foto_empresa,persona_id,tipo_empleo_id)
VALUES (3,'LA POSTA VFX, BUENOS AIRES, ARGENTINA',FALSE,'2017-01-01','2017-12-30','Post producción de pelicula india','https://drive.google.com/file/d/1Pm_Zi4rQz5CAS3rcuQMk3j3WLCkSk2fa/view?usp=share_link',1,3);

INSERT INTO experiencia_laboral (id,nombre_empresa,es_trabajo_actual,fecha_inicio,fecha_fin,experiencia_laboralcol,url_foto_empresa,persona_id,tipo_empleo_id)
VALUES (4,'PROYECTO PROPIO CORTOMETRAJE, BUENOS AIRES, ARGENTINA <br/> SAKE ARGENTINA, BUENOS AIRES, ARGENTINA <br/> LA SOCIEDAD POST, BUENOS AIRES, ARGENTINA <br/> ESCUELA DA VINCI, BUENOS AIRES, ARGENTINA <br/> STEINBRANDING, BUENOS AIRES, ARGENTINA',FALSE,'2012-01-01','2017-12-30','','https://drive.google.com/file/d/1uUR_3I7Hi6N6JXv4ScXqOuC8ZiVTMvtq/view?usp=share_link',1,4);