drop database if exists DBCalido;
create database DBCalido;
use DBCalido;

create table tblUsuario(
		idUsuario int not null auto_increment,
        nombre varchar (200) not null,
        apellido varchar (200) not null,
        dni int not null,
        foto varchar (200) not null,
        telefono varchar(50) not null,
        usuario varchar (200) not null,
        edad int not null,
        sexo enum ('MUJER','HOMBRE','OTRO'),
		correo varchar (100) not null,
        direccion varchar (200) not null,
        nacionalidad varchar(100) not null,
        reside enum ('SI','NO'),
        clave varchar (20) not null,
        perfil enum ('ADMINISTRADOR','PROGRAMADOR','TESTER','USUARIO'),
        primary key(idusuario));

create table tblGrupo(
		idGrupo int not null auto_increment,
        Small char(1) not null,
        comentario varchar(300) not null,
        primary key(idGrupo));
			        
create table tblMensaje(
		idMensaje int not null auto_increment,
        mensaje varchar (300) not null,
        usuarioId int not null,
        fecha date not null,
        primary key(idMensaje),
        foreign key(usuarioId) references tblUsuario(idUsuario)
        on delete cascade);

create table tblEvento(
		idEvento int not null auto_increment,
        fechaDesde date not null,
        fechaHasta date not null,
        nombre varchar (200) not null,
        descripcion varchar (300) not null,
        notificar varchar(200) not null,
        primary key(idEvento));

create table tblTipoE(
		idTipoE int not null auto_increment,
        nombre varchar(100) not null,
        tipo enum ('RELACIONAL','PROFESIONAL','PERSONAL'),
        descripcion varchar(300) not null,
        primary key(idTipoE));
        
create table tblEvidencia(
		idEvidencia int not null auto_increment,
        fecha date not null,
        usuarioId int not null,
        nombre varchar (100) not null,
        descripcion varchar(300) not null,
        url varchar(600) not null,
        foto varchar(600) not null,
        TipoEId int not null,
        primary key(idEvidencia),
        foreign key(TipoEId) references tblTipoE(idTipoE)
        on delete cascade);
        
create table tblDonacion(
		idDonacion int not null auto_increment,
        fecha date not null,
        usuarioId int not null,
		cantidad int not null,
        producto varchar (100) not null,
        descripcion varchar(300) not null,
        primary key (idDonacion),
        foreign key(usuarioId) references tblUsuario(idUsuario)
        on delete cascade);

create table tblElemento(
		idElemento int not null auto_increment,
        fecha date not null,
        usuarioId int not null,
        nombre varchar(100) not null,
        descripcion varchar(300) not null,
        cantidad int not null,
        primary key(idElemento),
        foreign key(usuarioId) references tblUsuario(idUsuario)
        on delete cascade);

create table tblDonante(
		idDonante int not null auto_increment,
        donacionId int not null,
        identificador varchar(100) not null,
        razonSocial varchar (200) not null,
		correo varchar(200) not null,
        telefono varchar(100) not null,
        direccion varchar(300) not null,
        primary key(idDonante),
        foreign key(donacionId) references tblDonacion(idDonacion));

create table tblComunitario(
		idComunitario int not null auto_increment,
        equipo char(1) not null,
        elementoId int not null,
        donanteId int not null,
        fecha date not null,
        evento varchar(100) not null,
        descripcion varchar(300) not null,
        primary key(idComunitario),
        foreign key(elementoId) references tblElemento(idElemento),
        foreign key(donanteId) references tblDonante(idDonante)
        on delete cascade);
        
        