<!DOCTYPE html>
<html>
    <head>
        <title>B&uacute;squeda</title>
        <style>
            table {margin: auto; width: 908px;}
            table, tr, th, td {border : 1px solid black; background-color: burlywood}
        </style>
    </head>
    <body>
        <?php
            $bd_host = "127.0.0.1";
            $bd_user = "root";
            $bd_pass = "";
            $bd_name = "itacos";
            
            $search=$_POST['busqueda'];
        
            $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name);
            if (mysqli_connect_errno())
            {
                printf("ERROR: %u - %s", mysqli_connect_errno(), mysqli_connect_errno());
                exit();
            }
            mysqli_set_charset($conectar, "utf8");
            $consultar="SELECT * FROM productos WHERE nombre_produ LIKE '%$search%' ";
            
            if ($resultado = mysqli_query($conectar, $consultar))
            {
                printf("<table><tr><th>C&oacute;digo</th> <th>Nombre</th> <th>Precio</th> <th>Existencia</th><th>Contenido</th></tr>");
                while ($fila = mysqli_fetch_row($resultado))
                {
                    printf ("<tr><td>%d</td> <td>%s</td> <td>%d</td> <td>%d</td> <td>%d</td></tr>", $fila[0], $fila[1], $fila[2], $fila[3], $fila[4]);
                }
                mysqli_free_result($resultado);
            }
            mysqli_close($conectar);
        ?>
         <center><a href="Sesion.php">
        <img src="Images/Inicio.png" width="20%" height="20%">
        </a>
        </center>
        <body background="Images/bg_slider.jpg" >
        </body>
    </body>
</html>