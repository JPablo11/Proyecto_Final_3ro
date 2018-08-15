
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


/*Triggers*/
create trigger salenproductos
after insert on ventas
for each row
update productos set existencia=existencia-new.existence where codigo_produ = new.folio;

insert into productos (codigo_produ, nombre_produ, precio_produ, existencia, contenido, folio_produ) values
    (1, 'atun pescador', 12.5, 49, 115, 1),
    (2, 'frijol la granja', 15.2, 50, 22, 2),
    (3, 'leche de vaca', 10, 200, 11, 3),
    (4, 'aceite el girasol', 98.5, 99, 12, 4);

select * from productos;

insert into ventas (folio, fecha_venta, producto_venta, existence, precio) values
    (1, now(), 'atun pescador', 1, 12.5);
    
select * from productos;
/*Este trigger funciona para restarle la cantidad a la existencia del producto cuando uno es vendido.*/
create trigger aumenta_precio
after insert on ventas
for each row
update productos set precio_produ=precio_produ+new.precio where codigo_produ = new.folio;

insert into ventas (folio, fecha_venta, producto_venta, existence, precio) values
    (2, now(), 'frijol la granja', 1, 10);
    
select * from productos;
/*Este trigger funciona para aumentarle al precio de un producto.*/

/*Vistas*/
create view 
inf_prove as
select nombre_prov, nombre_produ from proveedores, productos where folio_prov = folio_produ;

select * from inf_prove;
/*Esta vista muestra la información del proveedor, junto del producto que éste provee.*/

create view
cantidad_producto as 
select existencia , nombre_produ, nombre_prov, numero_tel_prov from productos, proveedores where folio_prov = folio_produ;

select * from cantidad_producto; 
/*Esta vista muestra la existencia de los productos junto con el nombre del proveedor por si se necesita llamar por carencia de éstos.*/

/*Delimitadores*/
Delimiter //
create procedure productos_cantidad()
begin
declare producto int;
select count(*) from productos into producto;
select producto;
end

//
Delimiter ;

call productos_cantidad();
/*Este procedimiento cuenta el número de productos existentes*/

Delimiter //
create procedure nombre_produ_buscar(
    in letra char(2),
    out producto int)
begin
select * from productos where nombre_produ like letra;
select count(*) into producto from productos where nombre_produ like letra;
end
//
Delimiter ;

call nombre_produ_buscar('a%', @cantidad);

select @cantidad;

/*Este procedimiento busca algún producto por la inicial de su nombre.*/








