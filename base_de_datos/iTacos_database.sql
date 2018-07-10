
create database iTacos;
use iTacos;
create table empleados(
    ID_emp  int     not null    primary key,
    nombre_emp  varchar(30)     not null,
    ape_pat_emp     varchar(30)     not null,
    ape_mat_emp     varchar(30)     not null);

describe empleados;

create table proveedores(
    ID_prov     int     not null    primary key,
    nombre_prov     varchar(30)     not null,
    numero_tel_prov     char(10)    not null);

describe proveedores;

create table ventas(
    codigo_venta    int     not null    primary key,
    fecha_venta     date    null,
    producto_venta  varchar(40)     not null);

describe ventas;

create table productos(
    codigo_produ    int     not null    primary key,
    nombre_produ    varchar(40)     not null,
    precio_produ    float(8)    not null,
    existencia  int     not null,
    contenido   float(20)   not null);
    
describe productos;

insert into proveedores (ID_prov, nombre_prov,numero_tel_prov) values
    (123, 'Coca Cola', 7751234565),
    (122, 'Tortilleria', 7751549863),
    (112, 'Manteca', 7755697899);
    
insert into peoductos (codigo_produ, nombre_prudu, precio_produ, existencia, contenido) values
    (12, 'Chaparrita de uva', 12, 10, 255),
    (11, 'Coca cola de lata', 13.5, 13, 355),
    (13, 'Jarrito de uva', 14, 12, 400);



create view 
inf_prove as
select nombre_prov, numero_tel_prov from proveedores;

select * from inf_prove;

