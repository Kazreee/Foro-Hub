create table topicos (
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(500) not null,
    status tinyint default 0 not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    fecha_creacion datetime not null,

    primary key(id)
)