use DBCalido;

insert into tblUsuario values
(01,'Carlos','Perez',34345432,'CarloPez',30,'http://onaajnask.jpg','1145551212','HOMBRE','Carlosperez@calido.com','Aguero,234,Recoleta,CABA,Buenos Aires','Argentina','SI','carlo345','USUARIO'),
(02,'Daniela','Pelada',27899123,'DaniPela',30,'http://oklkmcas.jpg','1133125434','MUJER','danielapelada@calido.com','Carlos Calvo,2342,Almagro,CABA,Buenos Aires','Argentina','SI','danipela1','USUARIO'),
(03,'Ricardo','Ricachon',29001002,'RicaRica',30,'http://ovdmksjn.jpg','1176106112','HOMBRE','ricardoricachon@calido.com','Jujuy,4312,Recoleta,CABA,Buenos Aires','Argentina','SI','ricarica69','USUARIO'),
(04,'Claudia','Schifer',31899221,'ClauSchi',30,'http://onassxuhs.jpg','1129290110','MUJER','claudiaschifer@calido.com','Mariano,893,Balvanera,CABA,Buenos Aires','Argentina','SI','claudia6969','USUARIO'),
(05,'Jimena','Romanez',29100231,'JimeMaz',30,'http://aeixnakxl.jpg','1123235114','MUJER','jimenaromanez@calido.com','Figueroa,680,Almagro,CABA,Buenos Aires','Argentina','SI','jimena680','USUARIO'),
(06,'Eduardo','Sanabria',31232142,'EduaSana',30,'http://uenkasmx.jpg','1125018080','HOMBRE','eduardosanabria@calido.com','Balmiro,440,Caballito,CABA,Buenos Aires','Argentina','SI','eduard6654','USUARIO'),
(07,'Marina','Colmenarez',32330121,'MariCo',30,'http://ysnzxmoa.jpg','1120018910','MUJER','marinacolmenarez@calido.com','Aguero,234,Recoleta,CABA,Buenos Aires','Argentina','SI','marina221','USUARIO'),
(08,'Gerardo','Jimenez',27999313,'GerarJime',30,'http://eszmskz.jpg','1139917878','HOMBRE','gerardojimenez@calido.com','La plata,2234,Caballito,CABA,Buenos Aires','Argentina','SI','gerar989','USUARIO'),
(09,'Carmen','Ricardi',28991321,'CarRica',30,'http://wnmmskxnak.jpg','112990101','MUJER','carmenricardi@calido.com','Guemes,1189,Monserrat,CABA,Buenos Aires','Argentina','SI','carmen4421','USUARIO'),
(10,'Juan','Urrutia',33088532,'JuanUrru',30,'http://mllkmxnz.jpg','1121134301','HOMBRE','juanurrutia@calido.com','Villa,3232,Recoleta,CABA,Buenos Aires','Argentina','SI','juan1212','USUARIO'),
(11,'Jenny','Martinez',3122003,'JennMartin',30,'http://asnkkjnzx.jpg','1132458998','MUJER','jennymartinez@calido.com','Alueta,4420,Belgrano,CABA,Buenos Aires','Argentina','SI','jenny432','USUARIO');

insert into tblGrupo values
(01,'A','prueba prueba prueba'),
(02,'A','prueba prueba prueba'),
(03,'C','prueba prueba prueba'),
(04,'A','prueba prueba prueba'),
(05,'D','prueba prueba prueba'),
(06,'B','prueba prueba prueba'),
(07,'C','prueba prueba prueba'),
(08,'B','prueba prueba prueba'),
(09,'D','prueba prueba prueba'),
(10,'C','prueba prueba prueba');

insert into tblMensaje values
(01,'prueba prueba prueba',03,31/10/2019),
(02,'prueba prueba prueba',07,09/08/2019),
(03,'prueba prueba prueba',08,21/09/2019),
(04,'prueba prueba prueba',10,07/09/2019),
(05,'prueba prueba prueba',01,19/10/2019),
(06,'prueba prueba prueba',05,20/10/2019),
(07,'prueba prueba prueba',04,15/10/2019),
(08,'prueba prueba prueba',02,22/07/2019),
(09,'prueba prueba prueba',09,12/09/2019),
(10,'prueba prueba prueba',06,05/08/2019);

insert into tblEvento values
(01,31/09/2019,31/10/2019,'Evidencia nr1','Es una Cosa','notificar'),
(02,01/09/2019,01/10/2019,'Evidencia nr11','Es otra cosa','notificar'),
(03,22/08/2019,22/09/2019,'Evidencia nr2','Asi que metele ficha','notificar'),
(04,19/09/2019,19/10/2019,'Evidencia nr3','Haz la prueba','notificar'),
(05,06/09/2019,07/09/2019,'Evidencia nr4','Metele La ficha','notificar'),
(06,31/09/2019,05/10/2019,'Evidencia nr5','Ejercita La mente','notificar'),
(07,22/09/2019,22/10/2019,'Evidencia nr6','Crea Estrategia','notificar'),
(08,17/09/2019,17/10/2019,'Evidencia nr7','Llena Algo','notificar'),
(09,31/06/2019,31/07/2019,'Evidencia nr8','Aprende mas','notificar'),
(10,31/07/2019,31/08/2019,'Evidencia nr9','juega con la mente','notificar'),
(11,21/05/2019,20/06/2019,'Evidencia nr10','Una fecha','notificar');

insert into tblTipoE values
(01,'hermano','RELACIONAL','momento compartido con'),
(02,'Carro','PROFESIONAL','momento compartido con'),
(03,'Vuelo avion','PERSONAL','momento compartido con'),
(04,'Comida en casa','RELACIONAL','momento compartido con'),
(05,'Nuevo empleo','PROFESIONAL','momento compartido con'),
(06,'Salto en bongi','PERSONAL','momento compartido con'),
(07,'papa','RELACIONAL','momento compartido con'),
(08,'Trabajo','PROFESIONAL','momento compartido con'),
(09,'Bailar Salsa','PERSONAL','momento compartido con'),
(10,'Progreso','PROFESIONAL','momento compartido con'),
(11,'Papa','PERSONAL','momento compartido con');

insert into tblEvidencia values
(01,27/10/2019,04,'caramelo','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',05),
(02,23/10/2019,05,'vajilla','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',02),
(03,14/10/2019,09,'foto','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',01),
(04,18/10/2019,02,'muestra','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',03),
(05,08/10/2019,03,'aguacate','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',04),
(06,09/10/2019,07,'carro','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',07),
(07,22/10/2019,08,'camino','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',09),
(08,12/10/2019,10,'barco','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',06),
(09,11/10/2019,01,'lucha','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',10),
(10,09/10/2019,06,'destructo','lo que quedo de ver','http://masmoxm.gly','http://ionsczx.jpg',02);

insert into tblDonacion values
(01,12/09/2019,03,33,'Pasta','pasta larga'),
(02,12/09/2019,04,22,'azuca','azucar de 1 kg'),
(03,12/09/2019,02,15,'galletas surtidas','galletas dulces'),
(04,12/09/2019,10,20,'budin','budines de chocolate y dulce de leche'),
(05,12/09/2019,08,24,'chocolate','barras de chocolate'),
(06,12/09/2019,06,10,'salsa pasta','frascos de 750gr de salsa'),
(07,12/09/2019,07,14,'galletas','packs de 5'),
(08,12/09/2019,09,08,'bocadillos','bocadillos dulces'),
(09,12/09/2019,05,04,'Atun','lomo de atun enlatado'),
(10,12/09/2019,01,25,'Arroz','arroz de 1kg');

insert into tblElemento values
(01,11/09/2019,01,'Sombrero','...',22),
(02,08/09/2019,02,'Atril','...',10),
(03,05/09/2019,03,'Pancarta','...',12),
(04,13/09/2019,05,'Libro','...',08),
(05,09/09/2019,09,'Chaqueta','...',05),
(06,11/09/2019,06,'Cortina','...',12),
(07,10/09/2019,04,'Llaves','...',21),
(08,07/09/2019,06,'Espada','...',03),
(09,11/09/2019,07,'Botella','...',18),
(10,15/09/2019,10,'Mesa','...',02);

insert into tblDonante values
(01,10,'20345129812','Peluqueria mana','peluqueriamana@gmail.com','1127275671','Aguero,436,Recoleta,CABA,Buenos Aires'),
(02,02,'20345129812','Rotiseria Jose','joseroti@gmail.com','1154309382','Rivadavia,5120,Caballito,CABA,Buenos Aires'),
(03,09,'20345129812','Supermercado Hojin','superhoji@gmail.com','1123118812','Carlos Calvo,920,Recoleta,CABA,Buenos Aires'),
(04,03,'20345129812','Rotiseria La mama','mamarota@gmail.com','1143438535','Aguero,756,Recoleta,CABA,Buenos Aires'),
(05,04,'20345129812','Don Regalon','donregalon@gmail.com','1130168801','Pichincha,873,Recoleta,CABA,Buenos Aires'),
(06,07,'20345129812','Colmenrares y asociados','colmado@gmail.com','1142660505','Volares,7893,San Nicolas,CABA,Buenos Aires'),
(07,08,'20345129812','Ferreteria Cachivache','ferrecachivache@gmail.com','1153344321','Flores,1436,Flores,CABA,Buenos Aires'),
(08,01,'20345129812','Mercado Las Pulgas','mercadopulgas@gmail.com','1127270511','Acoyte,276,Caballito,CABA,Buenos Aires'),
(09,05,'20298543319','Conglomerado ricancia','conglomerado@gmail.com','1130116767','Peron,234,Monserrat,CABA,Buenos Aires'),
(10,06,'20225127155','Perolito y escarlata','perolitoyescarlata@gmail.com','1144202011','Castro Barro,1245,Almagro,CABA,Buenos Aires');

insert into tblComunitario values
(01,'A',03,01,27/09/2019,'Floripondio','...'),
(02,'B',04,07,11/09/2019,'Golmedas','...'),
(03,'A',05,08,15/09/2019,'Romesclatura','...'),
(04,'B',06,10,03/09/2019,'Clarividencia','...'),
(05,'A',07,09,11/09/2019,'AguacateNight','...'),
(06,'B',08,06,08/09/2019,'RocaRoca','...'),
(07,'B',09,02,23/09/2019,'Melcaremar','...'),
(08,'A',02,03,24/09/2019,'nomesclatura','...'),
(09,'B',01,04,12/09/2019,'sobrevida','...'),
(10,'A',10,05,30/09/2019,'estudios','...');